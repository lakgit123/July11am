package org.seleniumday10;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Lakshmi\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		WebElement acc =driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']"));
		acc.click();
		WebElement search =driver.findElement(By.xpath("//input[@type='text']"));
		search.sendKeys("iphone7");
		
		
		WebElement submit =driver.findElement(By.xpath("//button[@type='submit']"));
		
		submit.click();
	
		WebElement pin =driver.findElement(By.id("pincodeInputId"));
		pin.sendKeys("600096");
		
		WebElement check =driver.findElement(By.xpath("//span[@class='_2aK_gu']"));
		check.click();
		
		WebElement prod =driver.findElement(By.xpath("(//div[@class='_3wU53n'])[1]"));
		prod.click();
		String pWid= driver.getWindowHandle();
		Set<String> allWindowId= driver.getWindowHandles();
		for(String V: allWindowId)
		{
		if(!pWid.equals(V))
		{
			driver.switchTo().window(V);
		}
		}
		
	}
}
