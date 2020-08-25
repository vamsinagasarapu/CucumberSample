package com.reuse;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;

public class Reusable {
	
	public static WebDriver driver;
	
	public void openBrowser() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Vamsi Krishna\\Programming_support_files\\browser-drivers\\chrome\\chromedriver_win32\\chromedriver.exe");
	
	driver =new ChromeDriver();
    driver.manage().window().maximize();
    Thread.sleep(10000);
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    
	}
	
	public void getApp(String str) throws InterruptedException {
		driver.get(str);
		Thread.sleep(10000);
	}
	
	public void sendInput(WebElement ele , String str) {
		ele.sendKeys(str);	
	}
	
	public void click(WebElement ele) {
		ele.click();
	}
	
	public void selectOption(WebElement ele1 ,String text ) {
		Select s=new Select(ele1);
		s.selectByVisibleText(text);
	}
	
	public void quit() {
		driver.quit();
	}

}