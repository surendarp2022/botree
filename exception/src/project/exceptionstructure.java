package project;

public class exceptionstructure {
	
	
	public static void main (String args[]) {
		Exceptiondata obj=new Exceptiondata();
		try {
			obj.empid();
			
			
			System.out.println("try block invoked");
		}
			catch(myownexception m) {
				System.out.println(m);
				System.out.println("catch block executed");
			
			
		}
		
	   
	}
       
}