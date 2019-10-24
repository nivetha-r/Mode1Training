package com.hcl.inventory1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class InventoryDAO {
	PreparedStatement pst;
	Connection con;
	
	public String placeorderStockIdDao(String stockid,int quantityorder) {
		con = DaoConnection.getConnection();
		String result = " ";
		Inventory objInventory = searchStockIdDao(stockid);
		if(objInventory != null) {
			int quantityavail = objInventory.getQuantityavail();
			if (quantityavail - quantityorder >= 0) {
				String cmd = " update stock set quantityavail = quantityavail - ? " + " where stockid = ? ";
				try {
					pst = con.prepareStatement(cmd); 
					pst.setInt(1, quantityorder);
					pst.setString(2, stockid);
					pst.executeUpdate();
					int orderid = generateOrderIdDao();
					cmd = " Insert into orders(orderid,stockid,quantityorder," + "billamt) values(?,?,?,?) ";
					pst = con.prepareStatement(cmd);
					pst.setInt(1, orderid);
					pst.setString(2, stockid);
					pst.setInt(3, quantityorder);
					double total = quantityorder*objInventory.getPrice();
					pst.setDouble(4, total);
					pst.executeUpdate();
					cmd = " update amount set gamt = gamt+?";
					pst = con.prepareStatement(cmd);
					pst.setDouble(1, total);
					pst.executeUpdate();
					result = "Order placed";
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					result = e.getMessage();
				}
			} else {
				result = "Insufficient order";
			} }
			else {
				result = "Stockid not found";
			
			}
			return result;
		}
    public Inventory searchStockIdDao(String stockid) {
    	con = DaoConnection.getConnection();
		String cmd = " select * from stock where stockid=? ";
		Inventory objInventory = null;
		try {
			pst = con.prepareStatement(cmd);
			pst.setString(1, stockid);
			ResultSet rs = pst.executeQuery();
			if (rs.next()) {
				objInventory = new Inventory();
				objInventory.setItemname(rs.getString("itemname"));
				objInventory.setPrice(rs.getInt("price"));
				objInventory.setQuantityavail(rs.getInt("quantityavail"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return objInventory;
	}
	
	public String createStockIdDao(Inventory objInventory) {
		con = DaoConnection.getConnection();
		String cmd = "Insert into stock(stockid,itemname, "
				      + "price,quantityavail) values(?,?,?,?) ";
		String result = " ";
		try {
			pst = con.prepareStatement(cmd);
			pst.setString(1, objInventory.getStockid());
			pst.setString(2, objInventory.getItemname());
			pst.setDouble(3, objInventory.getPrice());
			pst.setInt(4, objInventory.getQuantityavail());
			pst.executeUpdate();
			result = "Account created successfully..";
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			result = e.getMessage();
		}
		return result;
	}
	public int generateOrderIdDao() {
		con = DaoConnection.getConnection();
		int orid = 0;
		String cmd = "select case when max(orderid) IS NULL " 
		               + "THEN 1 else MAX(orderid)+1 END orid from orders";
		try {
			pst = con.prepareStatement(cmd);
			ResultSet rs = pst.executeQuery();
			rs.next();
			orid = rs.getInt("orid");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return orid;
	}
		
	
	
	public String generateStockIdDao() {
		String stid = " ";
		Connection con = DaoConnection.getConnection();
		String cmd = " select max(stockid) sid from stock";
		try {
			PreparedStatement pst = con.prepareStatement(cmd);
			ResultSet rs = pst.executeQuery();
			rs.next();
			
			stid = rs.getString("sid");
			int id = Integer.parseInt(stid.substring(1));
			id++;
			
			String formatted = String.format("%03d", id);
			stid = "S"+formatted;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return stid;

}
}


