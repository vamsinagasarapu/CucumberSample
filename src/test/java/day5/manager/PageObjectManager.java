package day5.manager;

import day5.pages.BookHotelPage;
import day5.pages.BookingConfirmationPage;
import day5.pages.LoginPage;
import day5.pages.SearchHotelPage;
import day5.pages.SelectHotelPage;

public class PageObjectManager {
	
	private PageObjectManager() {
		
	}
	
	static PageObjectManager pageObjectManager;
	private  LoginPage loginPage;
	private  SearchHotelPage searchHotelPage;
	private  SelectHotelPage selectHotelPage;
	private  BookHotelPage bookHotelPage;
	private  BookingConfirmationPage bookingConfirmationPage;
	
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
	
}
