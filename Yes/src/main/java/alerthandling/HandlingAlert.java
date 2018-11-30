package alerthandling;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlert {
	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\creat\\eclipse-workspace\\weekdays_class11\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("http://www.naveenautomationlabs.com/");
	
	//driver.findElement(By.cssSelector("span.g9gu5dp")).click();
	
	
	Alert alert = driver .switchTo().alert();  // alert class object reference
	String text = alert.getText();
	System.out.println(text);
	alert.accept();
	//alert.dismiss(); //click on cancel btn
	
	
	
	//driver.close();
	}
}
