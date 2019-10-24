package com.hcl.ex;

public class ArrEx {
    public static void main(String[] args) {
		int[] a;
		try {
			a = new int[]{3,4};
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try{
		a[10]=56;
	}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("hhhjgyh");
		}
    }
		
		

