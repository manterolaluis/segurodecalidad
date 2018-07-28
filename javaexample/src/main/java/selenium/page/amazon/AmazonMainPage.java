package selenium.page.amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import selenium.page.CommonPage;

public class AmazonMainPage extends CommonPage {

	
	@FindBy(css = "input#twotabsearchtextbox.nav-input")
	private WebElement input;
	
	public AmazonMainPage(WebDriver driver) {
		this.driver = driver;
		driver.manage().window().maximize();
		PageFactory.initElements(driver, this);
	}

	public AmazonResultPage search(String text) {
		input.sendKeys(text);
		input.submit();
		return new AmazonResultPage(driver);
	}
}
