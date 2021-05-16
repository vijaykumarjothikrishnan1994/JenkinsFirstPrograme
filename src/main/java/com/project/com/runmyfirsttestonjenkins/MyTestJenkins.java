package com.project.com.runmyfirsttestonjenkins;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class MyTestJenkins {
	WebDriver driver;

	@Test
	public void RunPom() {
		
		
		System.out.println("This is my First programe");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Vijay Krishnan\\eclipse-workspace\\com.runmyfirsttestonjenkins\\lib\\chromedriver.exe");
		 driver=new ChromeDriver();
			driver.manage().window().maximize();
			
			driver.navigate().to("http://www.seleniumframework.com/Practiceform/");
			
	}
}
