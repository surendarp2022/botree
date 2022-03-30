import static org.junit.jupiter.api.Assertions.*;


//import java.util.Scanner;
import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.BeforeAll;
class Unittestcase {
	public static UnitTest unitTest;
	//public static Scanner scanner;
	//@BeforeAll
	//{
	//	unitTest=new UnitTest();
		//scanner =new Scanner(System.in);
	//}
	
	

	@Test
	void test() {
	//	fail("Not yet implemented");
		
		UnitTest unitTest=new UnitTest();
        int received_result=unitTest.mul(5, 5);
       assertEquals(25, received_result);
	}
	@Test
	void test1() {
	UnitTest unitTest1=new UnitTest();
    String received_result1=unitTest1.add("raj","bharath");
    assertEquals("rajbharath", received_result1);
	}
	@Test
	void test2() {
     UnitTest unittest2=new UnitTest();
     float received_result2=unittest2.sub(50,25);
     assertEquals(25.0,received_result2);
	
	}

}