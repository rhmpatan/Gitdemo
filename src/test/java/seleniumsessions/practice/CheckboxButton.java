package seleniumsessions.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class CheckboxButton {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver","C:\\Users\\raheem.patan.DIR\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver= new EdgeDriver();
		
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		
		System.out.println(driver.findElement(By.xpath("//div[text()='Family & Friends']")).isSelected());
		

		driver.findElement(By.xpath("//div[text()='Family & Friends']")).click();
		/*
		 * if (!button.isEnabled()) { button.click(); System.out.println("Enabled");
		 * }else {System.out.println("Already enabled"); }
		 */
		System.out.println(driver.findElement(By.xpath("//div[text()='Family & Friends']")).isEnabled());

	}

}
