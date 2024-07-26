package practiceprograms;
import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

public class Basiclocator {

	public static void main(String[] args) {
		//Launching browser
		System.setProperty("webdriver.chrome.driver", "C:/Users/manik/OneDrive/Desktop/mani/BrowserExtensions/Chrom Extension/chromedriver-win64/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://dev.clickntravel.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//SignIn to the application
		driver.findElement(By.xpath("//span[@class='signInFocus']")).click();
		driver.findElement(By.xpath("//input[@type='email'and @placeholder='Enter Your Email']")).sendKeys("testuatvalidate@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Enter Your Password']")).sendKeys("User@123");
		driver.findElement(By.xpath("//button[@type='button']/span[text()='Sign In']")).click();
		//Locate the links on the page (Usage of lists)
		List <WebElement> links = driver.findElements(By.tagName("a"));
		int countoflinks = links.size();
		System.out.println(countoflinks);
		for(int i=0;i<countoflinks;i++){
			String linkname = links.get(i).getText();
			System.out.println("Linkname: "+linkname);
			String URL = links.get(i).getAttribute("href");
			System.out.println("url:"+URL);
			
		}
		
		//Click on the source airport text box (Usage of Or-xpath)
		driver.findElement(By.xpath("//input[@class='effect-9 destFromTo' or @placeholder='City or Airport']")).click();
		//Click on the destination airport text box (Usage of contains)
		driver.findElement(By.xpath("//div[contains(@class,'dest-to')]")).click();
		//Selecting Direct flight check box (Usage of starts-with)
		driver.findElement(By.xpath("//span[starts-with(text(),'Direct')]")).click();
	}

}
