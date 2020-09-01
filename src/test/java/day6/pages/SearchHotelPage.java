package day6.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.reuse.Reusable;

public class SearchHotelPage extends Reusable {
	
	public SearchHotelPage() {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(id="location")
	private WebElement location;
	
	@FindBy(id="hotels")
	private WebElement hotel;
	
	@FindBy(id="room_type")
	private WebElement roomType;

	@FindBy(id="room_nos")
	private WebElement noOfRooms;
	
	
	@FindBy(id="datepick_in")
	private WebElement checkIn;
	
	@FindBy(id="datepick_out")
	private WebElement checkOut;
	
	@FindBy(id="adult_room")
	private WebElement adults;
	
	@FindBy(id="child_room")
	private WebElement children;

	@FindBy(id="Submit")
	private WebElement search;
	
	@FindBy(xpath="//a[text()='Booked Itinerary']")
	private WebElement bookedItinerary;
	
	public WebElement getBookedItinerary() {
		return bookedItinerary;
	}

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotel() {
		return hotel;
	}

	public WebElement getRoomType() {
		return roomType;
	}

	public WebElement getNoOfRooms() {
		return noOfRooms;
	}

	public WebElement getCheckIn() {
		return checkIn;
	}

	public WebElement getCheckOut() {
		return checkOut;
	}

	public WebElement getAdults() {
		return adults;
	}

	public WebElement getChildren() {
		return children;
	}

	public WebElement getSearch() {
		return search;
	}
	
	public void searchHotel(String s1,String s2,String s3,String s4,String s5,String s6,String s7,String s8) {
		
		selectOption(getLocation(), s1);
		selectOption(getHotel(), s2);
		selectOption(getRoomType(),s3);
		selectOption(getNoOfRooms(),s4);
		sendInput(getCheckIn(),s5);
		sendInput(getCheckOut(),s6);
		selectOption(getAdults(),s7);
		selectOption(getChildren(),s8);
		click(getSearch());
	}
	
	public void clickBookedItinerary() throws InterruptedException {
		
		Thread.sleep(5000);
		
		click(getBookedItinerary());
	}
	
	
}
