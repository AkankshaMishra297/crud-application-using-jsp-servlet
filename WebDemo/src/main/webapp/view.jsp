<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<img src="view.jsp" width="200px" height="200px"/>

</body>
</html>

<%@page import="java.sql.Blob"%>
<%@page import="java.io.OutputStream"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%
//String id = request.getParameter("id");
 
/*String connectionURL = "jdbc:mysql://localhost:3306/Student";
String user = "root";
String pass = "root";
 
Connection con = null;
 
try{
    Class.forName("com.mysql.jdbc.Driver");
    con = DriverManager.getConnection(connectionURL, user, pass);
    
    PreparedStatement ps = con.prepareStatement("select img from image");
   // ps.setString(1, id);
    ResultSet rs = ps.executeQuery();
 
    if(rs.next()){
        Blob blob = rs.getBlob("img");
        byte byteArray[] = blob.getBytes(1, (int)blob.length());
 
        response.setContentType("image/gif");
        OutputStream os = response.getOutputStream();
        os.write(byteArray);
        os.flush();
        os.close();
    }
}
catch(Exception e){
    e.printStackTrace();
}   
finally{
    if(con != null){
        try{
            con.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
response.sendRedirect("upload.jsp");*/










String connectionURL = "jdbc:mysql://localhost:3306/Student";
String user = "root";
String pass = "root";
int id1=0;
 
Connection con = null;
 
try{
    Class.forName("com.mysql.jdbc.Driver");
    con = DriverManager.getConnection(connectionURL, user, pass);
    PreparedStatement ps1 = con.prepareStatement("select max(id) from image");
    ResultSet rs1 = ps1.executeQuery();
    if(rs1.next())
    {
    	id1=rs1.getInt(1);
    }
    
	System.out.println(id1);
    
    PreparedStatement ps = con.prepareStatement("select img from image where id=?");
   	ps.setInt(1, id1);
    ResultSet rs = ps.executeQuery();
 
    if(rs.next()){
        Blob blob = rs.getBlob("img");
        byte byteArray[] = blob.getBytes(1, (int)blob.length());
 
        response.setContentType("image/gif");
        OutputStream os = response.getOutputStream();
        os.write(byteArray);
        os.flush();
        os.close();
    }
}
catch(Exception e){
    e.printStackTrace();
}   
finally{
    if(con != null){
        try{
            con.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
response.sendRedirect("upload.jsp");



























%>

 