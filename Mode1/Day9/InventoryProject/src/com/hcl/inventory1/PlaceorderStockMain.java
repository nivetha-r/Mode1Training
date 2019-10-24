package com.hcl.inventory1;

import java.util.Scanner;

public class PlaceorderStockMain {
	public static void main(String[] args) {
		String stockid;
		int quantityorder;
		int orderid = 0;
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter stockid ");
		stockid = sc.nextLine();
		System.out.println("Enter quantity order ");
		quantityorder = sc.nextInt();
	
		System.out.println(InventoryBAL.placeorderInventoryBal(stockid, quantityorder));
	}

}
