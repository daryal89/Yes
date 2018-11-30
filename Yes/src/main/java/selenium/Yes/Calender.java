package selenium.Yes;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\creat\\eclipse-workspace\\weekdays_class13\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.path2usa.com/travel-companions");
		
		//September 23
		driver.findElement(By.xpath("//*[@name='travel_date']")).click();
		List<WebElement> dates =driver.findElements(By.className(".day"));
		int count = driver.findElements(By.className("day")).size();
		
		for(int i=0; i<count; i++) {
			String text =driver.findElements(By.className("day")).get(i).getText();
			if(text.equalsIgnoreCase("23")) {
				driver.findElements(By.className("day")).get(i).click();
				break;
			}
			
		}
		
		
		
		
		
	}

}
