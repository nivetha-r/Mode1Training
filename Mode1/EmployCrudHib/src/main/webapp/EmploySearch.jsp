<%@page import="com.hcl.hib.Employ"%>
<%@page import="com.hcl.hib.EmployCrud"%>
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
int empno=Integer.parseInt(request.getParameter("empno"));
EmployCrud crud=new EmployCrud();
Employ e=crud.searchEmploy(empno);
if(e!=null) {
	out.println("empno: " +e.getEmpno()+ "<br/>");
	out.println("Name: " +e.getName()+ "<br/>");
	out.println("Dept: " +e.getDept()+ "<br/>");
	out.println("Desig: " +e.getDesig() + "<br/>");
	out.println("Salary: " +e.getBasic() + "<br/>");
}else{
	out.println("Not Found...");
}

%>
</body>
</html>