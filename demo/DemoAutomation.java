package org.demo;

import java.util.Date;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DemoAutomation {
	static WebDriver driver;
@BeforeClass
public static void beforeClass() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lakshmi\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");
    driver = new ChromeDriver();
	driver.get("http://demo.automationtesting.in/Register.html");
	driver.manage().window().maximize();
}
@AfterClass
public static void afterClass() {
	driver.quit();
}
@Before
public void beforeMethod() {
	Date date = new Date();
	System.out.println(date);
}
@Test
public void testRegister() throws InterruptedException {
	Assert.assertTrue("verify url",driver.getCurrentUrl().contains("automation"));
	Assert.assertTrue("verify title",driver.getTitle().contains("Register"));
	WebElement firstName =driver.findElement(By.xpath("//input[@placeholder='First Name']"));
	firstName.sendKeys("Lakshmi");
	Assert.assertEquals("verify firstname","Lakshmi", firstName.getAttribute("value"));
	WebElement lastName =driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
	lastName.sendKeys("Jayamangal");
	Assert.assertEquals("verify lastname","Jayamangal",lastName.getAttribute("value"));
	WebElement address =driver.findElement(By.xpath("//textarea[@class='form-control ng-pristine ng-untouched ng-valid']"));
	address.sendKeys("Chennai");
	Assert.assertEquals("verify address","Chennai",address.getAttribute("value"));
	Thread.sleep(2000);
	WebElement email =driver.findElement(By.xpath("//input[@ng-model='EmailAdress']"));
	email.sendKeys("laksh1485@gmail.com");
	Assert.assertEquals("laksh1485@gmail.com",email.getAttribute("value"));
	WebElement phone =driver.findElement(By.xpath("//input[@ng-model='Phone']"));
	phone.sendKeys("9884447791");
	Assert.assertEquals("9884447791",phone.getAttribute("value"));
	Thread.sleep(2000);
	WebElement gender =driver.findElement(By.xpath("//input[@value='FeMale']"));
	gender.click();
	WebElement hobbies =driver.findElement(By.id("checkbox1"));
	hobbies.click();
	WebElement languages =driver.findElement(By.id("msdd"));
	Select s = new Select(languages);
	boolean b = s.isMultiple();
	System.out.println(b);
	List<WebElement> li = s.getOptions();
	int size=li.size();
	System.out.println(size);
	s.selectByVisibleText("Bulgarian");
	
	WebElement skill =driver.findElement(By.id("Skills"));
	Select s1 = new Select(skill);
	boolean b1 = s1.isMultiple();
	System.out.println(b1);
	List<WebElement> li1 = s1.getOptions();
	int size1=li1.size();
	System.out.println(size1);
	s1.selectByVisibleText("Adobe InDesign");

	WebElement countries =driver.findElement(By.id("countries"));
	Select s2 = new Select(countries);
	boolean b2 = s2.isMultiple();
	System.out.println(b2);
	List<WebElement> li2 = s2.getOptions();
	int size2=li2.size();
	System.out.println(size2);
	s2.selectByVisibleText("Afghanistan");
	Thread.sleep(2000);
	WebElement country =driver.findElement(By.id("country"));
	Select s3 = new Select(country);
	boolean b3 = s3.isMultiple();
	System.out.println(b3);
	List<WebElement> li3 = s3.getOptions();
	int size3=li3.size();
	System.out.println(size3);
	s3.selectByVisibleText("Australia");
	
	WebElement year =driver.findElement(By.id("yearbox"));
	Select s4 = new Select(year);
	boolean b4 = s4.isMultiple();
	System.out.println(b4);
	List<WebElement> li4 = s4.getOptions();
	int size4=li4.size();
	System.out.println(size4);
	s4.selectByVisibleText("Australia");
	Thread.sleep(2000);
}
@After
public void afterMethod() {
	Date date = new Date();
	System.out.println(date);
}
	
	

}
