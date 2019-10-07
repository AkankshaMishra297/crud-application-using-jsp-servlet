import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class delete1 {
	
	public int deleteProduct(int id) throws ClassNotFoundException, SQLException
	{
		Connect c=new Connect();
		Connection con=c.conn();
		
		String query="delete from product where id=?";
		PreparedStatement st=con.prepareStatement(query);
		st.setInt(1,id);
		int rs=st.executeUpdate();
		if(rs>0)
			return 1;
		else
			return 0;
		
		
		
	}
	

}
