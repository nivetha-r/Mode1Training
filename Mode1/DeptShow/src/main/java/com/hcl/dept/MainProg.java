package com.hcl.dept;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainProg {
	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("jdbc.xml");
		DeptQueryDao d=(DeptQueryDao)ctx.getBean("myDao");
		d.showDept();
		System.out.println("Record Shown");
	}

}
