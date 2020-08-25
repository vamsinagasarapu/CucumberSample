package com.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class LoginStep {

	WebDriver driver;

@Given("Adactin page is opened")
public void adactin_page_is_opened() throws InterruptedException {
System.setProperty("webdriver.chrome.driver","C:\\Users\\Vamsi Krishna\\Programming_support_files\\browser-drivers\\chrome\\chromedriver_win32\\chromedriver.exe");
    
	Thread.sleep(10000);
	driver =new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("http://adactinhotelapp.com/"); 
}

@When("I entered the username and password")
public void i_entered_the_username_and_password() throws InterruptedException {

	Thread.sleep(5000);
    driver.findElement(By.xpath("//input[@name='username']")).sendKeys("vamsinagasarapu");
	Thread.sleep(5000);
    driver.findElement(By.xpath("//input[@name='password']")).sendKeys("vamsi@1234");

}

@Then("i should click the login button")
public void i_should_click_the_login_button() throws InterruptedException {
   
	Thread.sleep(5000);
    driver.findElement(By.xpath("//input[@type='Submit']")).click();
	
}

@Given("user is logged into the application.")
public void user_is_logged_into_the_application() {
	

	String title = driver.getTitle();
	//Assert.assertEquals("page Title", title.contains("Search"));
    
}

@When("user selects the {string},{string},{string},{string},{string} And {string} fields")
public void user_selects_the_And_fields(String string, String string2, String string3, String string4, String string5, String string6) {
	

	WebElement location = driver.findElement(By.xpath("//select[@name='location']"));
	Select s1=new Select(location);
	s1.selectByVisibleText(string);
	
	WebElement hotels = driver.findElement(By.xpath("//select[@name='hotels']"));
	Select s2=new Select(hotels);
	s2.selectByVisibleText(string2);
	
	WebElement room = driver.findElement(By.xpath("//select[@name='room_type']"));
	Select s3=new Select(room);
	s3.selectByVisibleText(string3);
	
	WebElement num = driver.findElement(By.xpath("//select[@name='room_nos']"));
	Select s4=new Select(num);
	s4.selectByVisibleText(string4);
	
	WebElement checkIn = driver.findElement(By.xpath("//input[@name='datepick_in']"));
	checkIn.sendKeys(string5);
	
	WebElement checkOut = driver.findElement(By.xpath("//input[@name='datepick_out']"));
	checkOut.sendKeys(string6);
    
}

@When("selected the {string} And {string}")
public void selected_the_And(String string, String string2) {
	
	WebElement adults = driver.findElement(By.xpath("//select[@name='adult_room']"));
	WebElement children = driver.findElement(By.xpath("//select[@name='child_room']"));
	
	Select s1=new Select(adults);
	Select s2=new Select(children);	
	s1.selectByVisibleText(string);
	s2.selectByVisibleText(string2);
}

@When("clicked on the search button.")
public void clicked_on_the_search_button() {	
	WebElement subbtn = driver.findElement(By.xpath("//input[@type='submit']"));
	subbtn.click();
}

@When("select the hotel")
public void select_the_hotel() {
	driver.findElement(By.xpath("//input[@name='radiobutton_0']")).click();
}

@When("click on the continue button")
public void click_on_the_continue_button() {
	driver.findElement(By.xpath("//input[@type='submit']")).click();
}

@When("enter the {string},{string},{string}")
public void enter_the(String string, String string2, String string3) {
driver.findElement(By.xpath("//input[@name='first_name']")).sendKeys(string);
driver.findElement(By.xpath("//input[@name='last_name']")).sendKeys(string2);
driver.findElement(By.xpath("//textarea[@name='address']")).sendKeys(string3);
}

@When("enter the credit card number {string}")
public void enter_the_credit_card_number(String string) {
    driver.findElement(By.xpath("//input[@name='cc_num']")).sendKeys(string);
}

@When("select the credit card type {string}")
public void select_the_credit_card_type(String string) {
WebElement card_type=driver.findElement(By.xpath("//select[@name='cc_type']"));
Select s=new Select(card_type);
s.selectByVisibleText(string);
}

@When("select expiry month {string}")
public void select_expiry_month(String string) {
    WebElement exp_month=driver.findElement(By.xpath("//select[@name='cc_exp_month']"));
	Select s2=new Select(exp_month);
	s2.selectByVisibleText(string);
}

@When("select expiry year {string}")
public void select_expiry_year(String string) {
    WebElement exp_year=driver.findElement(By.xpath("//select[@name='cc_exp_year']"));
	Select s3=new Select(exp_year);
	s3.selectByVisibleText(string);
}

@When("enter CVV {string}")
public void enter_CVV(String string) {
	driver.findElement(By.xpath("//input[@name='cc_cvv']")).sendKeys(string);
}

@When("click on submit button")
public void click_on_submit_button() throws InterruptedException {
	Thread.sleep(5000);
    driver.findElement(By.xpath("//input[@type='button']")).click();
}

@When("click on the show itinerary button")
public void click_on_the_show_itinerary_button() throws InterruptedException {
    Thread.sleep(5000);
	driver.findElement(By.xpath("//input[@name='my_itinerary']")).click();
	
	driver.quit();
}
}
