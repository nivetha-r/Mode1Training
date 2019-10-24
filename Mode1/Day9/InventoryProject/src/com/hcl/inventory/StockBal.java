package com.hcl.inventory;
public class StockBal {
	public static int generateOrderIdBal(){
		return new StockDao().generateOrderIdDao();
		
	}
	public static String placeOrderBal(String StockId,int qtyOrd){
		return new StockDao().placeOrderDao(StockId, qtyOrd);
		
	}
	public static Stock searchStockIdBal(String StockId) {
		return new StockDao().searchStockDao(StockId);
		
	}
	public static String addStockIdBal(Stock objstock) {
		return new StockDao().addStockIdDao(objstock);
		
		
	}
	public static String generateStockIdBal(){
		return new StockDao().generateStockIdDao();
		
	}

}
