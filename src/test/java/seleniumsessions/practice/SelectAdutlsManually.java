package seleniumsessions.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class SelectAdutlsManually{

	public static void main(String[] args) throws InterruptedException{
		//WebDriverManager.edgedriver().setup();
		 //WebDriverManager.edgedriver().setup();
		
		System.setProperty("webdriver.edge.driver","C:\\Users\\raheem.patan.DIR\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver= new EdgeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//div[@data-testid='home-page-travellers']")).click();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.xpath("//div[@data-testid='home-page-travellers'] //div[@class='css-76zvg2 css-bfa6kz r-homxoj r-ubezar']")).getText());
		for(int i=1;i<3;i++) {
			
			driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-k8qxaj r-d9fdf6']//div[1]//div[2]//div[3]//*[name()='svg']")).click();
			
		}
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@data-testid='home-page-travellers-done-cta']")).click();
	    System.out.println(driver.findElement(By.xpath("//div[@data-testid='home-page-travellers'] //div[@class='css-76zvg2 css-bfa6kz r-homxoj r-ubezar']")).getText());
	}
	

}
