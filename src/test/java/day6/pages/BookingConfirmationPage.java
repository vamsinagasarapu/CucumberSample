package day6.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.reuse.Reusable;

public class BookingConfirmationPage extends Reusable {
	
	public BookingConfirmationPage() {
		PageFactory.initElements(driver,this);
	}
	
	
	@FindBy(id="my_itinerary")
	private WebElement showItinerary;


	public WebElement getShowItinerary() {
		return showItinerary;
	}
	
	public void showItinerary() throws InterruptedException {
		
		click(getShowItinerary());
	    Thread.sleep(5000);
	}

}
