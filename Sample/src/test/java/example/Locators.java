package example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Locators {
	@Test
  
  public void f() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\bhanu\\Downloads\\chromedriver_win32\\chromedriver.exe");
	  WebDriver d1;
	  d1=new ChromeDriver();
	  
	  d1.get("http://demo.automationtesting.in/Register.html");
	  d1.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Venu");
	  d1.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Gopal");
	  d1.findElement(By.xpath("//textarea[@rows='3']")).sendKeys("1-65,Main Street");
	  d1.findElement(By.cssSelector("input[type='email']")).sendKeys("alwaysvenu96@gmail.com");
	  d1.findElement(By.xpath("//input[@type='tel']")).sendKeys("1234567890");
	  d1.findElement(By.xpath("//input[@type='radio']")).click();
	  d1.findElement(By.id("checkbox2")).click();
	  d1.findElement(By.id("msdd")).click();
	  d1.findElement(By.xpath("//multi-select//div[2]//ul//li[7]//a")).click();
	  d1.findElement(By.id("firstpassword")).sendKeys("venu123");
	  d1.findElement(By.id("secondpassword")).sendKeys("venu123");
	  d1.findElement(By.xpath("//button[@type='submit']")).click();
	  
  }
}
