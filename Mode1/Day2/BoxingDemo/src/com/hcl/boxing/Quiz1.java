package com.hcl.boxing;

public class Quiz1 {
	public void show(Object x){
		System.out.println("object " +x);
	}
	public void show(Integer x){
		System.out.println("Integer " +x);
	}
public static void main(String[] args) {
	new Quiz1().show(12.2);
}
}
