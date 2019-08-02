package org.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GreensReview {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lakshmi\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.get("http://www.greenstechnologys.com/selenium-course-content.html");
	WebElement text =driver.findElement(By.xpath("//p[contains(text(),'Our')]"));
	String a= text.getText();
	System.out.println(a);
	
	}

}
