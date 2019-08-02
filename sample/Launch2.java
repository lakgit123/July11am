package org.sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Launch2 {
public static void main(String[] args) {
	System.setProperty("webdriver.ie.driver","C:\\Users\\Lakshmi\\eclipse-workspace\\Selenium\\drivers\\IEDriverServer.exe");
	WebDriver driver= new InternetExplorerDriver();
	driver.get("http://www.greenstechnologys.com/");
	driver.get("http://www.flipkart.com/");
	driver.get("http://www.greenstechnologys.com/selenium-course-content.html");
	String url = driver.getCurrentUrl();
	System.out.println(url);
	String ti = driver.getTitle();
	System.out.println(ti);
	
}
}
