<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="com.hcl.jsp.DaoConnection"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border="3">
<tr>
<th>Deptno</th>
<th>Dname</th>
<th>loc</th>
<th>head</th>
<th>Update</th>
<th>Delete</th>
</tr>
<%
Connection con=DaoConnection.getConnection();
String cmd="select * from department";
PreparedStatement pst=con.prepareStatement(cmd);
ResultSet rs=pst.executeQuery();
while(rs.next()){
%>
<tr>
<td> <%=rs.getInt("deptno")  %></td>
<td> <%=rs.getString("dname") %></td>
<td> <%=rs.getString("loc") %></td>
<td> <%=rs.getString("Head") %></td>
<td> <a href="UpdateDept.jsp?deptno=<%=rs.getInt("deptno") %> ">update</a></td>
<td> <a href="DeleteDept.jsp?deptno=<%=rs.getInt("deptno") %>">delete</a></td>
</tr>
<%
}
%>

</table>
&nbsp;&nbsp;&nbsp;&nbsp;
<a href="AddDept.jsp">AddDept</a>


</body>
</html>