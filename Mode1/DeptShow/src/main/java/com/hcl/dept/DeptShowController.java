package com.hcl.dept;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DeptShowController {
	@RequestMapping("/deptshow")
	public ModelAndView showDept(){
		ApplicationContext ctx=new ClassPathXmlApplicationContext("ApplicationContext.xml");
		DataSource dataSource=(DriverManagerDataSource)ctx.getBean("dataSource");
		JdbcTemplate jt=new JdbcTemplate(dataSource);
		String sql="select * from department";
		List emps=null;
		emps=jt.query(sql, new RowMapper(){

			public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
			String empInfo=rs.getInt("deptno")+"-----"+
			               rs.getString("dname")+"-----"+
			               rs.getString("loc")+"-----"+
			               rs.getString("head");
			               
				return empInfo;
			}

			
		});
		return (new ModelAndView("ShowPage","emps",emps));
	}
	@RequestMapping("/deptsearch")
	public ModelAndView searchEmp(HttpServletRequest req){
		int deptno=Integer.parseInt(req.getParameter("deptno"));
		ApplicationContext ctx=new ClassPathXmlApplicationContext("ApplicationContext.xml");
		DataSource dataSource=(DriverManagerDataSource)ctx.getBean("dataSource");
		JdbcTemplate jt=new JdbcTemplate(dataSource);
		String sql="select * from department where deptno=?";
		List emps=null;
		emps=jt.query(sql,new Object[]{deptno},new RowMapper() {

			public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
				// TODO Auto-generated method stub
				String empInfo=rs.getInt("deptno")+"-----"+
			               rs.getString("dname")+"-----"+
			               rs.getString("loc")+"-----"+
			               rs.getString("head");
			               
				return empInfo;
			}

			
		});
		return (new ModelAndView("ShowPage","emps",emps));
	}
	@RequestMapping("/DeptInsert")
	public ModelAndView insertEmploy(HttpServletRequest req){
		int deptno=Integer.parseInt(req.getParameter("deptno"));
		String dname=req.getParameter("dname");
		String loc=req.getParameter("loc");
		String head=req.getParameter("head");
		
		ApplicationContext ctx=new ClassPathXmlApplicationContext("ApplicationContext.xml");
		DataSource dataSource=(DriverManagerDataSource)ctx.getBean("dataSource");
		JdbcTemplate jt=new JdbcTemplate(dataSource);
		String cmd="insert into department values(?,?,?,?)";
		jt.update(cmd,new Object[]{deptno,dname,loc,head});
		return (new ModelAndView("InsertPage","message","Record Inserted"));
	}
	}


