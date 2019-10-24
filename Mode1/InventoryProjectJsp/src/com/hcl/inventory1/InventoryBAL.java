package com.hcl.inventory1;

public class InventoryBAL {
	public static int generateOrderIdBal(int orderid) {
		return new InventoryDAO().generateOrderIdDao();
	}
	public static String placeorderInventoryBal(String stockid,int QtyOrd) {
		return new InventoryDAO().placeorderStockIdDao(stockid, QtyOrd);
	}
	public static Inventory searchInventoryBal(String stockid) {
		return new InventoryDAO().searchStockIdDao(stockid);
	}
	public static String generateInventoryBal() {
		return new InventoryDAO().generateStockIdDao();
	}
	public static String createInventoryBal(Inventory objInventory) {
		return new InventoryDAO().createStockIdDao(objInventory);
	}



}
