package org.sendkeys;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Twitter {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Lakshmi\\\\eclipse-workspace\\\\Selenium\\\\drivers\\\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://twitter.com/login");
	WebElement user = driver.findElement(By.name("session[username_or_email]"));
	
	user.sendKeys("text");
	WebElement password = driver.findElement(By.name("session[password]"));
	password.sendKeys("password1");
	}
}
