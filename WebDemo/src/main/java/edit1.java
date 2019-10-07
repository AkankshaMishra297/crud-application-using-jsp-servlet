import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class edit1 {
	
	
	public int updateData(int id1,String name1, int quant1) throws ClassNotFoundException, SQLException
	{
		
	
		Connect c=new Connect();
		Connection con=c.conn();
		System.out.println("connected");
		
		
		System.out.println(id1+""+name1+""+quant1);
		String query1="update product set name=?, quantity=? where id=?";
		//String query="update product set name="+name1+", quantity="+quant1+" where id="+id1;
		PreparedStatement st=con.prepareStatement(query1);
		st.setString(1, name1);
		st.setInt(2, quant1);
		st.setInt(3, id1);
		int rs=st.executeUpdate();
		if(rs>0)
			return 1;
		else 
			return 0;
		

	
	
	
	}

}
