package com.hcl.abs;

abstract class Employ{
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
class Niveth extends Employ{

	public Niveth(int empno, String name, double basic) {
		super(empno, name, basic);
		// TODO Auto-generated constructor stub
	}
	
}
class Nish extends Employ{
	

public Nish(int empno, String name, double basic) {
		super(empno, name, basic);
		// TODO Auto-generated constructor stub
	}
}
public class AbsCon {
	public static void main(String[] args) {
		Employ obj1=new Niveth(1, "Nivetha", 43454);	
		
        Employ obj2=new Nish(2, "Nisha", 65890);
        
        Employ[] arrEmploy=new Employ[]{obj1,obj2};
        for(Employ employ : arrEmploy){
        	System.out.println(employ);
        }
}
}
