package com.hcl.boxing;

public class BoxEmploy {
	
	public void show(Object ob){
		Employ e=(Employ)ob;
		System.out.println(e);
	}
	
	public static void main(String[] args) {
		Employ objEmploy=new Employ();
		objEmploy.empno=1;
		objEmploy.name="nivetha";
		objEmploy.basic=56748;
		
		new BoxEmploy().show(objEmploy);
		
		
	}

}
