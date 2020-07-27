$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:FeaturesFilesTest/flightbooking.feature");
formatter.feature({
  "name": "Flight Booking",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Visit the website and select fatest route",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user enter ibibo website url in browser",
  "keyword": "Given "
});
formatter.match({
  "location": "com.stepDefinition.flightTravel.FlightBookingStepDef.user_enter_ibibo_website_url_in_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters the source \"bengaluru\" and destination \"mumbai\" details",
  "keyword": "Then "
});
formatter.match({
  "location": "com.stepDefinition.flightTravel.FlightBookingStepDef.user_enters_the_source_and_destination_details(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user selects the travel date",
  "keyword": "Then "
});
formatter.match({
  "location": "com.stepDefinition.flightTravel.FlightBookingStepDef.user_selects_the_travel_date()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on search button",
  "keyword": "Then "
});
formatter.match({
  "location": "com.stepDefinition.flightTravel.FlightBookingStepDef.user_click_on_search_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "search details displayed",
  "keyword": "And "
});
formatter.match({
  "location": "com.stepDefinition.flightTravel.FlightBookingStepDef.search_details_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on book now button",
  "keyword": "Then "
});
formatter.match({
  "location": "com.stepDefinition.flightTravel.FlightBookingStepDef.user_click_on_book_now_button()"
});
formatter.result({
  "status": "passed"
});
});