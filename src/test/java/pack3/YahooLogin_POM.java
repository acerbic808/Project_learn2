package pack3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class YahooLogin_POM {

@FindBy(xpath="//input[@name='firstName']")
private WebElement firstname;

@FindBy(xpath="//input[@name='lastName']")
private WebElement lastname;

@FindBy(xpath="//input[@name='yid']")
private WebElement email;

@FindBy(xpath="//input[@name='password']")
private WebElement password;

@FindBy(xpath="//input[@name='phone']")
private WebElement phone;

@FindBy(xpath="//select[@name='mm']")
private WebElement month;

@FindBy(xpath="//input[@name='dd']")
private WebElement date;

@FindBy(xpath="//button[.='Continue']")
private WebElement coninue;

public YahooLogin_POM(WebDriver driver) {
	
PageFactory.initElements(driver, this);
System.out.println("Firstname= "+firstname);
System.out.println("Lastname= "+lastname);
System.out.println("EmailId= "+email);
System.out.println("Phone No= "+phone);
System.out.println(date);


}

public void Efirstname(String fname){
	firstname.sendKeys(fname);
}
	
	public void Elastname(String lname){
		lastname.sendKeys(lname);
		
	}

	public void Enteremail(String email1){
		email.sendKeys(email1);
		
	}
	
	public void Enterpwd(String pwd){
		password.sendKeys(pwd);
		
	}
	
	public void Enterphone(String phone1){
		phone.sendKeys(phone1);
		
	}
	
	public void month(String month_txt){
		Select sel=new Select(month);
		sel.deselectByVisibleText(month_txt);
		
		
	}
	
	




	

}
