package controller;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;

import model.Productdetails;

public class Productcontroller {
	 public  List<Productdetails> findAllproducts()throws ClassNotFoundException,SQLException{
	     
	     List<Productdetails> productList=new ArrayList<Productdetails>();
	     ResultSet resultset=jdbcConnection.getResultSet();
	     while(resultset.next()) {
	    	 System.out.println(resultset.getInt("pid")+"\t"+resultset.getString("pname")+"\t"+resultset.getFloat("price")+"\t"+resultset.getInt("offer"));
	     
	     
	     
	     
	     int pid=resultset.getInt("pid");
	     String pname=resultset.getString("pname");
	     float price=resultset.getFloat("price");
	     int offer=resultset.getInt("offer");
	     productList.add(new Productdetails(pid,pname,price,offer));
	     } 
	     
	     return productList;
	}

		 
}
