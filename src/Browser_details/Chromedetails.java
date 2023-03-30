package Browser_details;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chromedetails {
	public static void main(String[] args) throws InterruptedException {
		//open the browser
		WebDriver driver = new ChromeDriver();
		//navigate to website
	driver.get("https://www.ecoders.in");
		//navigate to website
//		driver.navigate().to("https://www.ecoders.in");
		//get the title of the webpage
		String title = driver.getTitle();
		//get the current url pf that web page
		String url = driver.getCurrentUrl();
		//get the source code of that webpage
		String ps = driver.getPageSource();
		System.out.println(title);
		System.out.println(url);
//		System.out.println(ps);
		//stop the execution for the given period of time
		Thread.sleep(2000);
		//close all the browser
		driver.quit();
	}

}
