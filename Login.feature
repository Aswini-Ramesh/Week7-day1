Feature: Login functionality for leaftabs application

Background: 
Given Open the Chrome browser

Scenario Outline: Login with positive credential

And Load the application url <url>
And Enter the username <username>
And Enter the password <password>
When Click on Login button
Then Homepage should be displayed

Examples:
|url|username|password|
|'http://leaftaps.com/opentaps/control/main'|'Demosalesmanager'|'crmsfa'|
|'http://leaftaps.com/opentaps/control/main'|'DemoCSR'|'crmsfa'|

Scenario: Login with negative credential

And Load the application url 'http://leaftaps.com/opentaps/control/main'
And Enter the username 'Demo'
And Enter the password 'crmsfa'
When Click on Login button
But Error message should be displayed  










