package com.hcl.boxing;

public class p2 {
	public void show(Object ob){
		if(ob=="ABC"){
			System.out.println("correct A and D");
		}else{
			System.out.println("Error B and C ");
		}
	}
	public static void main(String[] args) {
		String s="ABC";
		p2 obj=new p2();
		obj.show(s);
	}
}
