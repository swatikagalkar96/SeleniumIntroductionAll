package swatikagalkaracademy.IntroductionSeleniumAll;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class StreamLiveDemo {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C://users//Swati//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.findElement(By.xpath("//tr/th[1]")).click();
		List<WebElement> elementLists=driver.findElements(By.xpath("//tr/td[1]"));
		List<String> originalList=elementLists.stream().map(s->s.getText()).collect(Collectors.toList());
		List<String> sortedlist=originalList.stream().sorted().collect(Collectors.toList());
		Assert.assertTrue(originalList.equals(sortedlist));
		
		
		//scan the name column with gettext-->beans-->print the price of rice
		List<String> price;
		
		do
		{
			List<WebElement> rows =driver.findElements(By.xpath("//tr/td[1]"));
			price =rows.stream().filter(s->s.getText().contains("Rice")).
					map(s->getPriceVeggie(s)).collect(Collectors.toList());
		
			price.forEach(a->System.out.println(a));
			if(price.size()<1)
			{
				driver.findElement(By.cssSelector("[aria-label='Next']")).click();
			}
		}while(price.size() < 1);
	}

	private static String getPriceVeggie(WebElement s) 
	{
		String priceValue = s.findElement(By.xpath("following-sibling::td[1]")).getText();
		return priceValue;
	}

}
