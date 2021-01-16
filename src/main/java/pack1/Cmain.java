package pack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	classA a=new classA();
	classB b=new classB();
	a=new classB();
	a.display();
	classB t=(classB)new classA();
	classA m=new classB();
	WebDriver driver=new ChromeDriver();
	driver.manage().deleteAllCookies();
	
	
	
	

	}

}
