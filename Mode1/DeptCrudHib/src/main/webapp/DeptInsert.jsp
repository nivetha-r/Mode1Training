<%@page import="com.hcl.hib.DeptCrud"%>
<%@page import="com.hcl.hib.Department"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form method="get" action="DeptInsert.jsp">
Dept No:
 <input type="text" name="deptno"/><br/><br/>
Dept Name:
 <input type="text" name="dname"/><br/><br/>
Location:
 <input type="text" name="loc"/><br/><br/>
Head:
 <input type="text" name="head"/><br/><br/>

 <input type="submit" value="Insert"/>
 
 </form>
 <%
 if(request.getParameter("deptno") !=null && 
		 request.getParameter("dname") !=null && 
		 request.getParameter("loc") !=null && 
		 request.getParameter("head") !=null 
){
	 Department d=new Department();
	 d.setDeptno(Integer.parseInt(request.getParameter("deptno")));
	 d.setDname(request.getParameter("dname"));
	 d.setLoc(request.getParameter("loc"));
	 d.setHead(request.getParameter("head"));
	 
	 DeptCrud crud=new DeptCrud();
	 out.println(crud.insertDepartment(d));
 }
 %>
 
</body>
</html>