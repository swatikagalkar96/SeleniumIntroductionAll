package swatikagalkaracademy.IntroductionSeleniumAll;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {

	public static void main(String[] args) 
	
	{
		System.setProperty("webdriver.chrome.driver", "C://users//Swati//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.cssSelector(".blinkingText")).click();
		
		Set<String> windows=driver.getWindowHandles();
		Iterator<String> it=windows.iterator();
		
		String parentId=it.next();
		String childId=it.next();
		
		driver.switchTo().window(childId);
		
		System.out.println(driver.findElement(By.cssSelector(".im-para.red")).getText());
		
		String emailId= driver.findElement(By.cssSelector(".im-para.red")).getText().split("@")[1].trim().split(" ")[0];
		driver.switchTo().window(parentId);
		driver.findElement(By.cssSelector("#username")).sendKeys(emailId);

	}

}
