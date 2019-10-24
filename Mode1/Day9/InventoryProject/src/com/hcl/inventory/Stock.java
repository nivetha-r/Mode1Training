package com.hcl.inventory;

public class Stock {
	private String StockId;
	private String ItemName;
	private double Price;
	private int QuantityAvail;
	public String getStockId() {
		return StockId;
	}
	public void setStockId(String stockId) {
		StockId = stockId;
	}
	public String getItemName() {
		return ItemName;
	}
	public void setItemName(String itemName) {
		ItemName = itemName;
	}
	public double getPrice() {
		return Price;
	}
	public void setPrice(double price) {
		Price = price;
	}
	public int getQuantityAvail() {
		return  QuantityAvail;
	}
	public void setQuantityAvail(int QuantityAvail) {
		QuantityAvail=  QuantityAvail;
	}
	
}
