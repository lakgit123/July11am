package org.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Corejava {
	
		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Lakshmi\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");
		WebElement corejava =driver.findElement(By.xpath("//a[@href='http://traininginchennai.in/core%20java%20material.pdf']"));
		corejava.click();
		}
		
}
