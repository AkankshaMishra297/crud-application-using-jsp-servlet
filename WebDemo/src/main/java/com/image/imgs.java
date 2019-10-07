package com.image;

import java.io.IOException;
import javax.servlet.http.Part;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.servlet.http.Part;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class imgs
 */
@MultipartConfig
public class imgs extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public imgs() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("akm");
		String name=request.getParameter("name");
		String ad=request.getParameter("ad");
		request.setAttribute("name", name);
		request.setAttribute("ad", ad);

		
		Part part = request.getPart("image");
		System.out.println(part);
		Connect c=new Connect();
		Connection con=null;
		try {
			con = c.conn();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		InputStream is = part.getInputStream();
		
		PreparedStatement ps;
		try {
			ps = con.prepareStatement("insert into image(name,address,img) values(?,?,?)");
			ps.setString(1, name);
			ps.setString(2, ad);

			ps.setBlob(3, is);
		    int n=ps.executeUpdate();
		    if(n>1)
		    	System.out.println("uploaded");
		    RequestDispatcher rd=request.getRequestDispatcher("upload.jsp?name?id");
		    rd.forward(request, response);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	    
	    
	
	}

}
