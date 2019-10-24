package com.hcl.asser;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteEmploy {
	public static void main(String[] args) {
		try {
				FileOutputStream fout = new FileOutputStream("c:/files/employ.txt");
				ObjectOutputStream objout=new ObjectOutputStream(fout);
				Employ e=new Employ(1,"Nivetha",6570.8);
				objout.writeObject(e);
				objout.close();
				fout.close();
				System.out.println("employ stored");
			} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}
		catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} 
		
		
		
	}


