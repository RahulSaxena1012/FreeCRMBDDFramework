Feature: Deal Data Creation

Scenario: Free CRM create a new Deal

Given user is already on Login Page
When title of login page is Free CRM
Then user enters username and password
|Rahuls1012 | freecrm@1012 |
Then user clicks on login button
Then user is on home page
Then user moves to the deal page
Then user enters deal details
| TestDeal | 20000 | 50 | 10 |
Then Close the browser