package com.hcl.collections;

import java.util.ArrayList;
import java.util.List;

public class ListReduceDemo {
	public static void main(String[] args) {
		List<Integer> lst=new ArrayList<Integer>()	;
		lst.add(1);
		lst.add(2);
		lst.add(3);
		lst.add(4);
		lst.add(5);
		int sum=lst.stream().reduce(10,(e1,e2) -> e1+e2); 
	System.out.println(sum);
	}

}
