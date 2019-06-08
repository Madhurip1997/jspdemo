<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.Date"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>Hello World</h1>
<%
int x=5;
%>
x=<%=x %>

<h2>for loop</h2>
<%for(int i=0;i<5;i++)
{
 %>

I=<%=i %><br>

<%} %>

<% 
 if(x==5){
 %>
 <h3>True</h3>
 <%
 }
 else
 {
	 %>
	 <h3>false</h3>
	 <%} %><br>
 }
 
 Todays is<%=new Date() %>


</body>
</html>