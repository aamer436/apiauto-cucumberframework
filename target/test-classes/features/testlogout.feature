Feature: Application Logout

@Testkmp
Scenario: Home page logout
Given User is on home page
When user click logout button
Then home page is displayed 
And signin button is activated
