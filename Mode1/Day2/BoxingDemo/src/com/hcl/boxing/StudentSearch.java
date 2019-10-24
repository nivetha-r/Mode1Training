package com.hcl.boxing;

public class StudentSearch {
	public Student showStudent(int sno){
		Student student=null;
		if(sno==1){
			student=new Student();
			student.sno=1;
			student.name="nivetha";
			student.city="vellore";
			student.cgp=85;
		}
		if(sno==2){
			student=new Student();
			student.sno=2;
			student.name="nisha";
			student.city="vellore";
			student.cgp=86;
		}
		return student;
		
	}
	public static void main(String[] args) {
		StudentSearch objsearch=new StudentSearch();
		Student res=objsearch.showStudent(2);
		if(res!=null){
			System.out.println(res);
			
		}else{
			System.out.println("sno not found");
		}

	}
}
