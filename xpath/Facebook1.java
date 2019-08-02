package org.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lakshmi\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.facebook.com/");
	WebElement user =driver.findElement(By.id("email"));
	user.sendKeys("testing@gmail.com");
	String a =user.getAttribute("value");
	WebElement password =driver.findElement(By.id("pass"));
	password.sendKeys("testing123");
	String b =password.getAttribute("value");
	System.out.println(a);
	System.out.println(b);
}
}
