Feature: GetStarted page without logging on

Scenario: Data Structures dropdown validation
Given User is on the Get Started Page
When User clicks on Data Structures dropdown arrow
Then User should see the list of six options in Data Structures dropdown pane
|Arrays|
|Linked List|
|Stack|
|Queue|
|Tree|
|Graph|
When User clicks on any option
Then User should see the error message "You are not logged in"

Scenario: Get Star
ted button validation of DataStructures
Given User is on the Get Started Page
When User clicks on Get Started button of any Data Structures section
Then User should see the error message "You are not logged in"

Scenario: Register and login links UI verification
Given User is on the Get Started Page 
Then User should see register and login links 


