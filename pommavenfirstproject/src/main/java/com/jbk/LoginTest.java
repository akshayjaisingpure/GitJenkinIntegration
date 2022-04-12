package com.jbk;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class LoginTest {

	
	@Test
	public void test01() {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///D:/software/Selenium%20Softwares/Selenium%20Softwares/Offline%20Website/Offline%20Website/index.html");
		
		LoginPage lp= new LoginPage(driver);
		lp.loginToApplication();
	}
}
