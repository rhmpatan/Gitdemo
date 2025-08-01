package seleniumsessions.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SourceDestination {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//input[@value='Agra (AGR)']
		//Bengaluru (BLR)
		System.setProperty("webdriver.edge.driver","C:\\Users\\raheem.patan.DIR\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver= new EdgeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//div[text()='From']")).click();
		
		driver.findElement(By.xpath("//div[text()='Agra']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Bhopal']")).click();
		
	}

}
