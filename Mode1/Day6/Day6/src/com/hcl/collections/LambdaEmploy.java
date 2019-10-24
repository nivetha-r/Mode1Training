package com.hcl.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LambdaEmploy {


	public static void main(String[] args) {
		List<Employ>list=new ArrayList<Employ>();
		list.add(new Employ(1,"Nive",6678));
		list.add(new Employ(2,"nisha",877868));
		list.add(new Employ(3,"Darshni",7669));
		
		Collections.sort(list,(e1,e2) -> {
			return e1.name.compareTo(e2.name);
		});
		for (Employ employ1 : list) {
			System.out.println(employ1);
			
		}
		 Collections.sort(list,(p1,p2) -> {
			 return(int) (p1.basic-p2.basic);
			 
		 });
		 System.out.println("sort by basic wise"); {
			 System.out.println("-----------");
		for (Employ employ : list) {
			
		} {
				System.out.println(list);
			
			
		};
	}
	}
}


