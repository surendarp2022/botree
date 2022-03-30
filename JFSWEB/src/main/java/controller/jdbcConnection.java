package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbcConnection {
	public static Connection getDBConnection()throws ClassNotFoundException,SQLException{
		Class.forName("com.mysql.cj.jdbc.Driver");
	    Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/product","root","root");
	     return connection;
	     
		}
	     
	     
	     
	     public static ResultSet getResultSet() throws ClassNotFoundException,SQLException{
	    	 Connection connection= getDBConnection();
	    	 Statement statement = connection.createStatement();
		        ResultSet resultset = statement.executeQuery("Select*from products");
		        
		        while (resultset.next()) {
		        	System.out.println(resultset.getInt("pid")+"\t"+resultset.getString("pname")+"\t"+resultset.getFloat("price")+"\t"+resultset.getInt("offer"));
		        }
		            
	            return resultset;
	     
	     }
	     
}
