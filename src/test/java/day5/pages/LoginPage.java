package day5.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.reuse.Reusable;

public class LoginPage extends Reusable {
	
	
	
	public LoginPage() {
		PageFactory.initElements(driver,this);
	}
	
	
	@FindBy(xpath="//input[@id='username']")
	private WebElement user;
	
	@FindBy(xpath="//input[@id='password']")
	private WebElement pass;
	
	@FindBy(xpath="//input[@value='Login']")
	private WebElement loginbtn;

	public WebElement getUser() {
		return user;
	}

	public WebElement getPass() {
		return pass;
	}

	public WebElement getLoginbtn() {
		return loginbtn;
	}
	
	public void login(String s1, String s2) {
		
		sendInput(getUser(), s1);
		sendInput(getPass(), s2);
		click(getLoginbtn());
		
		
	}
	
}
