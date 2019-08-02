package org.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Lakshmi\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://accounts.google.com/signup/v2/webcreateaccount?hl=en&flowName=GlifWebSignIn&flowEntry=SignUp");
	WebElement fname = driver.findElement(By.xpath("//input[@id='firstName']"));
	fname.sendKeys("Lakshmi");
	WebElement lname = driver.findElement(By.xpath("//input[@id='lastName']"));
	lname.sendKeys("J");
	WebElement user = driver.findElement(By.xpath("//input[@id='username']"));
	user.sendKeys("lakjaya");
	WebElement pass = driver.findElement(By.xpath("(//input[@type='password'])[1]"));
	pass.sendKeys("Test@123");
	WebElement cpass = driver.findElement(By.xpath("(//input[@type='password'])[2]"));
	cpass.sendKeys("Test@123");
	WebElement next = driver.findElement(By.xpath("//div[@class='ZFr60d CeoRYc']"));
	next.click();
}
}
