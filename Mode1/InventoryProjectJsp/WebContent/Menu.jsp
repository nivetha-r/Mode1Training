<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="com.hcl.inventory1.DaoConnection"%>
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
<th>StockID</th>
<th>ItemName</th>
<th>Price</th>
<th>Quantity Avail</th>
</tr>
<%
Connection con=DaoConnection.getConnection();
String cmd="select * from stock";
PreparedStatement pst=con.prepareStatement(cmd);
ResultSet rs=pst.executeQuery();
int quantityavail;
while(rs.next()) {
	if(rs.getInt("quantityavail")<10) {
		%>
		<tr bgcolor="red">
		<td><%=rs.getString("stockid")%></td>
		<td><%=rs.getString("Itemname")%></td>
		<td><%=rs.getInt("price")%></td>
		<td><%=rs.getInt("quantityAvail")%></td>
		</tr>
		<%
	}else{
	%>
	<tr>
		<td><%=rs.getString("stockid")%></td>
		<td><%=rs.getString("Itemname")%></td>
		<td><%=rs.getInt("price")%></td>
		<td><%=rs.getInt("quantityAvail")%></td>
		</tr>
	<%
}
%>
<%
}
%>
</table><br/><br/>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<a href="create.jsp">Create Stock</a>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<a href="search.jsp">Search Stock</a>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<a href="Place.jsp">Place Order</a>
		

</body>
</html>