package com.hcl.ex;
class c1{
	 static void test(){
		System.out.println("welcome");
	}
}
class c2 extends c1{
	static void test(){
		System.out.println("bye");
	}
}

public class p1 {
	public static void main(String[] args) {
		c2  obj=new c2();
		obj.test();
		}

}
