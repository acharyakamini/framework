package com.Framework.test;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HomePage {
	
	@Test
	
	public void Login() throws InterruptedException{
	 System.setProperty("webdriver.chrome.driver","/Users/kamini/Documents/chromedriver");
	 WebDriver driver= new ChromeDriver();
	 driver.get("https://www.london-theater-tickets.com/");
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 driver.findElement(By.xpath("//div[@class='card tabbed'][2]//div[2]//div[1]")).click();
	 driver.manage().window().maximize();
	 WebElement bookNowBtn = driver.findElement(By.xpath("//div[@class='button']"));
	//Using JavascriptExecutor because Element is not clickable using element locators
			JavascriptExecutor executor = (JavascriptExecutor)driver;
			executor.executeScript("arguments[0].click();", bookNowBtn);
			
		WebElement pickDate= driver.findElement(By.xpath("((//div[@class= 'price-wrapper']/div[@class= 'price '])[1]"));
		pickDate.click();
		//Using JavascriptExecutor because Element is not clickable using element locators
		//JavascriptExecutor executor1 = (JavascriptExecutor)driver;
		//executor1.executeScript("arguments[0].click();", pickDate);
	  }

}
