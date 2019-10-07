<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
    <%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<style>

.anchor{font-size:20px;color:red}
</style>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


<h1>List Of Products</h1>
<table border="2">
<tr>
<th>id</th>
<th>name</th>
<th>quantity</th>
<th>actions</th>
</tr>






<a class="anchor" href="index.jsp">Add product</a>
<br>
<br>


<c:forEach var="list1" items="${list}">
<tr>
<td><c:out value="${list1.id}"/></td>
<td><c:out value="${list1.name}"/></td>
<td><c:out value="${list1.quantity}"/></td>

 <td>
                        <a href="edit.jsp?id=<c:out value='${list1.id}' />">Edit</a>
                        &nbsp;&nbsp;&nbsp;&nbsp;
                        <a href="delete?id=<c:out value='${list1.id}' />">Delete</a>                     
                    </td>

</tr>
</c:forEach>

 


</table>

</body>
</html>