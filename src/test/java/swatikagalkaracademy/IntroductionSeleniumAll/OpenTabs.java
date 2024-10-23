package swatikagalkaracademy.IntroductionSeleniumAll;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenTabs {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C://users//Swati//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		//To find links in footer section
		
		WebElement footerDriver=driver.findElement(By.cssSelector("#gf-BIG"));
		System.out.println(footerDriver.findElements(By.tagName("a")).size());
		
		//to find links in first section of footer
		
		WebElement columnDriver=driver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(columnDriver.findElements(By.tagName("a")).size());
		
		//clicking on each link in column driver and checking if pages are opening
		
		for(int i=1;i<columnDriver.findElements(By.tagName("a")).size();i++)
		{
			String clickOnLinksTab=Keys.chord(Keys.CONTROL,Keys.ENTER);
			columnDriver.findElements(By.tagName("a")).get(i).sendKeys(clickOnLinksTab);
			Thread.sleep(5000);
		}
		Set<String> windows=driver.getWindowHandles();
		Iterator<String> it =windows.iterator();
		while(it.hasNext())
		{
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
		}
	}

}
