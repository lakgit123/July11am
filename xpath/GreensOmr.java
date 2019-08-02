package org.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GreensOmr {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Lakshmi\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("http://www.greenstechnologys.com/index.html");
WebElement text1 =driver.findElement(By.xpath("(//span[contains(text(),'Greens')])[2]"));
String a= text1.getText();
WebElement text2 =driver.findElement(By.xpath("//strong[contains(text(),'Plot')]"));
String b =text2.getText();

WebElement text3 =driver.findElement(By.xpath("//strong[contains(text(),'Kanch')]"));
String c =text3.getText();
WebElement text4 =driver.findElement(By.xpath("//strong[contains(text(),'Land')]"));
String d = text4.getText();
WebElement text5 =driver.findElement(By.xpath("(//strong[contains(text(),'Thoraipakkam')])[2]"));
String e = text5.getText();
WebElement text6 =driver.findElement(By.xpath("(//strong[contains(text(),'Tel')])[2]"));
String f =text6.getText();
System.out.println(a+b+c+d+e+f);

}
}
