

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



/**
 * Servlet implementation class insert
 */
public class insert extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
		 
		    int pid1=Integer.parseInt(request.getParameter("pid"));
			String pname1=request.getParameter("pname");
			int pquantity1=Integer.parseInt(request.getParameter("pquantity"));
		
			
		
			int row;
			insert1 id=new insert1();
			try {
				row=(int) id.insertData(pid1, pname1, pquantity1);
				response.sendRedirect("ret4");

				
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			/*Connect c=new Connect();
			Connection con=null;
			try {
				c.conn();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
			String query="insert into student values(?,?,?)";
			
			PreparedStatement st;
			try {
				st = con.prepareStatement(query);
				st.setInt(1,pid1);
				
				st.setString(2, pname1);
				st.setInt(3, pquantity1);
				int row=st.executeUpdate();
				System.out.println("updated");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}*/
			
				
			
			
			
			
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
