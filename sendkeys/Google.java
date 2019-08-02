package org.sendkeys;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Lakshmi\\\\eclipse-workspace\\\\Selenium\\\\drivers\\\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.com/");
	WebElement name = driver.findElement(By.name("q"));
	name.sendKeys("GreensTechnology");
	}
}
