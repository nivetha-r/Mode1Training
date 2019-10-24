package com.hcl.boxing;

public class p1 {
	public void show(int x) {
		switch(x){
		case 1:
			System.out.println("hii");
			break;
		case 2:
			System.out.println("bye");
			break;
		case 3:
			System.out.println("hello");
		case 4:
			System.out.println("test");
		case 5:
			System.out.println("demo");
			default:
				System.out.println("default");
		}
	}
	public static void main(String[] args) {
		p1 obj=new p1();
		obj.show(4);
	}

}
