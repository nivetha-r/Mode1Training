package com.hcl.inh;

class c3{
	public void show(){
		System.out.println("abc");
	}
}
	class c4 extends c3{
	
	protected void display(){
		System.out.println("xyz");
}
	}
	
public class A {
	public static void main(String[] args) {
		c4 obj=new c4();
		obj.show();
		obj.display();
}
}
		
		



