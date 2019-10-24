<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="jstl" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<sql:setDataSource var="conn"
driver="com.mysql.jdbc.Driver"
url="jdbc:mysql://localhost:3306/bank"
user="root"
password="root"
/>
<sql:query var="accQuery" dataSource="${conn}">
Select * from Accounts WHERE accountNo=?
<sql:param value="${param.accountNo}"/>
</sql:query>
<jstl:set var="flag" value="0"/>
<jstl:forEach var="e" items="${accQuery.rows}">
First Name:
<jstl:out value="${e.firstName}"/><br/>
Last Name:
<jstl:out value="${e.lastName}"/><br/>
City:
<jstl:out value="${e.city}"/><br/>
State:
<jstl:out value="${e.state}"/><br/>
Amount:
<jstl:out value="${e.amount}"/><br/>
CheqFacil:
<jstl:out value="${e.cheqFacil}"/><br/>
AccountType:
<jstl:out value="${e.accountType}"/><br/>
<jstl:set var="flag" value="1" />
</jstl:forEach>
<jstl:if test="${flag==0}">
<jstl:out value="Account No not found..."/>
</jstl:if>
</body>
</html>