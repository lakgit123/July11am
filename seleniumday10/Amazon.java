package org.seleniumday10;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Lakshmi\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement text =driver.findElement(By.id("twotabsearchtextbox"));
		text.sendKeys("iphonex");
		WebElement search =driver.findElement(By.xpath("//input[@value='Go']"));
		search.click();
		WebElement prod =driver.findElement(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
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
		WebElement addCart =driver.findElement(By.xpath("//span[@id='submit.add-to-cart']"));
		addCart.click();
		
}
}
