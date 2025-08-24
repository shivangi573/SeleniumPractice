package day23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSselector {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://automationbookstore.dev/");
		driver.manage().window().maximize();
		//tag id tag#id
		//driver.findElement(By.cssSelector("input#searchBar")).sendKeys("Agile Testing");
//		driver.findElement(By.cssSelector("#searchBar")).sendKeys("Agile Testing");
		
		//tag class tag.classname
//		driver.findElement(By.cssSelector("input.ui-focus")).sendKeys("Agile Testing");
		
		//tag attribute tag[attribute='value']
//		driver.findElement(By.cssSelector("input[placeholder='Filter books..']")).sendKeys("Agile Testing");
		
		//tag class attribute tag.classname[attribute='value']
		driver.findElement(By.cssSelector("input.ui-focus[placeholder='Filter books..']")).sendKeys("Agile Testing");
	}

}
