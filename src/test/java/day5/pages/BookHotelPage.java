package day5.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.reuse.Reusable;

public class BookHotelPage extends Reusable {
	
	public BookHotelPage() {
		PageFactory.initElements(driver,this);
	}

	
	@FindBy(id="first_name")
	private WebElement firstName;

	@FindBy(id="last_name")
	private WebElement lastName;
	
	@FindBy(id="address")
	private WebElement address;
	
	@FindBy(id="cc_num")
	private WebElement cardNumber;
	
	@FindBy(id="cc_type")
	private WebElement cardType;
	
	@FindBy(id="cc_exp_month")
	private WebElement expiryMonth;
	
	@FindBy(id="cc_exp_year")
	private WebElement expiryYear;
	
	@FindBy(id="cc_cvv")
	private WebElement cvv;
	
	@FindBy(id="book_now")
	private WebElement bookHotel;

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCardNumber() {
		return cardNumber;
	}

	public WebElement getCardType() {
		return cardType;
	}

	public WebElement getExpiryMonth() {
		return expiryMonth;
	}

	public WebElement getExpiryYear() {
		return expiryYear;
	}

	public WebElement getCvv() {
		return cvv;
	}

	public WebElement getBookHotel() {
		return bookHotel;
	}
	
	
	public void giveDetails(String string1,String string2,String string3, String string4, String string5,String string6,String string7,String string8) throws InterruptedException {
		
		 sendInput(getFirstName(),string1);
		 sendInput(getLastName(),string2);
		    sendInput(getAddress(),string3);
		    sendInput(getCardNumber(),string4);
		    selectOption(getCardType(),string5);
		    selectOption(getExpiryMonth(),string6);
		    selectOption(getExpiryYear(),string7);
		    sendInput(getCvv(),string8);
		    Thread.sleep(3000);
	}
	
	public void bookHotel() throws InterruptedException {
		
		click(getBookHotel());
		Thread.sleep(3000);
	}
	
	
	
}
