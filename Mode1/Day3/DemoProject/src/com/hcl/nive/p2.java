package com.hcl.nive;

class Employ{
	
	String name;
	public Employ(String name){
		this.name=name;
	}
	@Override
	public String toString() {
		return "Employ [name=" + name + "]";
	}
	
}
 
class HrEmploy extends Employ{
	public HrEmploy(String name){
		super(name);
	}
}
class JavaEmploy extends Employ{
public JavaEmploy(String name){
	super(name);
}
}
public class p2 {
	public static void main(String[] args) {
		Employ[] arrEmploy=new Employ[]{
				new HrEmploy("A"),
				new JavaEmploy("B"),
				new HrEmploy("C"),
				new HrEmploy("D"),
				new JavaEmploy("E"),
				new JavaEmploy("F"),
				
		};
		for (Employ employ : arrEmploy) {
			if(employ instanceof JavaEmploy){
				System.out.println(employ);
		}
		
	}
}
}
