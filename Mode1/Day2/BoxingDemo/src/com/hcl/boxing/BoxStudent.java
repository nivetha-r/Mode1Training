package com.hcl.boxing;

public class BoxStudent {
	public void show(Object ob){
	  Student s=(Student)ob;
	 System.out.println(s);
	 
}
public static void main(String[] args) {
	Student objStudent=new Student();
	objStudent.sno=1;
	objStudent.name="nivetha";
	objStudent.city="vellore";
	objStudent.cgp=85.7;
	
	new BoxStudent().show(objStudent);
}
}