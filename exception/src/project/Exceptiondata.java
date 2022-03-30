package project;

import java.util.Scanner;

public class Exceptiondata {

	
	
	
	
	    private String empid;

		public void empid() throws myownexception{
	    	
			
	    	
	    	
	    	
	    	Scanner s=new Scanner(System.in);
	    	String eid=s.next();
	    	System.out.println("enter empid");
	    	if(eid.length()>5) {
	    		System.out.println("employee id is:"+ empid );
                throw  new myownexception("invalid empid");
	    	}
	    }
}




 