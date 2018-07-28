package selenium.page.amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import selenium.page.CommonPage;

public class AmazonProductPage extends CommonPage {

	public AmazonProductPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public String getProductPrice() {
		return driver.findElement(By.cssSelector("span.a-size-medium.a-color-price.offer-price.a-text-normal")).getText();
	}
}
