package com.jbk.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.jbk.pages.LoginNewPage;


public class LoginNewTest {
	@Test
	public void test01() {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///D:/software/Selenium%20Softwares/Selenium%20Softwares/Offline%20Website/Offline%20Website/index.html");
		
		LoginNewPage lp= new LoginNewPage(driver);
		lp.loginToApplication();
		Assert.assertEquals(driver.getTitle(), "JavaByKiran | Dashboard");
	}

}
