package stepDef;

import java.util.HashMap;

import com.paypal.base.Items;
import com.paypal.base.PayPal_PaymentObj;
import com.paypal.base.Paypal_request;
import com.supportingclasses.reqres.Utils;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.restassured.response.Response;

public class Paypal_postpaymentrequest extends Utils {
public String accessToken;
PayPal_PaymentObj result;
@Given("generate paypal auth request using oauth client creds grant type")
public void 
generate_paypal_auth_request_using_oauth_client_creds_grant_type() {
Response 
resp=getOauth2AccessTokenUsingClientCreds(getPropValue("paypalappurl"))
.when().post("https://api-m.sandbox.paypal.com/v1/oauth2/token");
System.out.println(resp.jsonPath().prettify());
accessToken=resp.jsonPath().getString("access_token");
}

@Then("verify the generated access token")
public void verify_the_generated_access_token() {
System.out.println("methodB");
PayPal_PaymentObj payPal_PaymentObj=new Paypal_request().createPaymentBody();
Response resp=paypalRequestSpecificationBuilder(getPropValue("paypalappurl"),accessToken).log().all()
.when().body(payPal_PaymentObj).post("/payments/payment");
System.out.println("POJO resp starts here");
System.out.println(resp.jsonPath().prettify());

result=resp.as(PayPal_PaymentObj.class);
}

@Then("Submit the payment post request")
public void submit_the_payment_post_request() {
System.out.println("methodC");
System.out.println("create time is :"+result.getCreate_time());
System.out.println("id :"+result.getId()+" and state :"+ result.getState());
Items item=result.getTransactions().get(0).getItem_list().getItems().get(0);
System.out.println("item details are: "+
item.getCurrency()+" "+item.getTax());
System.out.println("payment method :"+result.getTransactions().get(0).getPayment_options().getAllowed_payment_method());
System.out.println("recurring flag :"+result.getTransactions().get(0).getPayment_options().isRecurring_flag());
System.out.println("shpping discount :"+result.getTransactions().get(0).getAmount().getDetails().getShipping_discount());
System.out.println("shpping discount :"+result.getTransactions().get(0).getDescription());


}
}
