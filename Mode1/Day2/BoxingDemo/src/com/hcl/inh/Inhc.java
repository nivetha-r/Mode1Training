package com.hcl.inh;

class First{
	static{
		System.out.println("x");
	}
	public First(){
		System.out.println("base class constructor");
	}
}
class Second extends First{
	static{
		System.out.println("y");
	}
	public Second(){
		System.out.println();
	}
}

public class Inhc {
	public static void main(String[] args) {
		new Second();
	}

}
