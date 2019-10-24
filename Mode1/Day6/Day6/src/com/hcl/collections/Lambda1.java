package com.hcl.collections;

import java.util.ArrayList;
import java.util.List;

public class Lambda1 {
	public static void main(String[] args) {
		List<Integer> lstData=new ArrayList<Integer>();
		lstData.add(new Integer(45));
		lstData.add(new Integer(67));
		lstData.add(new Integer(4));
		lstData.add(new Integer(7));
		lstData.add(new Integer(16));
		int sum;
		lstData.forEach(p -> {
			if(p >= 15) {
				System.out.println(p);
			}
			
		});
	}

}
