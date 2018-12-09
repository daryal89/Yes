package saucelab;

import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DemoSaucelab {

	public static final String USERNAME = "sagun123";
	public static final String ACCESS_KEY = "52a381f5-ab5b-4d14-8e76-321f639abefe";
	public static final String URL = "https://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:443/wd/hub";

	@BeforeTest
	public void initialize() throws MalformedURLException {
		DesiredCapabilities caps = DesiredCapabilities.chrome();
		caps.setCapability("platform", "Windows 10");
		caps.setCapability("version", "60.0");

		WebDriver driver = new RemoteWebDriver(new java.net.URL(URL), caps);

		driver.get("https://saucelabs.com/test/guinea-pig");
		System.out.println("title of page is: " + driver.getTitle());

	}

	@Test
	public void closing() {
		System.out.println("We are closing the browser!!!");
	}
}
