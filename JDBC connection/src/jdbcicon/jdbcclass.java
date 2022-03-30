package jdbcicon;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class jdbcclass {
	
	public static void main(String[] args)throws SQLException{
		
		String ur1="jdbc:mysql://localhost:3306/new_schema";
		String username="root";
		String password="root";
		String query="select pname from producttable where pid<8";
		
		
		DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
		Connection con= DriverManager.getConnection(ur1,username,password);
		
		Statement st=con.createStatement();
	    ResultSet rs=st.executeQuery(query);
	    rs.next();
	    System.out.println(rs.getString("pname"));
	    
	    st.close();
	    con.close();
		
		
		
		
		
	}

}
