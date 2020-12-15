package com.supportingclasses.reqres;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {
public WebDriver driver=null;
public WebDriver init() {
//WebDriverManager.chromedriver().setup();
//ChromeOptions options = new ChromeOptions();
//options.addArguments("--disable-notifications");
//WebDriver driver=new ChromeDriver(options);
WebDriverManager.firefoxdriver().setup();
FirefoxOptions firefoxoptions = new FirefoxOptions();
firefoxoptions.setProfile(new FirefoxProfile());
firefoxoptions.addPreference("dom.webnotifications.enabled", false);
WebDriver driver = new FirefoxDriver(firefoxoptions);

return driver;
}
public void launchApp(String url,WebDriver driver) {
//this.driver=driver;
driver.get(url);
}
public  void closeBrowser(WebDriver driver) {
driver.close();
}
public  String getBrowserUrl(WebDriver driver) {
return driver.getCurrentUrl();
}
}

