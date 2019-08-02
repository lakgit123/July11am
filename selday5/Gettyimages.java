package org.selday5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Gettyimages {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Lakshmi\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.get("https://www.gettyimages.in/");
								
				WebElement link1 =driver.findElement(By.xpath("(//a[@href='/editorial-images'])[2]"));
				link1.click();
				WebElement link2 =driver.findElement(By.xpath("//a[@href=\"https://www.gettyimages.in/editorial-images/entertainment\"]"));
				link2.click();
				
	}
}
