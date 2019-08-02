package org.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Lakshmi\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
	email.sendKeys("testing@gmail.com");
	WebElement password = driver.findElement(By.xpath("//input[@id='pass']"));
	password.sendKeys("testing");
}
}
