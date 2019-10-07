
import java.awt.List;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class RetrieveBook {
	
	public ArrayList get() throws SQLException, ClassNotFoundException
	{
		ArrayList l=new ArrayList();
		Connect c=new Connect();
		Connection con=c.conn();
		
		String query="select * from product";
		Statement st=con.createStatement();
		ResultSet rs= st.executeQuery(query);
		while(rs.next())
		{
			
			int id=rs.getInt(1);
			String name=rs.getString(2);
			int quantity=rs.getInt(3);
			Book b=new Book(id,name,quantity);
			l.add(b);
			
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
		}
		System.out.println(l);
		return l;
	}

}
