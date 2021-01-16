package pack1;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoB_Base extends BaseTest_Anno {

	@Test
	public void TestB() {
		
		Reporter.log("testB",true);
		
	}

}
