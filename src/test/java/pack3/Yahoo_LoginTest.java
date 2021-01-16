package pack3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Yahoo_LoginTest {

WebDriver driver;

@BeforeMethod
public void setup() {

System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
driver.get("https://login.yahoo.com/account/create");
	
}

@DataProvider(parallel=true)
public Iterator<Object[]> getdata() {
	ArrayList<Object[]> testdata=Yahoo_data_util.getdata_excel();	
    return testdata.iterator();
}

@Test (dataProvider="getdata")
public void yahoo_login_test(String fname,String lname, 
	String email,String pwd,String phone,String month) {
	
	YahooLogin_POM yah1=new YahooLogin_POM(driver);	
	yah1.Efirstname(fname);
	yah1.Elastname(lname);
	yah1.Enteremail(email);
	yah1.Enterpwd(pwd);
	yah1.Enterphone(phone);
	yah1.month(month);
	
	
}

@AfterMethod
public void teardown() {
driver.quit();
	
	
}

//@BeforeMethod
//public void before() {
//	
//	System.out.println("before test");
//}
//
//@Test
//public void testing() {
//	System.out.println("general test");
//}
//
//@AfterMethod
//public void after() {
//	
//	System.out.println("after test");
//}

}
