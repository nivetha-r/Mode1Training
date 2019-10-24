<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="com.hcl.inventory1.DaoConnection"%>
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
<jsp:include page="Menu.jsp"/>
<form method="get" action="CreateStock.jsp">
<center>
Stock ID:
<input type="text"  name="stockid"/><br/><br/>
Item Name:
<input type="text" name="Itemname"/><br/><br/>
Price:
<input type="text" name="price"/><br/><br/>
Quantity Avail:
<input type="text" name="quantityAvail"/><br/><br/>

<input type="submit" value="create"/>
</center></form>

</body>
</html>