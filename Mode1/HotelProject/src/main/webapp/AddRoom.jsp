<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<body>
<form method="post" action="AddRoom.jsp" name="productForm">
Rooms:
<select name="Room" id="dropdown" >
<option value="dropdown">Pls select one</option>
<option value="R001">R001</option>
<option value="R002">R002</option>
<option value="R003">R003</option>
<option value="R004">R004</option>
<option value="R005">R005</option>
<option value="R006">R006</option>
<option value="R007">R007</option>
</select><br/><br/>
Type : 
<select name="Type" Type="dropdown" >
<option value="dropdown">Pls select one</option>
<option value="Single">Single</option>
<option value="Double">Double</option>
</select><br/><br/>
Status : 
<input type="text" name="Status" value="Available" readonly="readonly" /> <br/><br/>

CostPerDay:
<input type="number" name="CostPerDay"><br/><br/>

<input type="submit" value="click">
</form>
</body>
</html>