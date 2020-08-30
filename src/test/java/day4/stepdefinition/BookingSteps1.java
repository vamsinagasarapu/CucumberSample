package day4.stepdefinition;

import com.pages.BookHotelPage;
import com.pages.BookingConfirmationPage;
import com.pages.LoginPage;
import com.pages.SearchHotelPage;
import com.pages.SelectHotelPage;
import com.reuse.Reusable;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import day4.manager.PageObjectManager;

public class BookingSteps1 extends Reusable{	
 PageObjectManager pom;
 
@Given("user is on the login page , {string} And {string} and click the login button")
public void user_is_on_the_login_page_And_and_click_the_login_button(String string, String string2) throws InterruptedException {
	
	openBrowser();
	getApp("http://adactinhotelapp.com/");
	
	pom=new PageObjectManager();
	LoginPage lp=pom.getLoginPage();

	sendInput(lp.getUser(), string);
	sendInput(lp.getPass(), string2);
	click(lp.getLoginbtn());	
}

@When("user is logged in , selects the {string},{string},{string},{string},{string} And {string} And {string} And {string} fields and click on the search button")
public void user_is_logged_in_selects_the_And_And_And_fields_and_click_on_the_search_button(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8) {
	
	SearchHotelPage shp=pom.getSearchHotelPage();
	selectOption(shp.getLocation(), string);
	selectOption(shp.getHotel(), string2);
	selectOption(shp.getRoomType(),string3);
	selectOption(shp.getNoOfRooms(),string4);
	sendInput(shp.getCheckIn(),string5);
	sendInput(shp.getCheckOut(),string6);
	selectOption(shp.getAdults(),string7);
	selectOption(shp.getChildren(),string8);
	click(shp.getSearch());
}

@When("user is navigated to the hotel selection page , select the hotel and click on continue")
public void user_is_navigated_to_the_hotel_selection_page_select_the_hotel_and_click_on_continue() {
	
    SelectHotelPage sh=pom.getSelectHotelPage();
    click(sh.getButton());
    click(sh.getButtoncontinue());
}

@When("user should enter the {string},{string} , {string},{string},{string},{string},{string},{string}")
public void user_should_enter_the(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8) {
	
	BookHotelPage bh=pom.getBookHotelPage();
    sendInput(bh.getFirstName(),string);
    sendInput(bh.getLastName(),string2);
    sendInput(bh.getAddress(),string3);
    sendInput(bh.getCardNumber(),string4);
    selectOption(bh.getCardType(),string5);
    selectOption(bh.getExpiryMonth(),string6);
    selectOption(bh.getExpiryYear(),string7);
    sendInput(bh.getCvv(),string8);
}

@Then("user should be able to click on the submit button")
public void user_should_be_able_to_click_on_the_submit_button() {
	
	BookHotelPage bh=pom.getBookHotelPage();
    click(bh.getBookHotel());
}

@Then("when user click on the show Itinerary button, the selected hotel should be displayed")
public void when_user_click_on_the_show_Itinerary_button_the_selected_hotel_should_be_displayed() throws InterruptedException {
	
    BookingConfirmationPage bcp=pom.getBookingConfirmationPage();
    click(bcp.getShowItinerary());
    Thread.sleep(5000);
    quit();
}
}
