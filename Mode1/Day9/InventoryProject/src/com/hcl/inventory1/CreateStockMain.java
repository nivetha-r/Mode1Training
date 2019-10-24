package com.hcl.inventory1;

import java.util.Scanner;

public class CreateStockMain {
	public static void main(String[] args) {
		String stockid = InventoryBAL.generateInventoryBal();
		Inventory objInventory = new Inventory();
		objInventory.setStockid(stockid);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Item name ");
		objInventory.setItemname(sc.nextLine());
		System.out.println("Enter price ");
		objInventory.setPrice(Integer.parseInt(sc.nextLine()));
		System.out.println("Enter quantity available ");
		objInventory.setQuantityavail(Integer.parseInt(sc.nextLine()));
		System.out.println(InventoryBAL.createInventoryBal(objInventory));
		
	}



}
