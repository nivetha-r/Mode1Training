package com.hcl.collections;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class SortEmploy {
	public static void main(String[] args) {
		Comparator<Employ> c=new NameComparator();
		Set<Employ> setEmploy=new TreeSet <Employ > (c);
		setEmploy.add(new Employ(1,"Nive",5678));
		setEmploy.add(new Employ(2,"Nisha",5654));
		setEmploy.add(new Employ(3,"Nithi",98387));
		setEmploy.add(new Employ(4,"Rajamani",895765));
		setEmploy.add(new Employ(5,"soundari",2334));
		System.out.println("Employ List ");
		setEmploy.forEach(System.out::println);
	}

}
