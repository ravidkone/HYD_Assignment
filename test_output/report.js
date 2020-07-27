$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:FeaturesFilesTest/chrome.feature");
formatter.feature({
  "name": "Flight Booking",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Visit the website and select fatest route",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@chrome"
    }
  ]
});
formatter.step({
  "name": "user enter ibibo website url in \"chrome\"",
  "keyword": "Given "
});
formatter.match({
  "location": "com.stepDefinition.flightTravel.FlightBookingStepDef.user_enter_ibibo_website_url_in_browser(java.lang.String)"
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
formatter.uri("file:FeaturesFilesTest/safari.feature");
formatter.feature({
  "name": "Flight Booking",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Visit the website and select fatest route",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@safari"
    }
  ]
});
formatter.step({
  "name": "user enter ibibo website url in \"safari\"",
  "keyword": "Given "
});
formatter.match({
  "location": "com.stepDefinition.flightTravel.FlightBookingStepDef.user_enter_ibibo_website_url_in_browser(java.lang.String)"
});
formatter.result({
  "error_message": "org.openqa.selenium.SessionNotCreatedException: Could not create a session: The session timed out while connecting to a Safari instance.\nBuild info: version: \u00273.8.1\u0027, revision: \u00276e95a6684b\u0027, time: \u00272017-12-01T18:33:54.468Z\u0027\nSystem info: host: \u0027Ravi.local\u0027, ip: \u0027fe80:0:0:0:e7:cd66:46c5:dfca%en0\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.15.5\u0027, java.version: \u00271.8.0_211\u0027\nDriver info: driver.version: SafariDriver\nremote stacktrace: \n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\n\tat org.openqa.selenium.remote.W3CHandshakeResponse.lambda$new$0(W3CHandshakeResponse.java:57)\n\tat org.openqa.selenium.remote.W3CHandshakeResponse.lambda$getResponseFunction$2(W3CHandshakeResponse.java:104)\n\tat org.openqa.selenium.remote.ProtocolHandshake.lambda$createSession$0(ProtocolHandshake.java:123)\n\tat java.util.stream.ReferencePipeline$3$1.accept(ReferencePipeline.java:193)\n\tat java.util.Spliterators$ArraySpliterator.tryAdvance(Spliterators.java:958)\n\tat java.util.stream.ReferencePipeline.forEachWithCancel(ReferencePipeline.java:126)\n\tat java.util.stream.AbstractPipeline.copyIntoWithCancel(AbstractPipeline.java:498)\n\tat java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)\n\tat java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:471)\n\tat java.util.stream.FindOps$FindOp.evaluateSequential(FindOps.java:152)\n\tat java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)\n\tat java.util.stream.ReferencePipeline.findFirst(ReferencePipeline.java:464)\n\tat org.openqa.selenium.remote.ProtocolHandshake.createSession(ProtocolHandshake.java:126)\n\tat org.openqa.selenium.remote.ProtocolHandshake.createSession(ProtocolHandshake.java:73)\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:142)\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:601)\n\tat org.openqa.selenium.remote.RemoteWebDriver.startSession(RemoteWebDriver.java:219)\n\tat org.openqa.selenium.remote.RemoteWebDriver.\u003cinit\u003e(RemoteWebDriver.java:142)\n\tat org.openqa.selenium.safari.SafariDriver.\u003cinit\u003e(SafariDriver.java:78)\n\tat org.openqa.selenium.safari.SafariDriver.\u003cinit\u003e(SafariDriver.java:60)\n\tat org.openqa.selenium.safari.SafariDriver.\u003cinit\u003e(SafariDriver.java:38)\n\tat com.qa.utility.TestBase.initilization(TestBase.java:45)\n\tat com.stepDefinition.flightTravel.FlightBookingStepDef.user_enter_ibibo_website_url_in_browser(FlightBookingStepDef.java:17)\n\tat ✽.user enter ibibo website url in \"safari\"(file:///Users/ravi.kone/Documents/Test-WorkSpace/TravelProjects/HYD_Assignment/FeaturesFilesTest/safari.feature:6)\n",
  "status": "failed"
});
formatter.step({
  "name": "user enters the source \"bengaluru\" and destination \"mumbai\" details",
  "keyword": "Then "
});
formatter.match({
  "location": "com.stepDefinition.flightTravel.FlightBookingStepDef.user_enters_the_source_and_destination_details(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user selects the travel date",
  "keyword": "Then "
});
formatter.match({
  "location": "com.stepDefinition.flightTravel.FlightBookingStepDef.user_selects_the_travel_date()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user click on search button",
  "keyword": "Then "
});
formatter.match({
  "location": "com.stepDefinition.flightTravel.FlightBookingStepDef.user_click_on_search_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "search details displayed",
  "keyword": "And "
});
formatter.match({
  "location": "com.stepDefinition.flightTravel.FlightBookingStepDef.search_details_displayed()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user click on book now button",
  "keyword": "Then "
});
formatter.match({
  "location": "com.stepDefinition.flightTravel.FlightBookingStepDef.user_click_on_book_now_button()"
});
formatter.result({
  "status": "skipped"
});
});