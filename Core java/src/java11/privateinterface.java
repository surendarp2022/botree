package java11;

public interface privateinterface {

	 
	// public abstract void abstractmethod();
	  private static void privatemethod() {
		  System.out.println("iminside private method");
	  }
	 
	 
	 public default void defaultmethod() {
		 
		 privatemethod();
	 }
	 
	 
	 public static void staticmethod() {
		 privatemethod();
	 }
	 
	 private void normalmethod() {
		 privatemethod();
	 }
	 
	 
}
