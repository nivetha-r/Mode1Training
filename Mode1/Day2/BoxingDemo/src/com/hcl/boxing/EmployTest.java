package com.hcl.boxing;

public class EmployTest {
	public static void main(String[] args) {
		
		Employ e1=new Employ();
		e1.empno=2;
		e1.name="nisha";
		e1.basic=67523;
		
		Employ e2=new Employ();
		e2.empno=2;
		e2.name="nisha";
		e2.basic=67523;
		
		System.out.println(e1.empno==e2.empno);
		System.out.println(e1.equals(e2));
	}

}
