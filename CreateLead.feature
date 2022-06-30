Feature: Create Lead in leaftaps application


Scenario: Create Lead with mandatory info
Given Open the Chrome browser
And Load the application url 'http://leaftaps.com/opentaps'
And Enter the username 'Demosalesmanager'
And Enter the password 'crmsfa'
When Click on Login button
Then Homepage should be displayed
When Click on link 'CRM/SFA'
Then Myhome page should be displayed
When Click on Leads Link
Then Leads page should be displayed
When Click on Create Lead link
Then Create Lead page should be displayed
Given User Enter the Company name 'TestLeaf'
And User enter the First Name 'Haja'
And User enter the Last Name 'J'
And User enter the FirstName Local 'Aswini'
And User enter the department 'Production'
And User enter the description 'Production is the significant part of organization'
And User enter the EmilId 'rameshsumathi003@gmail.com'
When Click on the drop down
When Click on the Create Lead button
Then Lead Created Page should be displayed
When User Click on Edit
When User clear the description
And The user Update the Leadform 'Lead Created Sucessfully'
When User click on the update button
Then View Lead should be displayed