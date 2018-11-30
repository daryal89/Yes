import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementVisibility {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\creat\\eclipse-workspace\\weekdays_class11\\chromedriver.exe"); // set system property

		WebDriver driver = new ChromeDriver(); // launch chorme

		driver.manage().window().maximize(); // maximize window
		driver.manage().deleteAllCookies(); // delete all the cookies

		// dynamic wait
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.freecrm.com/register/");

		// 1. isDisplayed() method: applicable for all the elements
		boolean b = driver.findElement(By.id("submitButton")).isDisplayed(); // for submit button
		System.out.println("button is Displayed:: " + b);

		// 2. isEnabled() method
		boolean b1 = driver.findElement(By.id("submitButton")).isEnabled();
		System.out.println("button is Enabled: " + b1);

		// Select I agree checkbox
		driver.findElement(By.name("agreeTerms")).click(); // submit button is enabled now
		boolean b2 = driver.findElement(By.id("submitButton")).isEnabled();
		System.out.println("button is Enabled: " + b2);

		// isSelected() method
		boolean b3 = driver.findElement(By.name("agreeTerms")).isSelected();
		System.out.println("The checkbox is selected: " + b3);

		driver.findElement(By.name("agreeTerms")).click();

		boolean b4 = driver.findElement(By.name("agreeTerms")).isSelected();
		System.out.println("The checkbox is selected: " + b4);

		driver.quit();

	}

}
