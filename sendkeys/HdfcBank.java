package org.sendkeys;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HdfcBank {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Lakshmi\\\\eclipse-workspace\\\\Selenium\\\\drivers\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		WebElement user = driver.findElement(By.name("fldLoginUserId"));
		
		user.sendKeys("text");
	}
	
}
