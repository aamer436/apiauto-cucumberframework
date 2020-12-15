package stepDef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class testcode {

@Given("User is on hgf NetBanking landing page")
public void user_is_on_hgf_NetBanking_landing_page() {
   // Write code here that turns the phrase above into concrete actions
   System.out.println("step1");
}

@When("User login into hg application with {string} and password {string}")
public void user_login_into_hg_application_with_and_password(String string, 
String string2) {
   // Write code here that turns the phrase above into concrete actions
System.out.println("step2"+string+" "+string2);
}

@Then("Home page is hf populated")
public void home_page_is_hf_populated() {
   // Write code here that turns the phrase above into concrete actions
System.out.println("step3");
}

@Then("Cards displayed are hf {string}")
public void cards_displayed_are_hf(String string) {
   // Write code here that turns the phrase above into concrete actions
System.out.println("step4 "+string);
}
}
