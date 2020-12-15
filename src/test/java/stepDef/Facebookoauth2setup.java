package stepDef;

import org.apache.hc.core5.http.ContentType;
import org.openqa.selenium.WebDriver;
import static io.restassured.RestAssured.given;

import com.facebook.FacebookLoginPage;
import com.supportingclasses.reqres.DriverFactory;
import com.supportingclasses.reqres.Utils;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.restassured.response.Response;

public class Facebookoauth2setup extends Utils {
public  WebDriver driver;
public FacebookLoginPage fb;
public String authCodeUrl;
public String authCode;
public String accessToken;
DriverFactory df=new DriverFactory();
@Given("users hits the authorization url for getting auth code")
public void users_hits_the_authorization_url_for_getting_auth_code() {
driver=df.init();
df.launchApp(getPropValue("facebookUrl"),driver);
fb=new FacebookLoginPage(driver);
fb.logintoFacebook();
fb.permissionGrant();
authCodeUrl=df.getBrowserUrl(driver);

}

@Then("user fetches the auth code from the response")
public void user_fetches_the_auth_code_from_the_response() {
authCode=authCodeUrl.split("&")[0].split("=")[1];
System.out.println("authCode value is :"+authCode);
}

@Then("create access token url with the generated auth code")
public void create_access_token_url_with_the_generated_auth_code() {
Response 
resp=getOauth2AccessTokenUsingAuthCode(getPropValue("fbBaseUrl"),authCode)
.when().post("/v9.0/oauth/access_token");  //
System.out.println(" outcome starts here");
System.out.println(resp.jsonPath().prettify());
accessToken=resp.jsonPath().getString("access_token");

}

@And("verify that the access token is generated successfully")
public void verify_that_the_access_token_is_generated_successfully() {
System.out.println("last method "+accessToken);
Response 
resp=getFacebookRequestSpecBuilder(getPropValue("fbBaseUrl"),accessToken).when().get("/me");
System.out.println(" another request starts here");
System.out.println(resp.jsonPath().prettify());
}

}
