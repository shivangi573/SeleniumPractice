package day24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathDemo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://automationbookstore.dev/");
		driver.manage().window().maximize();
		
		//xpath with single attribute
//		driver.findElement(By.xpath("//input[@id='searchBar']")).sendKeys("Agile Testing");
		
		//xpath with multiple attribute
//		driver.findElement(By.xpath("//input[@id='searchBar'][@placeholder='Filter books..']")).sendKeys("Agile Testing");
		
		//xpath with and or operator
//		driver.findElement(By.xpath("//input[@id='searchBar' and @placeholder='Filter books..\']")).sendKeys("Agile Testing");
//		driver.findElement(By.xpath("//input[@id='searchBar' or @placeholder='Filter boo..']")).sendKeys("Agile Testing");
		
		//xpath with inner text
//		boolean displaystatus=driver.findElement(By.xpath("//h1[text()='Automation Bookstore']")).isDisplayed();
//		System.out.println(displaystatus);
		
//		String displaytext=driver.findElement(By.xpath("//h1[text()='Automation Bookstore']")).getText();
//		System.out.println(displaytext);
		
		//xpath with contains
//		driver.findElement(By.xpath("//input[contains(@placeholder, 'Fil')]")).sendKeys("Agile Testing");
//		driver.findElement(By.xpath("//input[starts-with(@placeholder, 'Fil')]")).sendKeys("Agile Testing");
		
		//chained xpath
		boolean status = driver.findElement(By.xpath("//div[@role='banner']/h1")).isDisplayed();
		System.out.println(status);
	}

}
