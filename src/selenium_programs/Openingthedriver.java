package selenium_programs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;

public class Openingthedriver {
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Roshan Jha\\eclipse-workspace\\Seleniumautomation\\all_necessary_file\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Roshan Jha\\eclipse-workspace\\Seleniumautomation\\all_necessary_file\\geckodriver.exe");
		WebDriver  driver1 = new FirefoxDriver();
		System.setProperty("webdriver.ie.driver", "C:\\Users\\Roshan Jha\\eclipse-workspace\\Seleniumautomation\\all_necessary_file\\IEDriverServer.exe");
		WebDriver driver2= new InternetExplorerDriver();
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Roshan Jha\\eclipse-workspace\\Seleniumautomation\\all_necessary_file\\msedgedriver.exe");
		WebDriver driver3 = new EdgeDriver();
		
		
		
		
	}

}
