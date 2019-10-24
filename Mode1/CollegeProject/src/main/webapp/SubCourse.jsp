<%@page import="Com.hcl.hib.CollegeCrud"%>
<%@page import="Com.hcl.hib.Subjects"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form method="post" action="SubCourse.jsp" name="productForm">
<select name="subject" id="dropdown" onchange="change()">
<option value="dropdown">Pls select one</option>
<option value="Wireless Networks">Wireless Networks</option>
<option value="Digital signal processing">Digital signal processing</option>
<option value="Digital Communication">Digital Communication</option>
<option value="Digital Electronics">Digital Electronics</option>
<option value="Optical and communication Networks">Optical and Communication Networks</option>
<option value="Electronic circuits">Electronic circuits</option>
<option value="Fluid Mechanics">Fluid Mechanics</option>
</select><br/><br/>
Theory : 
<input type="text" name="theory" id="theory" readonly="readonly" /> <br/><br/>
Practical : 
<input type="text" name="practical" id="practical" readonly="readonly" /> <br/><br/>

Year:
<input type="number" name="year"><br/><br/>
Instructor:
<input type="text" name="instructor"><br/><br/>
<input type="submit" value="click">
</form>

<%-- <%
        String colour = request.getParameter("colour");
        out.println(colour);
        %> --%>
        <script>
        function change(){
        var dval= document.getElementById("dropdown").value;
        
       
        if(dval =="Wireless Networks"){
        	//alert("hi");
        	productForm.theory.value="42";
        	productForm.practical.value="14";
        }
        if(dval =="Digital signal processing"){
        	//alert("hi");
        	productForm.theory.value="90";
        	productForm.practical.value="50";
        }
        if(dval =="Digital Communication"){
        	//alert("hi");
        	productForm.theory.value="69";
        	productForm.practical.value="41";
        }
        
        if(dval =="Digital Electronics"){
        	//alert("hi");
        	productForm.theory.value="69";
        	productForm.practical.value="41";
        }
        
        if(dval =="Optical and communication Networks"){
        	//alert("hi");
        	productForm.theory.value="107";
        	productForm.practical.value="93";
        }
        
        if(dval =="Electronic circuits"){
        	//alert("hi");
        	productForm.theory.value="84";
        	productForm.practical.value="56";
        }
        if(dval =="Fluid Mechanics"){
        	//alert("hi");
        	productForm.theory.value="84";
        	productForm.practical.value="56";
        }
        
        
        
        }
    <%--     document.getElementById("dropdown").value = '<% out.print(colour); %>'; --%>
        </script>

<%
 if(request.getParameter("theory") !=null && 
		 request.getParameter("subject") !=null && 
 request.getParameter("practical") !=null &&
 request.getParameter("year") !=null &&
 request.getParameter("instructor") !=null 
 
){
	 Subjects e=new Subjects();
e.setTheory(Integer.parseInt(request.getParameter("theory")));
e.setPractical(Integer.parseInt(request.getParameter("practical")));
e.setSubject(request.getParameter("subject"));
e.setYear(Integer.parseInt(request.getParameter("year")));
e.setInstructor(request.getParameter("instructor"));

CollegeCrud crud=new CollegeCrud();
out.println(crud.insertSubjects(e));
}
%>
</body>
</html>

