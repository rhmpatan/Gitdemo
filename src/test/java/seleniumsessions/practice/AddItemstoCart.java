package seleniumsessions.practice;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class AddItemstoCart {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\raheem.patan.DIR\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		;
		WebDriver driver = new EdgeDriver();
		String[] itemsNeeded = {"Cucumber","Carrot","Brocolli"};
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		//List<WebElement> items = driver.findElements(By.xpath("//h4[@class='product-name']"));
		/*
		 * for(WebElement item:items) { System.out.println(item.getText()); }
		 */
		addItems(driver, itemsNeeded);
	}

	public static void addItems(WebDriver driver, String[] itemsNeeded) throws InterruptedException {
		int j = 0;
		List<WebElement> items = driver.findElements(By.xpath("//h4[@class='product-name']"));
		Thread.sleep(2000);
		 
		for (int i = 0; i < items.size(); i++) {
			String[] itemrequired = items.get(i).getText().split("-");
			//System.out.println(itemrequired[0]);
			String itemrequiredFormat = itemrequired[0].trim();
			List<String> finalItems = Arrays.asList(itemsNeeded);
			/*
			 * for (int j=0;j<finalItems.size();j++) {
			 * if(finalItems.contains(itemrequiredFormat)) {
			 * driver.findElement(By.xpath("//div[@class='product-action']/button")).click()
			 * ;
			 * 
			 * } }
			 */
			if (finalItems.contains(itemrequiredFormat)) {
				j++;
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				if(j==itemsNeeded.length) {
				break;
				}
				

			}

		}
	}
}
