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
<%
 int deptno=Integer.parseInt(request.getParameter("deptno"));
 Connection con=DaoConnection .getConnection();
 String cmd="select * from Department where deptno=?";
 PreparedStatement pst=con.prepareStatement(cmd);
 pst.setInt(1,deptno);
 ResultSet rs=pst.executeQuery();
 rs.next();
 %>
<form method="get" action="UpdateDept.jsp">
<center>

Dept no:
<input type="text" name="deptno" readonly="readonly" value=<%=rs.getInt("deptno") %> /><br/><br/>
Dept name:
<input type="text" name="dname" value=<%=rs.getString("dname") %> /><br/><br/>
location :
<input type="text" name="loc" value=<%=rs.getString("loc") %> /><br/><br/>
head:
<input type="text" name="head" value=<%=rs.getString("head") %>/><br/><br/>

<input type="submit" value="update"/>
</center></form>
<%
if(request.getParameter("deptno")!=null && request.getParameter("head")!=null){

cmd="update Department set dname=?, loc=?, head=?  where deptno=?";
pst=con.prepareStatement(cmd);
pst.setString(1,request.getParameter("dname"));
pst.setString(2,request.getParameter("loc"));
pst.setString(3,request.getParameter("head"));
pst.setInt(4,deptno);
pst.executeUpdate();
%>
<jsp:forward page="DeptShow.jsp"  />
<%
}
%>
}

</body>
</html>