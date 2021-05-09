package com;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {

	WebDriver Driver;
	
	@Test
	public void openBrowser() {
	
	WebDriverManager.chromedriver().setup();	
	Driver = new ChromeDriver();
	
    Driver.get("http://www.google.com");
	
    System.out.println("This is google");
	}
	
//	@Test
//	public void test() {
//		
//	System.out.println("test1");
//		
//	}
//	
}
