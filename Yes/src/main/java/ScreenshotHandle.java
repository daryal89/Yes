import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotHandle {

	public static WebDriver driver;
	
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\creat\\eclipse-workspace\\weekdays_class11\\chromedriver.exe"); // set system property

		 driver = new ChromeDriver(); // launch chorme

		driver.manage().window().maximize(); // maximize window
		driver.manage().deleteAllCookies(); // delete all the cookies

		// dynamic wait
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.facebook.com/");
		
		takeScreenshot("Facebook_Login");
		takeScreenshot("Homepabe_Facebook");

	}
	
	public static void takeScreenshot(String fileName) throws IOException {
		//1. take screenshot and store it as a file format
		
		File file =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		//2. Now copy the screenshot to desired location using copyfile method
		FileUtils.copyFile(file,new File("C:\\Users\\creat\\eclipse-workspace\\Yes\\src\\main\\java\\screenshot\\"+fileName+".jpg"));
		
	}

}
