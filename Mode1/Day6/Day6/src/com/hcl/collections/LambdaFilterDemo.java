package com.hcl.collections;

import java.util.ArrayList;
import java.util.List;

public class LambdaFilterDemo {
	public static void main(String[] args) {
		List<Product> list=new ArrayList<Product>();
		list.add(new Product(1,"Hp laptop",658895));
		 list.add(new Product(2,"vivo",87689));
		 list.add(new Product(3,"Honor",8768));
		 
		 list.stream().filter(p -> p.price >=20000).forEach(x -> {
			 System.out.println(x);
		 });
		 System.out.println("names starts with H");
		 list.stream().filter(p -> p.name.startsWith("H")).forEach(x -> {
			 
			 System.out.println(x);
		 });
		 Product minP=list.stream().max((p1,p2)-> p1.price >=p2.price  ? -1:1).get();
		 System.out.println("min price record");
		 System.out.println(minP);
	}

}
