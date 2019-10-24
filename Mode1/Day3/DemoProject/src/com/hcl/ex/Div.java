package com.hcl.ex;

public class Div {
	public static void main(String[] args) {
		int a,b,c;
		try {
				a=Integer.parseInt(args[0]);
				b=Integer.parseInt(args[1]);
				c=a/b;
				System.out.println("division " +c);
			}
			 catch (ArithmeticException e) {
				 System.out.println("division by zero impossible");
				 }
		catch(NumberFormatException e){
			System.out.println("string cannot be conv as int");
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("args are not pased");
		}
			catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally{
				System.out.println("prgm");
			}
				
		}

}
