package swatikagalkaracademy.IntroductionSeleniumAll;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C://users//Swati//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.cssSelector("#inputUsername")).sendKeys("swati");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("hello123");
		driver.findElement(By.cssSelector(".signInBtn")).click();
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("swati");
		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("swatiacademy.com");
		driver.findElement(By.cssSelector("input[type='text']:nth-child(4)")).sendKeys("91817181");
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		driver.findElement(By.cssSelector("form p")).getText();
		driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("#inputUsername")).sendKeys("swati");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector(".signInBtn")).click();
	}

}
