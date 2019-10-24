package com.hcl.eee;

public class Cs {
	static String name;
	public Cs(String name){
		this.name=name;
	}
	public int length(){
		char[] arr=name.toCharArray();
		int i=0;
		for (char c : arr) {
			i++;
			
		}
		return i;
	}
	public static void main(String[] args) {
		Cs obj=new Cs("nivetha");
		System.out.println(obj.length());
	}

}
