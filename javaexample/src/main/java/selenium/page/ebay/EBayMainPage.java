package selenium.page.ebay;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import selenium.page.CommonPage;

public class EBayMainPage extends CommonPage {

	public EBayMainPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void setInputSearch(String text) {
		driver.findElement(By.cssSelector(".gh-tb.ui-autocomplete-input")).sendKeys(text);
		driver.findElement(By.cssSelector(".gh-tb.ui-autocomplete-input")).submit();
	}
}
