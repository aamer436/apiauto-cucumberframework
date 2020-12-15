package stepDef;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class test2steps {
@Given("User is on home page")
public void user_is_on_home_page() {
   // Write code here that turns the phrase above into concrete actions
System.out.println("**********");
System.out.println("step1");
}

@When("user click logout button")
public void user_click_logout_button() {
   // Write code here that turns the phrase above into concrete actions
System.out.println("step2");
}

@Then("home page is displayed")
public void home_page_is_displayed() {
   // Write code here that turns the phrase above into concrete actions
System.out.println("step3");
}

@And("signin button is activated")
public void signin_button_is_activated() {
   // Write code here that turns the phrase above into concrete actions
System.out.println("step4");
}
}
