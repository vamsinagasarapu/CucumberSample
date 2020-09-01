package day6.manager;

import day6.pages.BookHotelPage;
import day6.pages.BookedItineraryPage;
import day6.pages.BookingConfirmationPage;
import day6.pages.LoginPage;
import day6.pages.SearchHotelPage;
import day6.pages.SelectHotelPage;

public class PageObjectManager {
	
	private PageObjectManager() {
		
	}
	
	static PageObjectManager pageObjectManager;
	private  LoginPage loginPage;
	private  SearchHotelPage searchHotelPage;
	private  SelectHotelPage selectHotelPage;
	private  BookHotelPage bookHotelPage;
	private  BookingConfirmationPage bookingConfirmationPage;
	private  BookedItineraryPage bookedItineraryPage;
	
	public static PageObjectManager getPOM() {
		return (pageObjectManager==null)?pageObjectManager=new PageObjectManager():pageObjectManager;
		
	}
	
	public LoginPage getLoginPage() {
		return (loginPage==null) ? loginPage=new LoginPage():loginPage;
	}
	
	
	public SearchHotelPage getSearchHotelPage() {
		return (searchHotelPage==null) ? searchHotelPage=new SearchHotelPage():searchHotelPage;
	}
	
	public SelectHotelPage getSelectHotelPage() {
		return (selectHotelPage==null) ? selectHotelPage=new SelectHotelPage():selectHotelPage;
	}
	
	public BookHotelPage getBookHotelPage() {
		return(bookHotelPage==null) ? bookHotelPage=new BookHotelPage():bookHotelPage;
	}
	
	public BookingConfirmationPage getBookingConfirmationPage() {
		return(bookingConfirmationPage==null) ? bookingConfirmationPage=new BookingConfirmationPage():bookingConfirmationPage;
	}
	
	public BookedItineraryPage getBookedItineraryPage() {
		return(bookedItineraryPage==null) ? bookedItineraryPage=new BookedItineraryPage():bookedItineraryPage;
	}
	
}
