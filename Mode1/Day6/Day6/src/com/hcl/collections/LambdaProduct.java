package com.hcl.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LambdaProduct {
	public static void main(String[] args) {
		 List<Product> list=new ArrayList<Product>();
		 
		 list.add(new Product(1,"Hp laptop",658895));
		 list.add(new Product(2,"vivo",87689));
		 list.add(new Product(3,"Honor",8768));
		//Collections.sort(list,(p1,p2) -> {
		// return p1.name.compareTo(p2.name);
		// });
		// for (Product product : list) {
			
			// System.out.println(product);
			 
			 Collections.sort(list,(p1,p2) -> {
				 return(int) (p1.price-p2.price);
				 
			 });
			 System.out.println("sort by price wise"); {
				 System.out.println("-----------");
				 for (Product product : list) {
					System.out.println(product);
				}
			 };
		}
	}




