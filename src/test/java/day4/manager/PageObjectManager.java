package day4.manager;

import com.pages.BookHotelPage;
import com.pages.BookingConfirmationPage;
import com.pages.LoginPage;
import com.pages.SearchHotelPage;
import com.pages.SelectHotelPage;

public class PageObjectManager {
	
	private  LoginPage loginPage;
	private  SearchHotelPage searchHotelPage;
	private  SelectHotelPage selectHotelPage;
	private  BookHotelPage bookHotelPage;
	private  BookingConfirmationPage bookingConfirmationPage;
	
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
