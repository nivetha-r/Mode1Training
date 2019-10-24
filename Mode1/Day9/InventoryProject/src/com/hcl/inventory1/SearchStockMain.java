package com.hcl.inventory1;

import java.util.Scanner;

public class SearchStockMain {
	public static void main(String[] args) {
		String stockid;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Stock Id ");
		stockid = sc.nextLine();
		Inventory objInventory = InventoryBAL.searchInventoryBal(stockid);
		if(objInventory != null) {
			System.out.println("Item name " + objInventory.getItemname());
			System.out.println("Price " + objInventory.getPrice());
			System.out.println("Quantity Available " + objInventory.getQuantityavail());
		} else {
			System.out.println("**Record not found**");
		}
		
	}


}
