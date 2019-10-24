package com.hcl.collections;

import java.util.ArrayList;
import java.util.List;

public class GenEmploy {
	public static void main(String[] args) {
		List<Employ> lstEmploy=new ArrayList<Employ>();
		lstEmploy.add(new Employ(1,"Nive",87756));
		lstEmploy.add(new Employ(2,"nisha",2527));
		lstEmploy.add(new Employ(3,"Raja",5566));
		lstEmploy.add(new Employ(4,"soundari",4454));
		lstEmploy.add(new Employ(5,"Nithish",8363));
		System.out.println("employ List");
		lstEmploy.forEach(System.out::println);
	}

}
