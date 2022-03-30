package jdbcicon;
import java.sql.*;


public class jdbcicon {

	
	
	public static void main(String[] args) throws SQLException {
        // TODO Auto-generated method stub
        String url = "jdbc:mysql://localhost:3306/new_schema";
        String user = "root";
        String pass = "root";
        String query = "select * from producttable;";

        DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
        Connection co = DriverManager.getConnection(url, user, pass);

        Statement sta = co.createStatement();
        ResultSet rs = sta.executeQuery(query);
        int id;
        String name;
        float price;
        
        System.out.println("id"+"\t"+"name"+"\t"+"price");  
        System.out.println("------------------------------------------------");
        while (rs.next()) {
            id = rs.getInt("pid");
            price = rs.getFloat("price");
            name = rs.getString("pname");
            

            System.out.println(id + "\t" +name+"\t" +  price+"\t");
        }
        
        System.out.println("-------------------------------------");
        sta.close();
        co.close();
    }

}



