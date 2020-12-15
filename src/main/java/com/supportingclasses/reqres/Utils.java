package com.supportingclasses.reqres;

import static io.restassured.RestAssured.given;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Properties;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.specification.RequestSpecification;

public class Utils {
public static RequestSpecification req;
public static RequestSpecification twitterreq;
public static RequestSpecification facebookreq;
public static RequestSpecification paypalReq;
public RequestSpecification requestSpecification(String appUrl) {
try {
PrintStream log = new PrintStream(new FileOutputStream("loggin.txt"));
if(req==null) {
req=new 
RequestSpecBuilder().setRelaxedHTTPSValidation().setBaseUri(appUrl).setUrlEncodingEnabled(false)
.addFilter(RequestLoggingFilter.logRequestTo(log))
.addFilter(ResponseLoggingFilter.logResponseTo(log))
.setContentType(ContentType.JSON)
.build();
return req;}
} catch (FileNotFoundException e) {
// TODO Auto-generated catch block
e.printStackTrace();
}
return req;

}

public RequestSpecification twitterRequestSpecificationBuilder(String 
appUrl) {
twitterreq=given().spec(requestSpecification(appUrl)).auth().oauth(
getPropValue("apiKey"), 
getPropValue("apiSecret"),getPropValue("accessToken"),getPropValue("accessTokenSecret"));
return twitterreq;
}
public RequestSpecification getOauth2AccessTokenUsingAuthCode(String 
appUrl,String authCode) {
facebookreq=given().spec(requestSpecification(appUrl)).queryParam("grant_type", 
"authorization_code")
.queryParam("code", authCode)
.queryParam("redirect_uri", getPropValue("redirect_uri"))
.queryParam("client_id", getPropValue("facebookAppKey"))
.queryParam("client_secret", getPropValue("facebookAppSecret"));
return facebookreq;
}
public RequestSpecification getFacebookRequestSpecBuilder(String 
fbBaseUrl,String accessToken) {
facebookreq=given().spec(requestSpecification(fbBaseUrl)).queryParam("access_token", 
accessToken);
return facebookreq;
}

public RequestSpecification getOauth2AccessTokenUsingClientCreds(String 
appUrl) {
facebookreq=given().relaxedHTTPSValidation().urlEncodingEnabled(false).auth().preemptive().basic(getPropValue("paypalClientid"), 
getPropValue("paypalClientSecret"))
.queryParam("grant_type", "client_credentials");
return facebookreq;
}
public RequestSpecification paypalRequestSpecificationBuilder(String 
appUrl,String accessToken) {
paypalReq=given().spec(requestSpecification(appUrl)).auth().oauth2(accessToken);
return paypalReq;
}

public String getPropValue(String key) {
Properties prop=new Properties();
try {
FileInputStream fis = new 
FileInputStream("C:\\Users\\AzgherHussain\\eclipse-workspace\\apiautopractice\\src\\main\\java\\com\\supportingclasses\\reqres\\global.properties");
prop.load(fis);
} catch (IOException e) {
// TODO Auto-generated catch block
e.printStackTrace();
}
return prop.getProperty(key);
}

public int sizeofJsonArray(JsonPath js,String jsonPath) {
return js.getInt(jsonPath+"size()");
}
public void getJsonArrayContents(JsonPath js,String jsonPath ) {
String[] arg=jsonPath.split(".");
for(int i=0;i<arg.length;i++) {
//Map<String, Object> firstMap = js.getMap("items[" + j + "].owner");
}

}


}
