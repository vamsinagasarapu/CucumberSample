package day2.stepdefinition;

import com.pages.BookHotelPage;
import com.pages.BookingConfirmationPage;
import com.pages.LoginPage;
import com.pages.SearchHotelPage;
import com.pages.SelectHotelPage;
import com.reuse.Reusable;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class LoginStep extends Reusable {
	
@Given("Adactin page is opened")
public void adactin_page_is_opened() throws InterruptedException {
	openBrowser();
	getApp("http://adactinhotelapp.com/index.php");	
}

@When("I entered the username and password")
public void i_entered_the_username_and_password() throws InterruptedException {
	
	LoginPage p1=new LoginPage();
	sendInput(p1.getUser(),"vamsinagasarapu");
	sendInput(p1.getPass(),"vamsi@1234");		
}

@Then("i should click the login button")
public void i_should_click_the_login_button() throws InterruptedException {
	LoginPage p1=new LoginPage();
	p1.getLoginbtn().click();
}

@Given("user is logged into the application.")
public void user_is_logged_into_the_application() {
	String title = driver.getTitle();
	Assert.assertTrue("page Title", title.contains("Search"));
}

@When("user selects the {string},{string},{string},{string},{string} And {string} fields")
public void user_selects_the_And_fields(String string, String string2, String string3, String string4, String string5, String string6) {	
	SearchHotelPage p2=new SearchHotelPage();
	selectOption(p2.getLocation(),string);
	selectOption(p2.getHotel(),string2);
	selectOption(p2.getRoomType(),string3);
	selectOption(p2.getNoOfRooms(),string4);
	sendInput(p2.getCheckIn(),string5);
	sendInput(p2.getCheckOut(),string6);
}

@When("selected the {string} And {string}")
public void selected_the_And(String string, String string2) {
	SearchHotelPage p2=new SearchHotelPage();
	selectOption(p2.getAdults(),string);
	selectOption(p2.getChildren(),string2);
	}

@When("clicked on the search button.")
public void clicked_on_the_search_button() {	
	SearchHotelPage p2=new SearchHotelPage();
	click(p2.getSearch());
}


@When("select the hotel")
public void select_the_hotel() {
	SelectHotelPage p3=new SelectHotelPage();
	click(p3.getButton());
}

@When("click on the continue button")
public void click_on_the_continue_button() {
	SelectHotelPage p3=new SelectHotelPage();
	click(p3.getButtoncontinue());
}

@When("enter the {string},{string},{string}")
public void enter_the(String string, String string2, String string3) {
	BookHotelPage p4=new BookHotelPage();
	sendInput(p4.getFirstName(),string);
	sendInput(p4.getLastName(),string2);
	sendInput(p4.getAddress(),string3);
}

@When("enter the credit card number {string}")
public void enter_the_credit_card_number(String string) {
	BookHotelPage p4=new BookHotelPage();
	sendInput(p4.getCardNumber(),string);
}

@When("select the credit card type {string}")
public void select_the_credit_card_type(String string) {
	BookHotelPage p4=new BookHotelPage();
	selectOption(p4.getCardType(),string);
}

@When("select expiry month {string}")
public void select_expiry_month(String string) {
	BookHotelPage p4=new BookHotelPage();
	selectOption(p4.getExpiryMonth(),string);
}

@When("select expiry year {string}")
public void select_expiry_year(String string) {
	BookHotelPage p4=new BookHotelPage();
	selectOption(p4.getExpiryYear(),string);
}

@When("enter CVV {string}")
public void enter_CVV(String string) {
	BookHotelPage p4=new BookHotelPage();
	sendInput(p4.getCvv(),string);	
}

@When("click on submit button")
public void click_on_submit_button() throws InterruptedException {
	BookHotelPage p4=new BookHotelPage();
	click(p4.getBookHotel());
}

@When("click on the show itinerary button")
public void click_on_the_show_itinerary_button() throws InterruptedException {
    Thread.sleep(5000);
    BookingConfirmationPage p5=new BookingConfirmationPage();
	click(p5.getShowItinerary());
	quit();
}
}
