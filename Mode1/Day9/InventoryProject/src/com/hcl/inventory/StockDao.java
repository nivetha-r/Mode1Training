package com.hcl.inventory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
public class StockDao {
	PreparedStatement pst;
	Connection con;
	public int generateOrderIdDao(){
		con=DaoConnection.getConnection();
		int OrderId=0;
		String cmd=" select case when max(OrderId) is null "+ " then 1 else max(OrderId)+1 end OrderId "+" from Stock ";
		try {
			pst=con.prepareStatement(cmd);
			ResultSet rs=pst.executeQuery();
			rs.next();
			OrderId=rs.getInt("OrderId");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return OrderId;
	}
	
	public String placeOrderDao(String StockId,int qtyOrd) {
		con=DaoConnection.getConnection();
		String result=" ";
         Stock objstock=searchStockDao(StockId);
		if(objstock!=null) {
			double  QuantityAvail=objstock.getQuantityAvail();
				if( QuantityAvail-qtyOrd >=0){ 
				String cmd="update stock set qtyAvail=qtyAvail-? where StockId=?";
				try {
					pst=con.prepareStatement(cmd);
				
					pst.setDouble(1, qtyOrd);
					pst.setString(2, StockId);
					pst.executeUpdate();
					int OrderId=generateOrderIdDao();
					cmd="Insert into Orders(OrderId,StockId,qtyOrd," + "billAmt) values(?,?,?,?)";
					pst=con.prepareStatement(cmd);
					pst.setInt(1,OrderId);
					pst.setString(2, StockId);
					pst.setDouble(3, qtyOrd);
					double total=qtyOrd*objstock.getPrice();
					pst.setDouble(4, total);
					pst.executeUpdate();
					cmd="update amount set Gamt=Gamt+?";
					pst=con.prepareStatement(cmd);
					pst.setDouble(1, total);
					pst.executeUpdate();
					result="order Placed Successfully";
					} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					result = e.getMessage();
				}
			}else{
				result="Insufficient item..";
		}
		}else {
			result="Not found";
		}
		return result;
		}
	public Stock searchStockDao(String StockId) {
		con=DaoConnection.getConnection();
		String cmd=" select * from stock where StockId=?";
		Stock objstock=null;
		try {
			pst=con.prepareStatement(cmd);
			pst.setString(1, StockId);
			ResultSet rs=pst.executeQuery();
			if(rs.next()){
				objstock=new Stock();
				objstock.setStockId(rs.getString("StockId"));
				objstock.setItemName(rs.getString("ItemName"));
				objstock.setPrice(rs.getDouble("Price"));
				objstock.setQuantityAvail(rs.getInt("QuantityAvail"));
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return objstock;
		
		
	}
	public String addStockIdDao(Stock objstock) {
		con=DaoConnection.getConnection();
		String cmd="Insert into Stock(StockId,ItemName,Price,QuantityAvail)values(?,?,?,?)";
		String result=" ";
		try {
			pst=con.prepareStatement(cmd);
			pst.setString(1, objstock.getStockId());
			pst.setString(2, objstock.getItemName());
			pst.setDouble(3, objstock.getPrice());
			pst.setInt(4, objstock.getQuantityAvail());
		    pst.executeUpdate();;
			result="Stock added successfully..";
		   } catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			result=e.getMessage();
		}
		return result;
		
	}
	public String generateStockIdDao(){
		con=DaoConnection.getConnection();
		String StockId;
		String cmd=" select max(StockId) sid from stock";
		String stid=" ";
		try {
			PreparedStatement pst=con.prepareStatement(cmd);
			ResultSet rs=pst.executeQuery();
			rs.next();
			stid=rs.getString("Sid");
			int id=Integer.parseInt(stid.substring(1));
			id++;
			if(id >= 1 && id <= 9) {
				stid="S00"+id;
			}
			if(id >= 10 && id <= 99) {
				stid="S0"+id;
			}
			if(id >= 100 && id <= 999) {
				stid="S"+id;
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return stid;
	}
	

}