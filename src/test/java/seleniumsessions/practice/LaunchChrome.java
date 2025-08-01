package seleniumsessions.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;




public class LaunchChrome {

	public static void main(String[] args) {
		
		
		        // Set path to chromedriver.exe
		        //System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe");

				//WebDriverManager.chromedriver().setup();

		        // Start browser
		        WebDriver driver = new ChromeDriver();
		        
		        driver.get("https://www.google.com");
		        System.out.println("Title: " + driver.getTitle());
		        driver.quit();
		    
		

	}

}
