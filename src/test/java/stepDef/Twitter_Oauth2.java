package stepDef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import com.supportingclasses.reqres.Utils;
import static io.restassured.RestAssured.given;

public class Twitter_Oauth2 extends Utils {
public static String access_token;
@Given("user authenticates twitter using access token logic")
public void user_authenticates_twitter_using_access_token_logic() {
Response 
resp=given().relaxedHTTPSValidation().urlEncodingEnabled(false).queryParam("grant_type", 
"client_credentials").auth().preemptive().basic(getPropValue("apiKey"), 
getPropValue("apiSecret"))
.when().post("https://api.twitter.com/oauth2/token");
System.out.println(" response is :"+resp.jsonPath().prettify());
JsonPath js=resp.jsonPath();
access_token=js.getString("access_token");
System.out.println("access token with oauth2 is :"+access_token);
 }

@Then("verify that user able to read tweets once authentication is successful")
public void 
verify_that_user_able_to_read_tweets_once_authentication_is_successful() {
System.out.println(" in second method");
Response res=given().relaxedHTTPSValidation().urlEncodingEnabled(false).auth().oauth2(access_token).when().post("https://api.twitter.com/1.1/statuses/update.json?status=test+tweet+test");
System.out.println("*******use of access_token");
System.out.println(res.jsonPath().prettify());
}

}
