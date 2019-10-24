package com.hcl.practice;

class Employ {
	int empno;
	String name;
	double basic;
	
	
	public Employ(int empno, String name, double basic) {
		super();
		this.empno = empno;
		this.name = name;
		this.basic = basic;
	}


	@Override
	public String toString() {
		return "Employ [empno=" + empno + ", name=" + name + ", basic=" + basic + "]";
	}
	
	
	
}
class Nivetha extends Employ{

public Nivetha(int empno, String name, double basic) {
		super(empno, name, basic);
		// TODO Auto-generated constructor stub
	}
}
class Nisha extends Employ{

	public Nisha(int empno, String name, double basic) {
		super(empno, name, basic);
		// TODO Auto-generated constructor stub
	}
	
}


public class SupCon {
	public static void main(String[] args) {
		Employ e1=new Nivetha(1, "Nivetha", 65667);
		Employ e2=new Nisha(2, "Nisha", 76878);
		//System.out.println(e1);
		//System.out.println(e2);
		Employ[] arrEmploy=new Employ[]{e1,e2};
		for (Employ employ : arrEmploy) {
	      System.out.println(employ);		
		}
	}

}
