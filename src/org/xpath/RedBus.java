package org.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedBus {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Lakshmi\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.redbus.in/");
		WebElement From = driver.findElement(By.xpath("//input[@id='src']"));
		From.sendKeys("Chennai");
		WebElement To = driver.findElement(By.xpath("//input[@id='dest']"));
		From.sendKeys("Bangalore");
		WebElement search =driver.findElement(By.xpath("//button[@id='search_btn']"));
		search.click();
		
}
}
