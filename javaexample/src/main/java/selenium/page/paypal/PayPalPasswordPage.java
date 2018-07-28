package selenium.page.paypal;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import selenium.page.CommonPage;

public class PayPalPasswordPage extends CommonPage{
	
	
	@FindBy(css = "#password")
	WebElement passwordText;
	
	public PayPalPasswordPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void inputPassword(String password) {
		waitVisible(passwordText, driver);
		passwordText.sendKeys(password);
		return;
	}
}
