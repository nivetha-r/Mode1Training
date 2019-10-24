package com.hcl.inventory1;

public class PlaceOrder {
	private String stockid;
	private int quantityorder;
	
public String getStockid() {
		return stockid;
	}

	public void setStockid(String stockid) {
		this.stockid = stockid;
	}

	public int getQuantityorder() {
		return quantityorder;
	}

	public void setQuantityorder(int quantityorder) {
		this.quantityorder = quantityorder;
	}

public String placeOrder() {
	return InventoryBAL.placeorderInventoryBal(stockid,quantityorder);
}
}
