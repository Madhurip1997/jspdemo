<%@page import="java.util.ArrayList"%>
<%@page import="jspDemoDao.*"%>
<%@page import="JSPdemo.*" %>

<%@page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border="1">
<% 
ProductDao p1=new productDaoImp();
ArrayList<Product> alist=p1.DisplayAll();
if(alist!=null)
for(Product P:alist)
{%>
<tr>
<td><%=P.getProduct_id() %></td>
<td><%=P.getDescription() %></td>
<td><%=P.getName() %></td>
<td><%=P.getPrice() %></td>
<td><%=P.getCategory_no() %>
</tr>
 <% }%>
</table>

</body>
</html>