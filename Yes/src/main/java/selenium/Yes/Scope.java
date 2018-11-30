package selenium.Yes;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scope {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\creat\\eclipse-workspace\\weekdays_class13\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		// 1. Calculate links count in the give webPage
		driver.get("http://qaclickacademy.com/practice.php");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		int count = driver.findElements(By.tagName("a")).size();
		System.out.println("Total links count : " + count);

		// 2. Find footer links count
		WebElement footer = driver.findElement(By.id("gf-BIG"));
		int footercount = footer.findElements(By.tagName("a")).size();
		System.out.println("Total footer link counts: " + footercount);

		// 3. links count of first column
		WebElement column = footer.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		int columncount = column.findElements(By.tagName("a")).size();
		System.out.println("column elements: " + columncount);

		// 4. click on each link in the column and check if the pages are opening
		for (int i = 1; i < column.findElements(By.tagName("a")).size(); i++) {

			String clickonlinkTab = Keys.chord(Keys.CONTROL, Keys.ENTER);
			column.findElements(By.tagName("a")).get(i).sendKeys(clickonlinkTab);
		}

		// 5. find the title of every page
		Thread.sleep(3000L);
		Set<String> abc = driver.getWindowHandles();
		Iterator<String> it = abc.iterator();
		while (it.hasNext()) {
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
		}

		Thread.sleep(3000L);
		driver.quit();

	}

}
