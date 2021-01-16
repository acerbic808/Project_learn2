package pack1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTest {

WebDriver driver;

@BeforeMethod
public void setup() {
System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
driver.get("https://www.google.com");
}
@Test(priority=1,groups="Title")
public void googletitletest() {
	System.out.println("The title is: "+driver.getTitle());
	System.out.println();
	
}
@Test(priority=2,groups="Logo")
public void getlogo() {
	System.out.println("Google logo displayed "+
driver.findElement(By.xpath("//img[@id='hplogo']")).isDisplayed());
	System.out.println();
}

@Test(priority=3,groups="Test",dependsOnMethods="getlogo")
public void test1() {
	System.out.println("Test1");
}
@Test(priority=4,groups="Test",dependsOnMethods="test1",invocationCount=2)
public void test2() {
	System.out.println("Test2");
}
@Test(priority=5,groups="Test")
public void test3() {
	System.out.println("Test3");
}
@AfterMethod
public void teardown(){
driver.quit();
	
}


}
