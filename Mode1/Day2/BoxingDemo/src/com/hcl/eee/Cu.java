package com.hcl.eee;

public class Cu {
	static String name;
	public Cu(String name){
		this.name=name;
	}
	
	public static void main(String[] args) {
		String s1="NIVETHA";
		Cu obj=new Cu("NIVETHA");
		String s1Lower=s1.toLowerCase();
		System.out.println(s1Lower);
		
	}

}
