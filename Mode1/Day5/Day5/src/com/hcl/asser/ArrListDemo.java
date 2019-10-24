package com.hcl.asser;

import java.util.ArrayList;
import java.util.List;

public class ArrListDemo {
	public static void main(String[] args) {
		List lstNames=new ArrayList();
		lstNames.add("nivetha");
		lstNames.add("nisha");
		lstNames.add("nithish");
		lstNames.add("Rajamani");
		lstNames.add("Soundari");
		System.out.println("Names are ");
		
		//for (Object object : lstNames) {
			//System.out.println(object);
			
		//}
		System.out.println("JDK 1.8");
		lstNames.forEach(System.out::println);
		/*edit*/
		lstNames.set(2,"nisha");
		System.out.println("list after update");
		lstNames.forEach(System.out::println);
		System.out.println("list afer removing my index");
		lstNames.remove(1);
		lstNames.forEach(System.out::println);
		lstNames.remove("Rajamani");
		System.out.println("list of removing my object");
		lstNames.forEach(System.out::println);
		System.out.println("4th element"+lstNames.get(3));
		
	}

}
