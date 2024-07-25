package practiceprograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.firefox.FirefoxDriver;


public class BasicSeleniumMethods {

	public static void main(String[] args) {
		//Declaring Web Driver
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/manik/OneDrive/Desktop/mani/BrowserExtensions/Chrom Extension/chromedriver-win64/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//System.setProperty("webdriver.gecko.driver", "C:/Users/manik/OneDrive/Desktop/mani/BrowserExtensions/geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		
		driver.get("https://dev.clickntravel.com");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to("https://www.gmail.com");
		driver.navigate().back();
		driver.navigate().forward();
		//Print Page Title
		String title = driver.getTitle();
		System.out.println(title);
		//Print Current URL
		String currentURL = driver.getCurrentUrl();
		System.out.println(currentURL);
		

	}

}
