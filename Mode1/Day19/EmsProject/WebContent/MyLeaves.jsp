<%@page import="com.hcl.ems.EmsDao"%>
<%@page import="com.hcl.ems.Leaves"%>
<%@page import="com.hcl.ems.EmsBal"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="css/myLeaves.css" /> 
<style>
.my-custom-scrollbar {
position: relative;
height: 200px;
overflow: auto;
}
.table-wrapper-scroll-y {
display: block;
}
</style>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>My Leaves | EMS</title>
</head>
<body>
<div class="table-wrapper-scroll-y my-custom-scrollbar">
	<table class="table table-striped mb-0" border="1" bordercolor=white>
		<tr class="table-primary">
			<th>Leave ID</th>
			<th>Number of Days</th>
			<th>Start Date</th>
			<th>End Date</th>
			<th>Leave Type</th>
			<th>Status</th>
			<th>Reason</th>
			<th>Applied On</th>
			<th>Manager Comments</th>
		</tr>
		<%
		int EMP_ID = Integer.parseInt((String)session.getAttribute("EMP_ID"));
	Leaves l = new EmsDao().getMyLeavesDao(EMP_ID);
						if(l.getLeaId() != 0) {
		
		out.println("<tr>");
			out.println("<td> " + l.getLeaId() +" </td>");
			out.println("<td>" + l.getNoDays() +"</td>");
			out.println("<td>" +l.getStartDate() +"</td>");
			out.println("<td>" +l.getEndDate() +"</td>");
			out.println("<td>" +l.getType() +"</td>");
			out.println("<td>" +l.getStatus()+" </td>");
			out.println("<td>" +l.getReason()+" </td>");
			out.println("<td>" +l.getAppliedOn()+" </td>");
		out.println("</tr>");
		} else {
			out.println("<td>No Standing Leaves</td>");	
		}%>
		
	</table>
	</div>
	<div id="applyButton">
	<input  class="btn btn-primary" onClick="javascript:window.location.href='ApplyLeaves.jsp'" type="submit" value="New Application" />
	</div>
	
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
</body>
</html>