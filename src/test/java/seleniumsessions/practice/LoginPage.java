package seleniumsessions.practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\raheem.patan.DIR\\Downloads\\edgedriver_win64\\msedgedriver.exe");

		WebDriver driver = new EdgeDriver();
		
	/*	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");

		driver.findElement(By.cssSelector("#username")).sendKeys("rahulshettyacademy");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("learning");
		driver.findElement(By.cssSelector("[value='user']")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div/div/p")));
		System.out.println(driver.findElement(By.xpath("//div/div/p")).getText());
		// System.out.println(driver.switchTo().alert().getText());
		// driver.switchTo().alert().accept();
		driver.findElement(By.cssSelector("#okayBtn")).click();
		WebElement element = driver.findElement(By.cssSelector("select.form-control"));
		Select option = new Select(element);
		option.selectByVisibleText("Student");
		driver.findElement(By.cssSelector("#terms")).click();
		driver.findElement(By.cssSelector("#signInBtn")).click();

		// div/div[@class='modal-content']/div/p
		 List<WebElement> items=driver.findElements(By.cssSelector("h4[class='card-title'] a"));
		System.out.println(driver.findElements(By.cssSelector("h4[class='card-title'] a")).size());
		// System.out.println(items.size());
		for(int i=0;i<items.size();i++) {
			items.get(i).click();
		}
		//driver.findElement(By.cssSelector(".nav-link.btn.btn-primary")).click();
		driver.findElement(By.partialLinkText("Checkout")).click();
		
		
		 * for(WebElement item:items) { System.out.println(item.getText());
		 * driver.findElement(By.cssSelector(".btn.btn-info")).click();
		 * 
		 * 
		 * }
		 
		  //driver.findElement(By.cssSelector(".nav-link.btn.btn-primary")).click();
		 

	}*/

		driver.get("https://rahulshettyacademy.com/loginpagePractise/");


		driver.manage().window().maximize();


		driver.findElement(By.name("username")).sendKeys("rahulshettyacademy");

		driver.findElement(By.id("password")).sendKeys("learning");

		driver.findElement(By.cssSelector(".customradio:nth-child(2)")).click();

		//Thread.sleep(3000);

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(7000));

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("okayBtn")));

		driver.findElement(By.id("okayBtn")).click();

		WebElement options = driver.findElement(By.xpath("//select[@class='form-control']"));

		Select dropdown = new Select(options);

		dropdown.selectByValue("consult");

		driver.findElement(By.id("signInBtn")).click();







		wait.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText("Checkout")));

		List <WebElement> products = driver.findElements(By.cssSelector(".card-footer .btn-info"));

		for(int i =0;i<products.size();i++)

		{

		products.get(i).click();

		}

		driver.findElement(By.partialLinkText("Checkout")).click();
		
	



}


}

