package day6.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.reuse.Reusable;

public class BookedItineraryPage extends Reusable {
	
	
	public BookedItineraryPage() {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="(//input[@type='checkbox'])[2]")
	private WebElement checkBox;
	
	@FindBy(xpath="//input[@name='cancelall']")
	private WebElement cancelBtn;

	public WebElement getCheckBox() {
		return checkBox;
	}

	public WebElement getCancelBtn() {
		return cancelBtn;
	}
	
	
	public void selectHotelCheckBox() {
		
		click(getCheckBox());
	}
	
	public void clickCancel() {
		
		click(getCancelBtn());
		
		Alert a =driver.switchTo().alert();
		a.accept();
		
	}
}
