package day26;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalMethods {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/register");
		driver.manage().window().maximize();
		
//		WebElement logo = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
//		System.out.println(logo.isDisplayed());
		
//		boolean status = driver.findElement(By.xpath("//input[@id='FirstName']")).isEnabled();
//		System.out.println(status);

		WebElement male = driver.findElement(By.xpath("//input[@id='gender-male']"));
		WebElement female = driver.findElement(By.xpath("//input[@id='gender-female']"));
		
		System.out.println(male.isSelected());
		System.out.println(female.isSelected());
		
		male.click();
		System.out.println(male.isSelected());
		System.out.println(female.isSelected());
		
		female.click();
		System.out.println(male.isSelected());
		System.out.println(female.isSelected());
	}

}
