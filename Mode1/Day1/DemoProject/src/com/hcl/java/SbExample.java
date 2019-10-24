package com.hcl.java;

public class SbExample {
	
	public StringBuilder show(int age,String name,String course,String city){
		StringBuilder sbError=new StringBuilder();
		boolean isvalid=true;
		if(age<=20){
			sbError.append("age must be greater than 20" + "\r\n");
			isvalid=false;
		}
		if(name.indexOf(' ')==-1){
			sbError.append("name contains both first name and last name" + "\r\n");
			isvalid=false;
		}
		if(!course.equalsIgnoreCase("JAVA")){
			sbError.append("only java course allowed" + "\r\n");
			isvalid=false;
			
			
		}
		if(isvalid==true){
		
		sbError.append("age "+age + "\r\n");
		sbError.append("name "+name+ "\r\n");
		sbError.append("course "+course+ "\r\n");
		sbError.append("city "+city +"\r\n");
		
	}
		return sbError;
	}
	
	public static void main(String[] args) {
		int age;
		String name;
		String course;
		String city;
		age=22;
		name="Nisha r";
		course="Java";
		city="vellore";
		StringBuilder sbRes=new SbExample().show(age, name, course, city);
		System.out.println(sbRes);
				
	}

}
