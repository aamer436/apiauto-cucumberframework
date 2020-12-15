package stepDef;

import java.util.Map;

import com.supportingclasses.reqres.Utils;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Twitter_GetTrendsOfGivenCountry extends Utils {
// private static String woeid;
// RequestSpecification twitterReq;
// @Given("Fetch list of all available trends and get woeid for Country {string}")
// public void fetch_list_of_all_available_trends_and_get_woeid_for_Country(String countryName) {
//twitterReq=twitterRequestSpecificationBuilder(getPropValue("twitterurl"));
// Response resp=twitterReq.when().get("/1.1/trends/available.json");
// //System.out.println(resp.jsonPath().prettify());
// JsonPath js=resp.jsonPath();
// //Json
// int count=js.getInt("size()");
// //String woeid;
// // List<JsonList> result
// System.out.println("size of the available trends array is :"+count);
// for(int i=0;i<count;i++) {
// //System.out.println("country :"+js.getString("["+i+"].country"));
// if(js.getString("["+i+"].country").equalsIgnoreCase(countryName) && js.getString("["+i+"].parentid").equalsIgnoreCase("1")) {
// woeid=js.getString("["+i+"].woeid");
// System.out.println("woe id matched at ith position: "+i+" with value :"+woeid);
// }
// }
//
// }
//
// @Then("Display trends for a given country")
// public void display_trends_for_a_given_country() {
// System.out.println("Dummy method with woeid :"+woeid);
// Response resp=twitterReq.queryParam("id", woeid).when().get("/1.1/trends/place.json");
// //System.out.println(resp.jsonPath().prettify());
// JsonPath js=resp.jsonPath();
// //Json
// int count=js.getInt("size()");
// int sizeOfTrendsArray=js.getInt("[0].trends.size()");
// System.out.println("size of the available trends array is :"+count);
// //Map<String, Object> firstMap
// for(int i=0;i<sizeOfTrendsArray;i++) {
// //System.out.println( "response :"+js.getString("[0].trends["+i+"]"));
// System.out.println("printing "+i+" th JSON Array");
// Map<String, Object> firstMap=js.getMap("[0].trends["+i+"]");
// System.out.println("firstMap size is :" + firstMap.size());
// System.out.println("Hashtag name= "+firstMap.get("name")+" Hashtag count at the moment: "+firstMap.get("tweet_volume"));
// //String ar[]=new String[10];
// //String[] ar=new String[10];
//// for (Object str : firstMap.keySet()) {
//// if(firstMap.get(str)==null) {
//// System.out.println(str+" : "+null);
//// }else {
//// System.out.println(str + " : " + firstMap.get(str).toString());
//// }
//// }
// System.out.println("*************");
// }
// }
// 
}
