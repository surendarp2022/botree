import static org.junit.jupiter.api.Assertions.*;
 
import org.junit.jupiter.api.Test;


 class UnitTestTestCase {
   
	 @Test
	 void test() {
             // fail("not yet implemented");
		 
		 
		 UnitTest unitTest=new UnitTest();
        int received_result=unitTest.mul(6, 5);
        assertEquals(30, received_result);
}
 }