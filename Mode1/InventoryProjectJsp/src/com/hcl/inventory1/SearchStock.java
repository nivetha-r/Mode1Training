package com.hcl.inventory1;


public class SearchStock {
	private String stockid;

	
	public String getStockid() {
		return stockid;
	}


	public void setStockid(String stockid) {
		this.stockid = stockid;
	}


	public Inventory searchStock() {
		return InventoryBAL.searchInventoryBal(stockid);
	}
}
