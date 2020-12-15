Feature: Setup paypal authentication and submit payment request

Scenario: scenario is for setting up paypal authentication using rest 
assured
Given generate paypal auth request using oauth client creds grant type
Then verify the generated access token
Then Submit the payment post request
