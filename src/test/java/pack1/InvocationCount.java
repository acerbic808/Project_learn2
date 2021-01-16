package pack1;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class InvocationCount {
	
@BeforeMethod
public void pretest() {
System.out.println("PreCondition tested");
System.out.println();
}

@Test(invocationCount=3,priority=1,timeOut=2000,
expectedExceptions=NullPointerException.class)
public void test1() {
	
System.out.println("My name is Anthony Gonzalez");
System.out.println();
}



@AfterMethod
public void aftertest() {
System.out.println("AfterCondition tested");
System.out.println();
}

}
