package org.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Oracle {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lakshmi\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.get("http://www.greenstechnologys.com/oracle-training.html");
	WebElement text =driver.findElement(By.xpath("//p[contains(text(),'Awarded as')]"));
	String a= text.getText();
	WebElement text1 =driver.findElement(By.xpath("//p[contains(text(),'Rated')]"));
	String b= text1.getText();
	System.out.println(a);
	System.out.println(b);
}
}
