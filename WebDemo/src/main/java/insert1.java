import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class insert1 {
	
	int id;
	int quant;
	String name;
	public int insertData(int id,String name,int quan) throws SQLException, ClassNotFoundException
	{
		this.id=id;
		this.name=name;
		this.quant=quan;
		
		Connect c=new Connect();
		Connection con=c.conn();
		
			
		
		System.out.println(id+""+name+""+quant);
		
		String query="insert into product values(?,?,?)";
		 PreparedStatement st = con.prepareStatement(query);
			st.setInt(1,id);
			
			st.setString(2,name);
			st.setInt(3,quan);
			int n=st.executeUpdate();
			if(n==1)
				return 1;
			else
				return 0;
			
		
		
	}

}
