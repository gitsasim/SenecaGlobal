Feature: Google

Scenario: Login Test Scenario

Given user is navigated to google Page
When user clicks on I am Feeling Lucky button
Then user is navigated to doodles page
Then user gets the title/hyperlink/div tag of the first doodle thumbnail
Then user prints the result


Scenario: Facebook Create NEw Account

Given user is navigated to facebook page
When user clicks on Create New Account link
And user complete the steps
Then user clicks on Sign Up button
