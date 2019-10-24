package com.hcl.nive;

public class p3 {
   public static void main(String[] args) {
	Object[] arr=new Object[]
			{
					12,"welcome",12.5,
					"hcl",'A',"Java",true,11,11.2,"bangalore"
					};
	for (Object object : arr) {
		if(object instanceof Boolean){
			System.out.println(object);
		}
	}
}
}
