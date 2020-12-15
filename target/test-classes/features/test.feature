Feature: Application Login

@Testabc
Scenario: Home page default login
Given User is on hgf NetBanking landing page
When User login into hg application with "jin" and password "1234"
Then Home page is hf populated
And Cards displayed are hf "true"