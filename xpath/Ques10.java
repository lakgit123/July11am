package org.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ques10 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Lakshmi\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
		driver.get("http://www.gmail.com");
		WebElement id =driver.findElement(By.xpath("//input[@id='identifierId']"));
		id.sendKeys("laksh1485@gmail.com");
		WebElement next=driver.findElement(By.xpath("//span[@class='RveJvd snByac']"));
	next.click();
	WebElement pass =driver.findElement(By.xpath("//input[@class='password']"));
	pass.sendKeys("testing");

	}
}
