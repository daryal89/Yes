import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectCalenderByJS {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\creat\\eclipse-workspace\\weekdays_class11\\chromedriver.exe"); // set system property

		WebDriver driver = new ChromeDriver(); // launch chorme

		driver.manage().window().maximize(); // maximize window
		driver.manage().deleteAllCookies(); // delete all the cookies

		// dynamic wait
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.spicejet.com/");
		
		////*[@id="ctl00_mainContent_view_date1"]
		WebElement date= driver.findElement(By.id("ctl00_mainContent_view_date1"));
		String dateVal= "30-11-2018";
		
		selectDateByJs(driver, date, dateVal);
		

	}

	
	public static void selectDateByJs(WebDriver driver, WebElement element, String dateVal) {
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].setAttribute('value','"+dateVal+"');", element);
	}
}
