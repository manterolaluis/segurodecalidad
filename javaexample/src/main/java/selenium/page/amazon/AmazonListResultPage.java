package selenium.page.amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import selenium.page.CommonPage;

public class AmazonListResultPage extends CommonPage {

	public AmazonListResultPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void selectEspecificElementFromList(String title){
		try {
			driver.findElement(By.cssSelector("a[title='"+title+"']")).click();
		} catch (NoSuchElementException e) {
		}
	}
}
