Feature: ActiTime Website Login2

Scenario: ActiTime Login Page Test2

Given actitime website URL
Then user entered username "admin" and password "manager"
Then clicked on login button
And actitime website home page displayed
Then close the browser



Scenario Outline:: ActiTime Login Page Test

Given actitime website URL
Then user entered username "<username>" and password "<password>"
Then clicked on login button
And actitime website home page displayed
Then close the browser

Examples:
	| username | password |
	| admin    | manager  |
	| usernam  | passwors |