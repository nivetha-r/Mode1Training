package com.hcl.collections;

import java.util.ArrayList;
import java.util.List;

public class GenListInt {
	public static void main(String[] args) {
		List<Integer> lstData=new ArrayList<Integer>();
		lstData.add(new Integer(45));
		lstData.add(new Integer(67));
		lstData.add(new Integer(4));
		lstData.add(new Integer(87));
		lstData.add(new Integer(16));
		int sum=0;
		for (Integer i : lstData) {
			sum+=i;
			
		}
		System.out.println("sum is "+sum);
	}

}
