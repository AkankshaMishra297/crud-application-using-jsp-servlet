<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
String attr=request.getParameter("id").toString();

session.setAttribute("id",attr);
out.print(attr);
%>

<form action="edit">

<table>




<tr><td>Product name:</td><td><input type="text" name="pname"></td></tr>
<tr><td>Product Quantity:</td><td><input type="text" name="pquantity"></td></tr>

</table>
<table>
<input type="submit" value="update">

</table>
</form>




</body>
</html>