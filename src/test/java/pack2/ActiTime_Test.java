package pack2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ActiTime_Test {

WebDriver driver;

@Test
@Parameters({"url","username","password"})
public void acti(String url,String username, String password)
		throws InterruptedException {
	
System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
Acti_POM_class acti1=new Acti_POM_class(driver);
driver.get(url);
acti1.enterusername(username);
acti1.enterpwd(password);
Thread.sleep(2000);
acti1.clickonlogin();
}


}
