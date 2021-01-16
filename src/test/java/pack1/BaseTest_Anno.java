package pack1;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseTest_Anno {
@BeforeMethod
public void beforemethod() {
	Reporter.log("before method", true);
}
@AfterMethod
public void aftermethod() {
	Reporter.log("after method", true);
}
@BeforeClass
public void beforeclass() {
	Reporter.log("beforeclass", true);
}

@AfterClass
public void afterclass() {
	Reporter.log("afterclass", true);
}

@BeforeTest
public void beforetest() {
	Reporter.log("beforetest", true);
}
@AfterTest
public void aftertest() {
	Reporter.log("aftertest", true);
}

@BeforeSuite
public void beforesuite() {
	Reporter.log("beforesuite", true);
}

@AfterSuite
public void aftersuite() {
	Reporter.log("aftersuite", true);
}







}
