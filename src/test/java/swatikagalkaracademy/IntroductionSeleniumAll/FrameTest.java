package swatikagalkaracademy.IntroductionSeleniumAll;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FrameTest 
{
public static void main(String[] args) 
	
	{
		System.setProperty("webdriver.chrome.driver", "C://users//Swati//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[class='demo-frame']")));
		Actions a =new Actions(driver);
		WebElement source =driver.findElement(By.cssSelector("#draggable"));
		WebElement target= driver.findElement(By.cssSelector("#droppable"));
		
		a.dragAndDrop(source, target).build().perform();
		
	}

}
