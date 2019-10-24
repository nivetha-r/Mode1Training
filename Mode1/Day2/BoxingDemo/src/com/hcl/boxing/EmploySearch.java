package com.hcl.boxing;

public class EmploySearch {
	
	public Employ showEmploy(int empno){
		Employ employ=null;
		if(empno==1){
			employ=new Employ();
			employ.empno=100;
			employ.name="nivetha";
			employ.basic=6684;
			
}
		if(empno==3){
			employ=new Employ();
			employ.empno=101;
			employ.name="nisha";
			employ.basic=6685;
			
		}
		return employ;
		
	}
	public static void main(String[] args) {
		EmploySearch objsearch=new EmploySearch();
		Employ res=objsearch.showEmploy(1);
		if(res!=null){
			System.out.println(res);
			
		}else{
			System.out.println("empno not found");
		}
		
		
		
	}

}
