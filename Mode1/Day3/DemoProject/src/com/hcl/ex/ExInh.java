package com.hcl.ex;

class First{
	public void show(){
		System.out.println("show method from first");
	}
}
class Second extends First{
	public void show(){
	System.out.println("show method from second");
}
}
public class ExInh {
	public static void main(String[] args) {
	
		First ob1=new First();
	
		Second ob2= (Second)ob1;
		ob2.show();
		
	}
}



