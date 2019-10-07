<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div align="center">
    <h2><c:out value="${list.str}" /></h2>
    
    <img src="data:image/jpg;base64,${book.b}" width="240" height="300"/>
</div>
</body>
</html>