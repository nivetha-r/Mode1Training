package com.hcl.asser;


	import java.io.FileInputStream;
	import java.io.FileNotFoundException;
	import java.io.IOException;
	import java.io.ObjectInputStream;
	public class ReadStudent {


		public static void main(String[] args) {
			try {
				FileInputStream fin = new FileInputStream("c:/files/student.txt");
				ObjectInputStream objin=new ObjectInputStream(fin);
				Student s=(Student)objin.readObject();
				System.out.println(s);
			} catch (FileNotFoundException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (ClassNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			
		}
	}





	
