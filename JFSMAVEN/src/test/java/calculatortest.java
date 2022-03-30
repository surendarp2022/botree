import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
public class calculatortest {
	
	@Test
	void test() {
	calculator Calculator=new calculator();
	int received_result=Calculator.add(54, 6);
	   assertEquals(60,received_result,"my message");
	}
}
