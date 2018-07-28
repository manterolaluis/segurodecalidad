package selenium.page.amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import selenium.page.CommonPage;

public class AmazonResultPage extends CommonPage {

	public AmazonResultPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void selectJavaProgrammingResults(String href){
		try {
			driver.findElement(By.cssSelector("a[href='"+href+"']")).click();
		} catch (NoSuchElementException e) {
		}
	}
}
