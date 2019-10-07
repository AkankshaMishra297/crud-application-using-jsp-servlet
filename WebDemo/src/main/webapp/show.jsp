<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


      
<form action="imgs" method="post" enctype="multipart/form-data">
Enter name:   <input type="text" name="name"><br>
Enter address:<input type="text" name="ad"><br>
Upload image: <input type="file" name="image" required="required"/><br/><br/>
              <input type="submit" value="submit"/>
        </form>
        
       

</body>
</html>