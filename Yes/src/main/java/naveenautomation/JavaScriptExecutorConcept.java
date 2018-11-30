package naveenautomation;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorConcept {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\creat\\eclipse-workspace\\weekdays_class11\\chromedriver.exe"); // set system property

		WebDriver driver = new ChromeDriver(); // launch chorme

		driver.manage().window().maximize(); // maximize window
		driver.manage().deleteAllCookies(); // delete all the cookies

		// dynamic wait
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.freecrm.com");
		System.out.println("Before login  title is:: " + driver.getTitle());

		driver.findElement(By.name("username")).sendKeys("naveenk");
		driver.findElement(By.name("password")).sendKeys("test@1234");

		// driver.findElement(By.xpath("//input[contains(@type, 'submit')]")).click();

		// executeScript -- to execute JavaScript code

		WebElement loginBtn = driver.findElement(By.xpath("//input[contains(@type, 'submit')]"));

		flash(loginBtn, driver); // flash the loginBtn

		drawBorder(loginBtn, driver); // draw a border

		// take screenshot
		// Take Screenshot and store as a file formant
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		// now copy the screenShot to desired location using copyFile method

		FileUtils.copyFile(src, new File("C:\\Users\\creat\\eclipse-workspace\\Yes\\element.png"));

		// Generate Alert while executing the script
		// generateAlert(driver, "There is an issue with Login button on Login page");

		// click on any element by using Js executor
		clickElementByJs(loginBtn, driver);

		// refresh the page
		// 1. by using selenium
		driver.navigate().refresh();

		// 2. using Js executor
		refreshBrowserByJs(driver);

		System.out.println("Refreshed browser again");

		// get the title of the page by js:
		System.out.println(getTitleByJs(driver));
		
		//get the page text:
		System.out.println(getPageInnerTextByJs(driver));
		
		//Scroll Down
		//scrollPageDown(driver);
		
		
		//scroll down upto the required place
		WebElement forgotPwdLink = driver.findElement(By.xpath("//a[contains(text(),'Companies & Contacts')]"));
		scrollIntoView(forgotPwdLink, driver);
		
		driver.quit();
	}

	public static void flash(WebElement element, WebDriver driver) throws IOException {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		String bgcolor = element.getCssValue("backgroundColor");
		for (int i = 0; i < 5; i++) {
			changeColor("rgb(0,200,0)", element, driver);// 1
			changeColor(bgcolor, element, driver); // 2
		}
	}

	public static void changeColor(String color, WebElement element, WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].style.backgroundColor= '" + color + "'", element);

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
		}
	}

	// Draw Border method
	public static void drawBorder(WebElement element, WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].style.border='5px solid red'", element);
	}

	// Alert message method
	public static void generateAlert(WebDriver driver, String message) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("alert('" + message + "')");
	}

	// click method using JS executor
	public static void clickElementByJs(WebElement element, WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].click();", element);
	}

	// Refreshing the page using js Executor
	public static void refreshBrowserByJs(WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("history.go(0);");
	}

	// getTitle() using Js
	public static String getTitleByJs(WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		String title = js.executeScript("return document.title;").toString();
		return title;
	}

	//Returning inner text
	public static String getPageInnerTextByJs(WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		String pageText = js.executeScript("return document.documentElement.innerText;").toString();
		return pageText;
	}
	
	
	//scrolling the page
	public static void scrollPageDown(WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	}
	
	//scrolling upto desired place
	public static void scrollIntoView(WebElement element, WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("argument[0].scrollIntoView(true);", element);
	}
}
