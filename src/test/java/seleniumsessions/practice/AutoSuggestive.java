package seleniumsessions.practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class AutoSuggestive {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver","C:\\Users\\raheem.patan.DIR\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver= new EdgeDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("input#autosuggest")).sendKeys("gre");
		Thread.sleep(3000);

		List<WebElement> options=driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
		//Thread.sleep(2000);
		System.out.println(options.size());
		
		  for(WebElement option:options) {
			// Thread.sleep(2000);
	      //for(int i = 0; i < options.size(); i++) {
		 System.out.println(option.getText());
		
			
			  if(option.getText().equalsIgnoreCase("Greece")) { 
			  Thread.sleep(1000);
			  option.click(); 
			  break;
			  }
			 
			
			  //Thread.sleep(2000);
			  
				/*
				 * if(option.getText().equalsIgnoreCase("Greece")){ //Thread.sleep(2000);
				 * option.click(); break; }
				 */
			 
		  }
		 
	
	}

}
