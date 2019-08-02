package org.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GreensTech {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Lakshmi\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://www.greenstechnologys.com/");
	WebElement contact = driver.findElement(By.xpath("//a[@href='contact.php']"));
	contact.click();
	WebElement name = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
	name.sendKeys("Lakshmi");
	WebElement email = driver.findElement(By.xpath("(//input[@type='email'])[1]"));
	email.sendKeys("testing@gmail.com");
	WebElement mobno = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
	mobno.sendKeys("9880089679");
	WebElement message = driver.findElement(By.xpath("//textarea[@class=\"form-control input-message\"]"));
	message.sendKeys("Hi");
	WebElement submit = driver.findElement(By.xpath("//button[@id=\"submit\"]"));
	submit.click();
	}
}
