package pack2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Acti_POM_class {

	@FindBy(id="username")
	private WebElement untb;
	@FindBy(name="pwd")
	private WebElement pwtb;
	@FindBy(xpath="//a[@id='loginButton']")
	private WebElement loginbtn;

	public Acti_POM_class(WebDriver driver) {

	PageFactory.initElements(driver, this);
	System.out.println(untb);
	System.out.println(pwtb);
	System.out.println(loginbtn);
	}
	public void enterusername(String un) {
		untb.sendKeys(un);
	}
	public void enterpwd(String pwd) {
		pwtb.sendKeys(pwd);
	}
	public void clickonlogin(){
		loginbtn.click();
	}

}
