package com.hcl.inventory;

import java.util.Scanner;

public class PlaceOrderMain {
	public static void main(String[] args) {
		String StockId;
		int qtyOrd;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter StockId ");
		
		StockId=sc.nextLine();
		System.out.println("Enter QuantityOrder ");
		qtyOrd=sc.nextInt();
		System.out.println(StockBal.placeOrderBal(StockId, qtyOrd));
	}

}



