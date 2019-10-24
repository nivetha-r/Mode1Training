package com.hcl.collections;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class MapGenDemo {
	public static void main(String[] args) {
		Map<Integer,String> m=new Hashtable<Integer,String> ();
		m.put(1, "Nivetha");
		m.put(2, "prasanth");
		m.put(3, "aaradhya");
		m.put(4, "arjun");
		
		int key;
		String result;
		System.out.println("Enter key");
	Scanner sc=new Scanner(System.in);
	key=sc.nextInt();
	result=m.getOrDefault(key, "not found");
	System.out.println(result);
	}

}
