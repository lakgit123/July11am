package org.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Lakshmi\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	WebElement signup =driver.findElement(By.xpath("//a[@href='/account/login?ret=/']"));
	signup.click();
	WebElement mobno =driver.findElement(By.xpath("(//input[@type='text'])[2]"));
	mobno.sendKeys("9884039898");
	WebElement password =driver.findElement(By.xpath("(//input[@type='password'])"));
	password.sendKeys("test@123");
	WebElement login =driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
	login.click();
	
	}
}
