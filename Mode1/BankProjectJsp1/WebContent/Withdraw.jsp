<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="Menu.html"/>
<form method="get" action="WithdrawAccount.jsp">
<center>
Account No:
<input type="text" name="accountNo"/><br/><br/>
Withdraw Amount:
<input type="text" name="withdrawAmount"/>
<input type="submit" value="Withdraw"/>
</center></form>
</body>
</html>