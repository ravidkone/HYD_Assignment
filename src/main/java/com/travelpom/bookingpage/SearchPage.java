package com.travelpom.bookingpage;

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
	
	@FindBy(xpath = "//span[@class='DayPicker-NavButton DayPicker-NavButton--next']")
	WebElement nextBtn;
	@FindBy(id = "fare_20200827")
	WebElement selectDate;
	@FindBy(id = "gi_search_btn")
	WebElement searchBtn;
	@FindBy(xpath = "//span[text()='4pm - 9pm']" )
	WebElement eveningSlot;
	
	@FindBy(xpath = "//span[text()='DURATION']")
	WebElement sortDuration;
	
	@FindBy(xpath = "(//input[@value='BOOK'])[1]")
	WebElement bookBtn;

	public SearchPage(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(this.driver, this);
	
	}
	
	public String getPageTitle() {
		System.out.println(driver);
		return driver.getTitle();
		
	}
	
	public void EnterLocation(String src, String dest) throws Exception {
		System.out.println(src+dest);
		sourceField.sendKeys(src);
		oCommon.waitForElementVisible(driver, selectSource, 3);
		selectSource.click();
		oCommon.waitForElementVisible(driver, destField, 3);
		destField.sendKeys(dest);
		oCommon.waitForElementVisible(driver, selectDest, 3);
		selectDest.click();
	}
	public void selectTravelDate() {
		calender.click();
		nextBtn.click();
		selectDate.click();
	}
	public void searchFlights() {
		searchBtn.click();
	}
	public void eveningFlights() throws Exception {
		
		eveningSlot.click();
		oCommon.waitForElementVisible(driver, bookBtn, 3);
		sortDuration.click();
	}
	public void bookFlight() throws Exception {
		oCommon.waitForElementVisible(driver, bookBtn, 3);
		bookBtn.click();
	}
}
