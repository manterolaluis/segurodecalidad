package selenium.amazon.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import selenium.CommonTest;
import selenium.page.amazon.AmazonListResultPage;
import selenium.page.amazon.AmazonMainPage;
import selenium.page.amazon.AmazonProductPage;
import selenium.page.amazon.AmazonResultPage;

public class AmazonTest extends CommonTest {

	@BeforeMethod
	public void before() {
	}

	@Test
	public void amazonTest() throws Exception {

		driver.get(configFileReader.getUrl("amazon"));
		AmazonMainPage amazonMainPage = new AmazonMainPage(driver);
		AmazonResultPage resultPage = amazonMainPage.search("java persistence with hibernate");

		// waitVisible(resultPage.getResultAtIndex(1), driver);
		resultPage.selectJavaProgrammingResults(
				"/s/ref=sr_nr_n_1?fst=as%3Aoff&rh=n%3A3608%2Ck%3Ajava+persistence+with+hibernate&keywords=java+persistence+with+hibernate&ie=UTF8&qid=1531011677&rnid=2941120011");

		AmazonListResultPage amazonListResultPage = new AmazonListResultPage(driver);
		amazonListResultPage.selectEspecificElementFromList("High-Performance Java Persistence");
		AmazonProductPage productPage = new AmazonProductPage(driver);
		Assert.assertNotNull(productPage.getProductPrice());
	}

}
