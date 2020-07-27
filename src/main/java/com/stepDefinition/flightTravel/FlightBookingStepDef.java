package com.stepDefinition.flightTravel;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.qa.utility.TestBase;
import com.travelpom.bookingpage.SearchPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class FlightBookingStepDef extends TestBase{
	SearchPage sp=new SearchPage();
	
	@Given("user enter ibibo website url in browser")
	public void user_enter_ibibo_website_url_in_browser() {
		TestBase.initilization();
		Assert.assertEquals(oConstant.pageTitle,sp.getPageTitle());
	    System.out.println("Title Matched");
	}

	@Then("user enters the source \"(.*)\" and destination \"(.*)\" details$")
	public void user_enters_the_source_and_destination_details(String Src, String Dest) throws Exception {
		System.out.println("source is: "+Src+" and Dest is :"+Dest);
		sp.EnterLocation(Src, Dest);
		System.out.println("source and dest entered");
	}

	@Then("user selects the travel date")
	public void user_selects_the_travel_date() {
		sp.selectTravelDate();
	    System.out.println("date selected");
	}

	@Then("user click on search button")
	public void user_click_on_search_button() {
		sp.searchFlights();
	   System.out.println("clicked on search button");
	}

	@Then("search details displayed")
	public void search_details_displayed() {
		sp.eveningFlights();
	    System.out.println("flight details displayed");
	}

	@Then("user click on book now button")
	public void user_click_on_book_now_button() {
		sp.bookFlight();
	 System.out.println("clicked on book now button");
	 closeBrowser();
	}

}
