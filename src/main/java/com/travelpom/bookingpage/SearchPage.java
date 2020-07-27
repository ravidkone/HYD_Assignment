package com.travelpom.bookingpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.utility.TestBase;

public class SearchPage extends TestBase{

	@FindBy(id = "gosuggest_inputSrc")
	WebElement sourceField;
	@FindBy(xpath = "//span[text()='Bengaluru, India']")
	WebElement selectSource;
	@FindBy(id = "gosuggest_inputDest")
	WebElement destField;
	@FindBy(xpath = "//span[text()='Mumbai, India']")
	WebElement selectDest;
	@FindBy(id = "departureCalendar")
	WebElement calender;
	@FindBy(id = "fare_20200731")
	WebElement selectDate;
	@FindBy(id = "gi_search_btn")
	WebElement searchBtn;
	@FindBy(xpath = "//span[text()='4pm - 9pm']" )
	WebElement eveningSlot;
	@FindBy(xpath = "(//input[@value='BOOK'])[1]")
	WebElement bookBtn;

	public SearchPage() {
	PageFactory.initElements(driver, this);
	}
	
	public String getPageTitle() {
		return driver.getTitle();
		
	}
	
	public void EnterLocation(String src, String dest) throws Exception {
		System.out.println(src+dest);
		driver.findElement(By.id("gosuggest_inputSrc")).sendKeys(src);
		//sourceField.sendKeys(src);
		//oCommon.waitForElementVisible(driver, selectSource, 3);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Bengaluru, India']")).click();
		//selectSource.click();
		//oCommon.waitForElementVisible(driver, destField, 3);
		driver.findElement(By.id("gosuggest_inputDest")).sendKeys(dest);
	//	destField.sendKeys(dest);
	//	oCommon.waitForElementVisible(driver, selectDest, 3);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Mumbai, India']")).click();
	//	selectDest.click();
	}
	public void selectTravelDate() {
		driver.findElement(By.id("departureCalendar")).click();
		//calender.click();
		driver.findElement(By.id("fare_20200731")).click();
		//selectDate.click();
	}
	public void searchFlights() {
		driver.findElement(By.id("gi_search_btn")).click();
		//searchBtn.click();
	}
	public void eveningFlights() {
		driver.findElement(By.xpath("//span[text()='4pm - 9pm']")).click();
		//eveningSlot.click();
	}
	public void bookFlight() {
		driver.findElement(By.xpath("(//input[@value='BOOK'])[1]")).click();
		//bookBtn.click();
	}
}
