package org.sendkeys;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Lakshmi\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.instagram.com/accounts/login/?hl=en");
	WebElement user = driver.findElement(By.id("fc5ef96ba40f3c"));
	user.sendKeys("tester");
	WebElement password = driver.findElement(By.id("f7ebf415582d6"));
	password.sendKeys("pass");
}
}
