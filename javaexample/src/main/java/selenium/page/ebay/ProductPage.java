package selenium.page.ebay;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import selenium.page.CommonPage;

public class ProductPage extends CommonPage {

	public ProductPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public String getProductPrice() {
		return driver.findElement(By.cssSelector("#prcIsum_bidPrice")).getText();
	}
}
