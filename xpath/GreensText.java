package org.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GreensText {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Lakshmi\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/");
		WebElement text =driver.findElement(By.xpath("//h2[text()='Greens Technologys Overall Reviews']"));
		String a = text.getText();
		System.out.println(a);
	}

}
