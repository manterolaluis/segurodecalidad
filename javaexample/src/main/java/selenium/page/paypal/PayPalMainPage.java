package selenium.page.paypal;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import selenium.page.CommonPage;

public class PayPalMainPage extends CommonPage{

	@FindBy(css = "#ul-btn")
	WebElement loginButton;
	
	public PayPalMainPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public PayPalEmailPage logIn() {
		loginButton.click();
		return new PayPalEmailPage(driver);
	}	
}
