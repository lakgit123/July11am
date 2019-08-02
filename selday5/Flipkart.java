package org.selday5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkart {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Lakshmi\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.get("http://www.flipkart.com");
				WebElement mouse1 =driver.findElement(By.xpath("//span[text()='Home & Furniture']"));
			Actions acc= new Actions(driver);
			acc.moveToElement(mouse1).perform();
			WebElement link1 =driver.findElement(By.xpath("//a[text()='Chairs']"));
			link1.click();
			WebElement link2 =driver.findElement(By.xpath("//a[@href=\"/gocart-12-inches-super-strong-folding-step-stool-adults-kids-kitchen-stepping-stools-garden-blue/p/itmf8xgjzggvb7wq?pid=SLTF8XFVHUH8QGUT&lid=LSTSLTF8XFVHUH8QGUTZORC8H&marketplace=FLIPKART&srno=b_1_1&otracker=nmenu_sub_Home%20%26%20Furniture_0_Chairs&fm=organic&iid=eb7e63cc-f989-41f3-9f90-d2e1b6dd60ea.SLTF8XFVHUH8QGUT.SEARCH&ppt=browse&ppn=browse&ssid=50tanv0tts0000001561596136249\"]"));
			link2.click();
			
	}

}
