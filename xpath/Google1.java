package org.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lakshmi\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.get("http://www.google.com/");
	WebElement text =driver.findElement(By.xpath("//input[@name='q']"));
	text.sendKeys("greens velmurugan");
	WebElement submit =driver.findElement(By.xpath("(//input[@type='submit'])[3]"));
	submit.click();
	WebElement link =driver.findElement(By.xpath("//cite[@class='iUh30']"));
	link.click();
	}
}
