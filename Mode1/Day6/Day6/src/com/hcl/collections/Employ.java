package com.hcl.collections;

public class Employ {
	int empno;
	String name;
	double basic;
	@Override
	public String toString() {
		return "employ [empno=" + empno + ", name=" + name + ", basic=" + basic + "]";
	}
	public Employ(int empno, String name, double basic) {
		super();
		this.empno = empno;
		this.name = name;
		this.basic = basic;
	}
	
	

}
