<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
        <%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>




<%
	 String name1=request.getParameter("name").toString();
	String ad1=request.getParameter("ad").toString();
	session.setAttribute("name",name1);
	session.setAttribute("ad",ad1);
	
	


%>





<body>
<table border="1">

<tr><td><c:out value="${name}"/></td></tr>
<tr><td><c:out value="${ad}"/></td></tr>




<tr><td>
<img src="view.jsp" width="200px" height="200px"/>
</td></tr>
</table>

</body>
</html>