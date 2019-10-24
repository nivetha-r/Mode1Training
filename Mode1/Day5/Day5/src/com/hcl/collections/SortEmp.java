package com.hcl.collections;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortEmp {
	public static void main(String[] args) {
		SortedSet s=new TreeSet();
		s.add(new Emp(1,"Nivetha",56567));
		s.add(new Emp(2,"Charu",5667));
		s.add(new Emp(3,"Kavitha",6567));
		s.add(new Emp(4,"Savitha",5657));
		s.add(new Emp(5,"Haritha",5656));
		System.out.println("sorted data");
		s.forEach(System.out::println);
	}

}
