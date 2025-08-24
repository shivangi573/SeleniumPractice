package day22;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
//		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		
		//name locator
//		driver.findElement(By.name("username")).sendKeys("shivangi");
		
		//id locator
//		Boolean toppanelstatus = driver.findElement(By.id("topPanel")).isDisplayed();
//		System.out.println(toppanelstatus);
		
		//linktext and partiallinktext
//		driver.findElement(By.linkText("about")).click();
//		driver.findElement(By.partialLinkText("abo")).click();
		
		//class name and tag name is used when we have to work with a group of elements
		//class locator and tag locator
//		List<WebElement> elmnts = driver.findElements(By.className("captionone"));
//        System.out.println(elmnts.size());
		
//		List<WebElement> elmnts = driver.findElements(By.tagName("a"));
//		System.out.println(elmnts.size());
		
		List<WebElement> elmnts = driver.findElements(By.tagName("img"));
		System.out.println(elmnts.size());
	}

}
