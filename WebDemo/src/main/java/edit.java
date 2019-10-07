

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class edit
 */
public class edit extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		/*System.out.println("AKM");
		int id = Integer.parseInt(request.getParameter("pid"));
		String name = request.getParameter("pname");
		int quan = Integer.parseInt(request.getParameter("pquantity"));
		System.out.println(name+""+quan);
		edit1 ed=new edit1();
		try {
			ed.update(id,name ,quan);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		
		
		System.out.println("AKM");

		
		HttpSession session=request.getSession();
		int id=Integer.parseInt((String) session.getAttribute("id"));
		
		

		String name = request.getParameter("pname");
		int quan = Integer.parseInt(request.getParameter("pquantity"));
		System.out.println(id+""+name+""+quan);
		
		edit1 id1=new edit1();
		int row;
		 
		try {
			row=(int) id1.updateData(id,name,quan);
			response.sendRedirect("ret4");

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		

	
	
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
