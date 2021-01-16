package pack1;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoA_Base extends BaseTest_Anno {

@Test
public void TestA() {
	
	Reporter.log("testA",true);
	
}

@Test
public void TestR() {
	
	Reporter.log("testR",true);
	
}
}
