package jdbcicon;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



import java.util.Scanner;


public class jdbcmodi {
	
	

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		
		
        

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/new_schema","root","root");

        Statement st = con.createStatement();
        jdbcmodi diobj=new jdbcmodi();
        //insertion
        String query1="insert into producttable(pid,pname,price,offer) values(?,?,?,?)";
        PreparedStatement pst=con.prepareStatement(query1);
         diobj.insert();
         int rows_affected_pst=pst.executeUpdate("insert into producttable(pid,pname,price,offer) values (12,'washing machine',30000,15)");
         System.out.println("Query ok,  "+rows_affected_pst+"row affected");
        
        
        Scanner scanner=new Scanner(System.in);
        
        
        System.out.println("enter the id:");
        int pid=scanner.nextInt();
        System.out.println("enter the name :");
        String pname=scanner.next();
        System.out.println("enter the price:");
        float price=scanner.nextFloat();
        System.out.println("enter the offer:");
        int offer=scanner.nextInt();
        System.out.println("------------------------------------------------");
        
        
        pst.setInt(1,pid);
        pst.setString(2, pname);
        pst.setFloat(3, price);
        pst.setInt(4,offer);
        
        
        
       
       
        
        
        ResultSet rs=st.executeQuery("select* from producttable");
        while(rs.next()) {
        	System.out.println(rs.getInt("pid")+"\t"+rs.getString("pname")+"\t "+rs.getFloat("price")+"\t"+rs.getInt("offer"));
        }	
        	System.out.println("------------------------------------------------------");
             st.close();
            con.close();
    


		
		
	}

	private void insert() {
		// TODO Auto-generated method stub
		
	}	

	}


