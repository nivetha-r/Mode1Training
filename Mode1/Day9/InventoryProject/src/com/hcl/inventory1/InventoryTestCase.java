package com.hcl.inventory1;

import static org.junit.Assert.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.junit.Test;

public class InventoryTestCase {
	@Test
	public void testPlaceOrder() {
		assertEquals("Order placed", InventoryBAL.placeorderInventoryBal("S003", 2));
		assertEquals("Insufficient order", InventoryBAL.placeorderInventoryBal("S003", 23));
		assertEquals("Stockid not found", InventoryBAL.placeorderInventoryBal("A001", 1));
	}
	@Test
	public void testSearchStockId() {
		assertNotNull(InventoryBAL.searchInventoryBal("S003"));
		assertNull(InventoryBAL.searchInventoryBal("A002"));
	}
	@Test
	public void testCreateStockId() {
		Inventory objInventory = new Inventory();
		String stockid= InventoryBAL.generateInventoryBal() ;
		objInventory.setStockid(stockid);
		objInventory.setItemname("keyboard");
		objInventory.setPrice(535);
		objInventory.setQuantityavail(23);
		assertEquals("Account created successfully..", InventoryBAL.createInventoryBal(objInventory));
	}
	@Test
	public void testGenerateOrderId() {
		Connection con = DaoConnection.getConnection();
		int orid = 0;
		String cmd = "select case when max(orderid) IS NULL " 
		               + "THEN 1 else MAX(orderid)+1 END orid from orders";
		try {
			PreparedStatement pst = con.prepareStatement(cmd);
			ResultSet rs = pst.executeQuery();
			rs.next();
			orid = rs.getInt("orid");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertEquals(orid, InventoryBAL.generateOrderIdBal(orid));
	}
	@Test
	public void testDaoConnection() {
		assertNotNull(DaoConnection.getConnection());
	}
	@Test
	public void generateStockId() {
		String stid = null;
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
		assertEquals(stid,InventoryBAL.generateInventoryBal());
	}
	@Test
	public void testGettersSetters() {
		Inventory objInventory = new Inventory();
		objInventory.setStockid("S001");
		objInventory.setItemname("Speakers");
		objInventory.setPrice(55677);
		objInventory.setQuantityavail(21);
		
		assertEquals("S001", objInventory.getStockid());
		assertEquals("Speakers", objInventory.getItemname());
		assertEquals(55677, objInventory.getPrice(),0.00);
		assertEquals(21, objInventory.getQuantityavail());
	}

}
