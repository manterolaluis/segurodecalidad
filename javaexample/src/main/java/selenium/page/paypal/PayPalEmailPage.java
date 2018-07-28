package selenium.page.paypal;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import selenium.page.CommonPage;

public class PayPalEmailPage extends CommonPage{
	
	@FindBy(css = "#email")
	WebElement emailTextField;
	
	@FindBy(css = "#btnNext")
	WebElement nextButton;
	
	public PayPalEmailPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void inputEmail(String email) {
		emailTextField.sendKeys(email);
	}
	
	public PayPalPasswordPage clickNext() {
		nextButton.click();
		return new PayPalPasswordPage(driver);
	}
}
