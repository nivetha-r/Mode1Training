package com.hcl.inventory1;



public class CreateStock {
	private String stockId;
	private String itemName;
	private double price;
	private int quantityAvail;
	
	public String getStockId() {
		return stockId;
	}

	public void setStockId(String stockId) {
		this.stockId = stockId;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantityAvail() {
		return quantityAvail;
	}

	public void setQuantityAvail(int quantityAvail) {
		this.quantityAvail = quantityAvail;
	}

	public String createStock() {
		Inventory objInventory=new Inventory();
		String stockId=InventoryBAL.generateInventoryBal();
		objInventory.setStockid(stockId);
		objInventory.setItemname(itemName);
		objInventory.setPrice(price);
		objInventory.setQuantityavail(quantityAvail);
		
		return InventoryBAL.createInventoryBal(objInventory);
	}
}
