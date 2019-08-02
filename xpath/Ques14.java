package org.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ques14 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Lakshmi\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		WebElement elec =driver.findElement(By.xpath("//span[@class='_1QZ6fC _3Lgyp8']"));
		String a =elec.getText();
		System.out.println(a);
		WebElement tv =driver.findElement(By.xpath("(//span[@class='_1QZ6fC _3Lgyp8'])[2]"));
		String b =tv.getText();
		System.out.println(b);
		WebElement men =driver.findElement(By.xpath("(//span[@class='_1QZ6fC _3Lgyp8'])[3]"));
		String c =men.getText();
		System.out.println(c);
		WebElement women =driver.findElement(By.xpath("(//span[@class='_1QZ6fC _3Lgyp8'])[4]"));
		String d =women.getText();
		System.out.println(d);
	}
}
