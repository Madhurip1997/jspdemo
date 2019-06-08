<%@page import="JSPdemo.Product" %>
<%@page import="jspDemoDao.*" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%
        String b_name=request.getParameter("update");
int pno=0;        
if(b_name == null){
    pno=Integer.parseInt(request.getParameter("pno"));
    ProductDao pd=new productDaoImp();
    Product p=pd.getProduct(pno);
    
    
        
%>
      <form action="Showforupdate.jsp" method="post" >
       P no<input type="hidden" name="product_id" value=<%=p.getProduct_id()%> ><br>
       Description <input type="text" name="description" value="<%=p.getDescription()%>" ><br>
       Name <input type="text" name="name" value=<%=p.getName()%> ><br>
       Price<input type="text" name="price" value=<%=p.getPrice()%>><br>
       Category Id<input type="text" name="category_no" value=<%=p.getCategory_no()%>><br>
       <input type="submit" value="update" name="update">
     </form>
     <%}else
     {
    	 %>
    	 
    	 
       value received
       <jsp:useBean id="product" class="JSPdemo.Product"  scope="request"/>
       <jsp:setProperty property="*"  name="product"/>
       

<%
ProductDao pd1=new productDaoImp();
if(pd1.update(product))
{
   

%>
   <h2>Product updated</h2>
<%}else{ %>
   <h2>Product not updated</h2>
   <%} %>
       
       
            	 
    <%} %>	 
</body>
</html>

