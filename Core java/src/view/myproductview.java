package view;
import java.sql.Connection;

import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import controller.jdbcConnection;
import model.Productdetails;
import controller.Productcontroller;
public class myproductview {
	Productcontroller productcontroller=null;
	private int choice;
	public myproductview() {
		super();
		productcontroller=new Productcontroller();
	}
	
		
		public void display() throws ClassNotFoundException, SQLException {
			Label:
				while(true) {
					
			
			System.out.println(" welcome");
			System.out.println("1.findAllproducts");
			System.out.println("2.add products");
			System.out.println("3.Exit");
			System.out.println("3.Enter your choise");
			Scanner scanner = new Scanner(System.in);
			int choice=scanner.nextInt();
			
			switch(choice) {
			case 1:
				 List<Productdetails> productList=productcontroller.findAllproducts();
				 for(Productdetails p: productList)
					 System.out.println(p);
				break;
			
			case 2:
		         break;
			case 3:
				break Label;
				default:
					System.out.println("invalid option");
			}
		}
		}
		public static void main(String[] args)throws ClassNotFoundException, SQLException {
			Connection connection= jdbcConnection.getDBConnection();
			myproductview productview=new myproductview();
			productview.display();
		}

	}

