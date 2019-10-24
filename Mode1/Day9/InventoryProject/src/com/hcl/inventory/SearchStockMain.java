package com.hcl.inventory;

import java.util.Scanner;



public class SearchStockMain {
	public static void main(String[] args) {
		String StockId;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter StockId" );
		StockId=sc.nextLine();
		Stock objstock=StockBal.searchStockIdBal(StockId);
		if(objstock!=null) {
			System.out.println("StockId "+objstock.getStockId());
			System.out.println("ItemName "+objstock.getItemName());
			System.out.println("Price "+objstock.getPrice());
			System.out.println("QuantityAvail "+objstock.getQuantityAvail());
			
		}else{
			System.out.println("stock not found...");
		}
		
	}

}



	