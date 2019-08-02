package org.sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Launch {
public static void main(String[] args) {
	System.setProperty("webdriver.gecko.driver","C:\\Users\\Lakshmi\\eclipse-workspace\\Selenium\\drivers\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.get("http://www.greenstechnologys.com");
	String url1 = driver.getCurrentUrl();
	System.out.println(url1);
	driver.get("https://www.facebook.com/");
	String url2 = driver.getCurrentUrl();
	System.out.println(url2);
	driver.get("https://www.amazon.in");
	String url3 = driver.getCurrentUrl();
	System.out.println(url3);
	driver.get("http://www.greenstechnologys.com/selenium-course-content.html");
	String url4 = driver.getCurrentUrl();
	System.out.println(url4);
}
}
