package org.selday5;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Lakshmi\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.get("http://www.amazon.iN");
				WebElement mouse1 =driver.findElement(By.xpath("//span[text()='Category']"));
Actions acc = new Actions(driver);
acc.moveToElement(mouse1).perform();
WebElement mouse2 =driver.findElement(By.xpath("//span[text()='Mobiles, Computers']"));
acc.moveToElement(mouse2).perform();
WebElement link =driver.findElement(By.xpath("//span[text()='Power Banks']"));
link.click();
	}

}
