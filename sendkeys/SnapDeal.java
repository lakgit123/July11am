package org.sendkeys;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SnapDeal {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Lakshmi\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("https://www.snapdeal.com/login");
WebElement email = driver.findElement(By.id("userName"));
email.sendKeys("testing@gmail.com");

}
}
