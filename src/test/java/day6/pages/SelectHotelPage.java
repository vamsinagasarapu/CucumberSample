package day6.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.reuse.Reusable;

public class SelectHotelPage extends Reusable {

	public SelectHotelPage() {
		PageFactory.initElements(driver,this);
	}
	
	
	@FindBy(id="radiobutton_0")
	private WebElement button;
	
	@FindBy(id="continue")
	private WebElement buttoncontinue;

	public WebElement getButton() {
		return button;
	}

	public WebElement getButtoncontinue() {
		return buttoncontinue;
	}
	
	public void selectHotel() {
		
		 click(getButton());
		 click(getButtoncontinue());
	}
	
	
	
}
