package com.hcl.collections;

import java.util.ArrayList;
import java.util.List;

public class ArrEmploy {
	public static void main(String[] args) {
		List lstEmploy=new ArrayList();
		lstEmploy.add(new Employ(1,"Nivetha",6577.9));
		lstEmploy.add(new Employ(2,"Nisha",67674.9));
		lstEmploy.add(new Employ(3,"Nithish",65457.9));
		lstEmploy.add(new Employ(4,"rajamani",65667.9));
		lstEmploy.add(new Employ(5,"soundari",65788.9));
		for(Object ob : lstEmploy){
			Employ e=(Employ) ob;
			System.out.println(e);
		}
		
	}

}
