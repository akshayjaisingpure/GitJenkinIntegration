package firstmaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginTest {

	@Test
	public void test01() {
		System.out.println("dashboard clas..1");
		Assert.assertTrue(true);

	}

	@Test
	public void test02() {
		System.out.println("dashboard clas..2");
		Assert.assertTrue(true);
	}
}

