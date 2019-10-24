package com.hcl.hib;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class DeptCrud {
	public String insertDepartment(Department Department) {
		SessionFactory sf=HibernateUtil.getConnection();
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
		s.save(Department);
		t.commit();
		return "Record Inserted....";
	}
	public String updateDepartment(Department Department) {
		Department res=searchDepartment(Department.getDeptno());
		res.setDeptno(Department.getDeptno());
		res.setDname(Department.getDname());
		res.setLoc(Department.getLoc());
		res.setHead(Department.getHead());
		SessionFactory sf=HibernateUtil.getConnection();
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
		s.update(res);
		t.commit();
		return "Record Updated....";
	}
	public List<Department> showDepartment() {
		SessionFactory sf=HibernateUtil.getConnection();
		Session s=sf.openSession();
		Query q=s.createQuery("from Department");
		List<Department> lstDepartment=q.list();
		return lstDepartment;	
	}
	public Department searchDepartment(int deptno){
		SessionFactory sf=HibernateUtil.getConnection();
		Session s=sf.openSession();
		Query q=s.createQuery("from Department where deptno="+deptno);
		List<Department> lstDepartment=q.list();
		Department Department=null;
		if(lstDepartment.size()!=0) {
			Department=lstDepartment.get(0);
		}
		return Department;
		
	}
}
