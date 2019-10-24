package com.hcl.inventory;

import java.util.Scanner;
public class AddStockMain {
	public static void main(String[] args) {
		String StockId=StockBal.generateStockIdBal();
		//System.out.println("StockId");
		Stock objstock=new Stock();
		objstock.setStockId(StockId);
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter StockId ");
		objstock.setStockId(sc.nextLine());
		System.out.println("Enter ItemName ");
		objstock.setItemName(sc.nextLine());
		System.out.println("Enter Price ");
		objstock.setPrice(sc.nextDouble());
		System.out.println("Enter QuantityAvail ");
		objstock.setQuantityAvail(sc.nextInt());
		System.out.println(StockBal.addStockIdBal(objstock));
		
		
	}
}





