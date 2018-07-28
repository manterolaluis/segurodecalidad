package selenium.paypal.tests;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import selenium.CommonTest;
import selenium.page.paypal.PayPalEmailPage;
import selenium.page.paypal.PayPalMainPage;
import selenium.page.paypal.PayPalPasswordPage;

public class PayPalTest extends CommonTest{

	@BeforeMethod
	public void before() {
		System.setProperty("webdriver.chrome.driver", configFileReader.getDriverPath());
		driver = new ChromeDriver();
		driver.get(configFileReader.getUrl("paypal"));
	}
	
	@Test
	public void testPayPal() {
		PayPalMainPage payPalMainPage = new PayPalMainPage(driver);
		PayPalEmailPage payPalLoginPage = payPalMainPage.logIn();
		
		payPalLoginPage.inputEmail("pepito@gmail.com");
		PayPalPasswordPage payPalPasswordPage = payPalLoginPage.clickNext();
		payPalPasswordPage.inputPassword("123456");
		
	}
	

}
