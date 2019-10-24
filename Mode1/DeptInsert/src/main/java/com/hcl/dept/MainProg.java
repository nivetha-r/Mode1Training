package com.hcl.dept;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hcl.dept.DeptInsertDao;

public class MainProg {
	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("jdbc.xml");
		DeptInsertDao d=(DeptInsertDao)ctx.getBean("myDao");
		d.insertDept();
		System.out.println("Record Inserted");
	}

}
