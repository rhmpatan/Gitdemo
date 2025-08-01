package seleniumsessions.practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class CheckedUnchecked {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver","C:\\Users\\raheem.patan.DIR\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver= new EdgeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		System.out.println(driver.findElement(By.cssSelector("#checkBoxOption1")).isSelected());
		WebElement checkbox=driver.findElement(By.cssSelector("#checkBoxOption1"));
		 checkbox.click();
		 System.out.println(checkbox.isSelected());
		 checkbox.click();
		 System.out.println(checkbox.isSelected());

		
		/*
		 * if (!checkbox.isSelected()) { checkbox.click();
		 * System.out.println("checkbox sucessfully checked"); }
		 * 
		 * if(checkbox.isSelected()) {
		 * 
		 * System.out.println("checked"); }else { System.out.println("unchecked"); }
		 * checkbox.click(); if(!checkbox.isSelected())
		 * System.out.println("checkbox is succesfully unchecked"); else
		 * System.out.println("checkbox is still checked");
		 */
		List<WebElement> checkboxes=driver.findElements(By.xpath("//input[@type='checkbox']"));
		System.out.println(checkboxes.size());
}

}
