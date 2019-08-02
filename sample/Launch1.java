package org.sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch1 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Lakshmi\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");
WebDriver driver = new ChromeDriver();

driver.get("http://www.greenstechnologys.com/");

	driver.get("http://gmail.com/");
	
	
	driver.get("http://www.flipkart.com/");
	
	
	driver.get("http://www.greenstechnologys.com/selenium-course-content.html");
	
	String url = driver.getCurrentUrl();
	System.out.println(url);
	String ti = driver.getTitle();
	System.out.println(ti);
}
}
