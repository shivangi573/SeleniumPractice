package day21;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
/* Test Case:
 1. launch browser(chrome)
 2. open url https://www.saucedemo.com/
 3. validate title should be "Your Store"
 4. close browser */
public class FirstTestCase {

	public static void main(String[] args) {
//		System.out.println("testing..");
//		1. launch browser(chrome)
		//ChromeDriver driver = new ChromeDriver();
		
		WebDriver driver = new ChromeDriver();
//		2. open url https://www.saucedemo.com/
		driver.get("https://www.saucedemo.com/");
//		 3. validate title should be "Your Store"
		String act_title=driver.getTitle();
		if(act_title.equals("Swag Labs")) {
			System.out.println("Test Passed");
		}
		else {
			System.out.println("Test failed");
		}
//		 4. close browser 
//		driver.close();
		driver.quit();
	}

}
