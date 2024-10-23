package swatikagalkaracademy.IntroductionSeleniumAll;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsDemo {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C://users//Swati//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_5szpgfto9i_e&adgrpid=155259813593&hvpone=&hvptwo=&hvadid=674893540034&hvpos=&hvnetw=g&hvrand=7471074460045469938&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9147983&hvtargid=kwd-64107830&hydadcr=14452_2316413&gad_source=1");
		Actions a =new Actions(driver);
		WebElement move =driver.findElement(By.cssSelector("a[id='nav-link-accountList']"));
		a.moveToElement(move).build().perform();
		
		a.moveToElement(driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"))).click().keyDown(Keys.SHIFT).sendKeys("Hello").build().perform();
		a.moveToElement(driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"))).
		click().keyDown(Keys.SHIFT).sendKeys("Hello").doubleClick().build().perform();
		
		a.moveToElement(move).contextClick().build().perform();
	}

}
