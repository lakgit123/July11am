package org.day9;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ques7 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Lakshmi\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
		driver.get("http://toolsqa.com/automation-practice-form/");
		driver.manage().window().maximize();
		WebElement dropDown =driver.findElement(By.id("continents"));
		Select s= new Select(dropDown);
		boolean a =s.isMultiple();
		System.out.println(a);
		List<WebElement> li =s.getOptions();
		int size =li.size();
		System.out.println(size);
		List<WebElement> options = s.getOptions();
		for(int i=0;i<options.size();i++)
		{
			WebElement selectText =options.get(i);
			String text= selectText.getText();
			
			System.out.println(text);
		}
	}
}
