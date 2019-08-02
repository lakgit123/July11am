package org.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Adactin {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lakshmi\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.get("http://www.adactin.com/HotelApp/");
	WebElement user =driver.findElement(By.id("username"));
	user.sendKeys("testing");
	String a = user.getAttribute("value");
	WebElement password =driver.findElement(By.id("password"));
	password.sendKeys("testingpass");
	String b = password.getAttribute("value");
	System.out.println(a);
	System.out.println(b);
	}
}
