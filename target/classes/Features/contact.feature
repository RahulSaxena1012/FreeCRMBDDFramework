Feature: Free CRM create contacts

Scenario Outline: Free CRM Create a new contact
Given user is already on Login Page
When title of login page is Free CRM
Then user enters "<username>" and "<password>"
Then user clicks on login button
Then user is on home page
Then user moves to the contact page
Then user enters contact details "<firstname>" and "<lastname>" and "<position>"
Then clicks on save button
Then Close the browser

Examples:
|username|password|firstname|lastname|position|
|Rahuls1012 |freecrm@1012|Tom| Peter | Manager| 
|Rahuls1012 |freecrm@1012|David | Dsauza | Director| 