package day6.stepdefinition;

import day6.pages.BookHotelPage;
import day6.pages.BookedItineraryPage;
import day6.pages.BookingConfirmationPage;
import day6.pages.LoginPage;
import day6.pages.SearchHotelPage;
import day6.pages.SelectHotelPage;
import com.reuse.Reusable;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import day6.manager.PageObjectManager;

public class BookingSteps1 extends Reusable{	
	
 PageObjectManager pom;
 BookHotelPage bh;
 BookedItineraryPage bip;
 SelectHotelPage sh;
 
 
@Given("user is on the login page , {string} And {string} and click the login button")
public void user_is_on_the_login_page_And_and_click_the_login_button(String string, String string2) throws InterruptedException {
	count=count++;
	
	openBrowser();
	getApp("http://adactinhotelapp.com/");
	
	pom=PageObjectManager.getPOM();
	LoginPage lp=pom.getLoginPage();
	lp.login(string, string2);
	System.out.println(pom);
	System.out.println(lp);
	
}

@When("user is logged in , selects the {string},{string},{string},{string},{string} And {string} And {string} And {string} fields and click on the search button")
public void user_is_logged_in_selects_the_And_And_And_fields_and_click_on_the_search_button(String s1, String s2, String s3, String s4, String s5, String s6, String s7, String s8) {
	
	SearchHotelPage shp=pom.getSearchHotelPage();
	shp.searchHotel(s1, s2, s3, s4, s5, s6, s7, s8);
	System.out.println(shp);
}

@When("user is navigated to the hotel selection page , select the hotel and click on continue")
public void user_is_navigated_to_the_hotel_selection_page_select_the_hotel_and_click_on_continue() {
	
    sh=pom.getSelectHotelPage();
   sh.selectHotel();
   System.out.println(sh);
}

@When("user should enter the {string},{string} , {string},{string},{string},{string},{string},{string}")
public void user_should_enter_the(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8) throws InterruptedException {
	
   bh=pom.getBookHotelPage();
   bh.giveDetails(string, string2, string3, string4, string5, string6, string7, string8);
   System.out.println(bh);
}

@Then("user should be able to click on the submit button")
public void user_should_be_able_to_click_on_the_submit_button() throws InterruptedException {
	
    bh.bookHotel();
}

@Then("when user click on the show Itinerary button, the selected hotel should be displayed")
public void when_user_click_on_the_show_Itinerary_button_the_selected_hotel_should_be_displayed() throws InterruptedException {
	
    BookingConfirmationPage bcp=pom.getBookingConfirmationPage();
    bcp.showItinerary();
    System.out.println(bcp);
    System.out.println("\n\n\n");
    
}

@When("user selects the checkbox of the booked record and click on the cancel selected button , popup should appear.")
public void user_selects_the_checkbox_of_the_booked_record_and_click_on_the_cancel_selected_button_popup_should_appear() {
    bip = pom.getBookedItineraryPage();
    bip.selectHotelCheckBox();
}

@When("Ok is selected in the popup, booking should be cancelled.")
public void ok_is_selected_in_the_popup_booking_should_be_cancelled() {
    bip.clickCancel();
}

@Then("user is on the search hotel page and clicks on the Booked Itinerary")
public void user_is_on_the_search_hotel_page_and_clicks_on_the_Booked_Itinerary() throws InterruptedException {
	
	SearchHotelPage shp2=pom.getSearchHotelPage();
    shp2.clickBookedItinerary();
}


}
