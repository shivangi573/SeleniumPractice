package day25;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathAxesDemo {

	public static void main(String[] args) {
		WebDriver driver =  new ChromeDriver();
		driver.get("https://money.rediff.com/gainers/bse/daily/groupa");
		driver.manage().window().maximize();
		
	    //Self - selects rthe current node
		String text=driver.findElement(By.xpath("//a[contains(text(), 'Muthoot')]/self::a")).getText();
		System.out.println("Self : "+text);
		
		//Parent - selects the parent of the current node that is always one
		text=driver.findElement(By.xpath("//a[contains(text(), 'Muthoot')]/parent::td")).getText();
		System.out.println("Parent : "+text);
		
		//Child - seleList<A>all children of the current node
		List<WebElement> childs = driver.findElements(By.xpath("//a[contains(text(), 'Muthoot')]/ancestor::tr/child::td"));
		System.out.println("Number of child elements : "+childs.size());
		
		//Ancestors - select all ancestors : parents and grandparents
		text = driver.findElement(By.xpath("//a[contains(text(), 'Muthoot')]/ancestor::tr")).getText();
		System.out.println("Ancestor : " + text);
		
		//Descendant - select all the descendants of the element
		List<WebElement> desc = driver.findElements(By.xpath("//a[contains(text(), 'Muthoot')]/descendant::*"));
		System.out.println("Number of descendants : "+ desc.size());
		
		//following
		List<WebElement> foll = driver.findElements(By.xpath("//a[contains(text(), 'Muthoot')]/ancestor::tr/following::tr"));
		System.out.println("Number of followings : " + foll.size());
		
		//preceding
		List<WebElement> pres = driver.findElements(By.xpath("//a[contains(text(), 'Muthoot')]/ancestor::tr/preceding::tr"));
		System.out.println("Number of precedings : " + pres.size());
		
		//following sibling
		List<WebElement> follsib = driver.findElements(By.xpath("//a[contains(text(), 'Muthoot')]/ancestor::tr/following-sibling::tr"));
		System.out.println("Number of following siblings: " + follsib.size());
		
		//preceding
		List<WebElement> pressib = driver.findElements(By.xpath("//a[contains(text(), 'Muthoot')]/ancestor::tr/preceding-sibling::tr"));
		System.out.println("Number of preceding siblings : " + pressib.size());
		
		driver.close();
		
	}

}
