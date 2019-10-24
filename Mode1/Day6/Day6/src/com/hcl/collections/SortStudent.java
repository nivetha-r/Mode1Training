package com.hcl.collections;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class SortStudent {
	public static void main(String[] args) {
		Comparator<Student> c=new CityComparator();
		Set<Student> setStudent=new TreeSet <Student > (c);
		setStudent.add(new Student("Nive","Nisha","vellore",87.8));
		setStudent.add(new Student("Nive","Nisha","vellore",87.8));
		setStudent.add(new Student("Nive","Nisha","vellore",87.8));
		setStudent.add(new Student("Nive","Nisha","vellore",87.8));
		setStudent.add(new Student("Nive","Nisha","vellore",87.8));
		System.out.println("Student List ");
		setStudent.forEach(System.out::println);
	}

}
