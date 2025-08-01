package seleniumsessions.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class AssesmentForm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver","C:\\Users\\raheem.patan.DIR\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		//System.setProperty("webdriver.chrome.driver","C:\\Windows\\chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver", "C:\\path\\to\\chromedriver.exe");

		//WebDriver driver = new ChromeDriver();
		
		WebDriver driver= new EdgeDriver();
		//WebDriver driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("input[name='name']")).sendKeys("Raheem");
		driver.findElement(By.cssSelector("input[name='email']")).sendKeys("abcxyz@gmail.com");
		driver.findElement(By.cssSelector("#exampleInputPassword1")).sendKeys("abcxyz");
		driver.findElement(By.cssSelector("#exampleCheck1")).click();
		WebElement dropdown=driver.findElement(By.cssSelector("#exampleFormControlSelect1"));
		Select option= new Select(dropdown);
		option.selectByIndex(0);
		driver.findElement(By.cssSelector("#inlineRadio1")).click();
		driver.findElement(By.cssSelector("input[type='date']")).sendKeys("08/20/1990");
		driver.findElement(By.cssSelector(".btn.btn-success")).submit();
		String message=driver.findElement(By.cssSelector(".alert.alert-success.alert-dismissible")).getText();
		System.out.println(message);
	}
	
}
