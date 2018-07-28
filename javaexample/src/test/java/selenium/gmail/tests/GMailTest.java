package selenium.gmail.tests;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import selenium.CommonTest;
import selenium.page.gmail.LoginPage;
import selenium.page.gmail.MainPage;

public class GMailTest extends CommonTest{
	private LoginPage loginPage;
	private MainPage mainPage;
	
	@BeforeMethod
	public void before() {
		System.setProperty("webdriver.chrome.driver", configFileReader.getDriverPath());
		driver = new ChromeDriver();
		driver.get(configFileReader.getUrl("gmail"));
	}
	
	@Test
	public void gmailAccountTest() {
		loginPage= new LoginPage(driver);
		loginPage.clickSignIn();
		loginPage.setMail("seleniumpladema");
		loginPage.clickIdNext();
		loginPage.setPassword("Pladema2018");
		loginPage.clickPasswordNext();		
		
		mainPage = new MainPage(driver);
		
		Assert.assertTrue(mainPage.loginSuccess(),"Login Failed");
		
	}
	
	@Test(dependsOnMethods = { "gmailAccountTest" })
	public void failedLoginTest() {
		loginPage= new LoginPage(driver);
		loginPage.clickSignIn();
		loginPage.setMail("seleniumplademaaaaaaa");
		loginPage.clickIdNext();
		Assert.assertFalse(loginPage.isAlertaDisplayed(),"Login Failed");
	}
}
