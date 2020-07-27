Feature: Flight Booking

@safari
Scenario: Visit the website and select fatest route

Given user enter ibibo website url in "safari"
Then user enters the source "bengaluru" and destination "mumbai" details
Then user selects the travel date 
Then user click on search button
And search details displayed
Then user click on book now button
