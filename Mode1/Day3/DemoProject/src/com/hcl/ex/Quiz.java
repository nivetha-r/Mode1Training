package com.hcl.ex;

public class Quiz {
	public static void main(String[] args) {
		int[] a=new int[]{23,4,5};
		try{
			a[6]=5/0;
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("array size small");
		}
		catch(ArithmeticException e){
			System.out.println("div by zero imp");
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}

}
