package com.hcl.collections;

import java.util.ArrayList;
import java.util.List;

public class LamdaLimit {
	public static void main(String[] args) {
		List<Integer> lstData=new ArrayList<Integer>();
		lstData.add(new Integer(45));
		lstData.add(new Integer(67));
		lstData.add(new Integer(4));
		lstData.add(new Integer(7));
		lstData.add(new Integer(16));
		lstData.stream().limit(3).forEach(p -> {
			System.out.println(p);
		});
		System.out.println("after skipping 2 records");
		lstData.stream().skip(2).forEach(p -> {
			System.out.println(p);
		});
		System.out.println("Filter data");
		lstData.stream().filter(p -> p>15).forEach(x -> {
			System.out.println(x);
			
		});
		
	}

}
