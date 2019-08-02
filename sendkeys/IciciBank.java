package org.sendkeys;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IciciBank {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Lakshmi\\\\eclipse-workspace\\\\Selenium\\\\drivers\\\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://infinity.icicibank.com/corp/Login.jsp");
	WebElement user = driver.findElement(By.id("AuthenticationFG.USER_PRINCIPAL"));
	user.sendKeys("user1");
	WebElement password = driver.findElement(By.id("AuthenticationFG.ACCESS_CODE"));
	password.sendKeys("password1");
	
	
}
}
