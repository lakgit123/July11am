package org.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ques12 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Lakshmi\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		WebElement id =driver.findElement(By.xpath("//input[@id='inputValEnter']"));
		id.sendKeys("iphone");
		WebElement search =driver.findElement(By.xpath("//button[@class='searchformButton col-xs-4 rippleGrey']"));
	search.click();
	String a=id.getAttribute("display-price");
	System.out.println(a);
	}
}
