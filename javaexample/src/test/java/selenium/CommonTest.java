package selenium;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import selenium.dataprovider.ConfigFileReader;

public abstract class CommonTest {

	protected WebDriver driver;
	protected ConfigFileReader configFileReader = new ConfigFileReader();
	protected DesiredCapabilities capabillities;
	protected Wait<WebDriver> wait;

	public abstract void before();

	@BeforeClass
	public void setUp() throws Exception {
		// capabillities = DesiredCapabilities.chrome();
		//ChromeOptions options = new ChromeOptions();

		//driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), options);
		// capabillities.setBrowserName("chrome");
		//wait = new WebDriverWait(driver, 6000);

		driver = new ChromeDriver();
	}

	@AfterClass()
	public void destroy() {
		if (driver != null)
			driver.quit();
	}

}
