package com.hcl.collections;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetDemo {
	public static void main(String[] args) {
		SortedSet s=new TreeSet();
		s.add("Nivetha");
		s.add("Abinaya");
		s.add("Pichu");
		s.add("Rajamani");
		System.out.println("Sorted data");
		s.forEach(System.out::println);

}
}
