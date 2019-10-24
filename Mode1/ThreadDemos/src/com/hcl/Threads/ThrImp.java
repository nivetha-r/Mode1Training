package com.hcl.Threads;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

class ListDemo implements Runnable {

	@Override
	public void run() {
	List lstData=new ArrayList();
	lstData.add("Nivetha");
	lstData.add("Nisha");
	lstData.add("Nivi");
	lstData.add("pichu");
	lstData.add("Aaradhya");
	lstData.add("Arjun");
	for (Object object : lstData) {
		System.out.println(object);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
		
	}
	
}
class LinkDemo implements Runnable {

	@Override
	public void run() {
		LinkedList lst=new LinkedList();
		lst.add("Lavanya");
		lst.add("Dhananya");
		lst.add("Ridhanya");
		lst.add("Anushka");
		lst.add("Sanjana");
		lst.add("Shanusree");
		for (Object object : lst) {
			System.out.println("Linked List " +object);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			    e.printStackTrace();
			}
			
		}
		
		
	}
	
}
class VectorDemo implements Runnable {

	@Override
	public void run() {
	    Vector v=new Vector(3,2);
	    v.addElement("Charu");
	    v.addElement("Kamila");
	    v.addElement("keerthna");
	    v.addElement("vishalakshi");
	    v.addElement("kiruba");
	    v.addElement("Madhu");
	    for (Object object : v) {
	    	System.out.println("Vector " +object);
	    	try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
	
}

public class ThrImp {
	public static void main(String[] args) {
		Thread t1=new Thread(new ListDemo());
		Thread t2=new Thread(new ListDemo());
		Thread t3=new Thread(new VectorDemo());
		
		t1.start();
		t2.start();
		t3.start();
		
	}

}
