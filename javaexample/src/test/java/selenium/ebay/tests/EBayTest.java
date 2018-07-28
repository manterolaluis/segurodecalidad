package selenium.ebay.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import selenium.CommonTest;
import selenium.page.ebay.EBayMainPage;
import selenium.page.ebay.ProductPage;
import selenium.page.ebay.ResultPage;

public class EBayTest extends CommonTest{
	private EBayMainPage eBayMainPage;
	private ResultPage resultPage;
	private ProductPage productPage;
	
	@BeforeMethod
	public void before() {
	}
	
	@Test
	public void ebayTest() throws Exception {

		driver.get(configFileReader.getUrl("ebay"));
		
		eBayMainPage = new EBayMainPage(driver);
		eBayMainPage.setInputSearch("Electric Guitar");
		
		resultPage = new ResultPage(driver);
		//waitVisible(resultPage.getResultAtIndex(1), driver);
		resultPage.clickElementResultAtIndex(1);
		
		productPage = new ProductPage(driver);

		Assert.assertNotNull(productPage.getProductPrice());
	}
}
