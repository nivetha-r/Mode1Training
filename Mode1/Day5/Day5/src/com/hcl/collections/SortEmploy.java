package com.hcl.collections;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortEmploy {
	public static void main(String[] args) {
		Comparator c=new BasicComparator();
		SortedSet s=new TreeSet();
		s.add(new Employ(1,"Nivetha",6565767));
		s.add(new Employ(2,"Abi",527542));
		s.add(new Employ(3,"Hari",6562));
		s.add(new Employ(4,"Kishore",845645));
		s.add(new Employ(5,"Teju",656588));
		s.add(new Employ(6,"Charu",62547));
		System.out.println("Sorted data");
		s.forEach(System.out::println);
	}

}
