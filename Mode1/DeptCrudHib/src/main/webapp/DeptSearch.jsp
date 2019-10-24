<%@page import="com.hcl.hib.Department"%>
<%@page import="com.hcl.hib.DeptCrud"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
int deptno=Integer.parseInt(request.getParameter("deptno"));
DeptCrud crud=new DeptCrud();
Department d=crud.searchDepartment(deptno);
if(d!=null) {
	out.println("DeptNo: " +d.getDeptno()+ "<br/>");
	out.println("Dept Name: " +d.getDname()+ "<br/>");
	out.println("location: " +d.getLoc()+ "<br/>");
	out.println("Head: " +d.getHead() + "<br/>");
}else{
	out.println("Not Found...");
}

%>

</body>
</html>