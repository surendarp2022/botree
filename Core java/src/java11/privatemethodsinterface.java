package java11;

public class privatemethodsinterface implements privateinterface{
   
	public void abstractmethod() {
		System.out.println("im inside abstract method in main class");
	}
	
	
	public static void main (String[] args) {
		privatemethodsinterface obj=new privatemethodsinterface();
	    obj.abstractmethod();
	    obj.defaultmethod();
	    privateinterface.staticmethod();
		}
	}
	
	
	
	
	
	
