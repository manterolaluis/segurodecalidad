package selenium.page.gmail;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import selenium.page.CommonPage;

public class MainPage extends CommonPage {

	@FindBy(css="a[href*='SignOut']")
	WebElement emailIcon;
	
	public MainPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public boolean loginSuccess() {
		waitVisible(emailIcon, driver);
		return (emailIcon.isDisplayed());
	}
	
	public WebElement getEmailIcon() {
		return emailIcon;
	}
	
}
