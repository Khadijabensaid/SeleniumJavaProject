package Section05;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import junit.framework.Assert;

public class L10_Assertion_pt2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\20101922\\Desktop\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.automationtesting.co.uk");
		driver.findElement(By.linkText("TEST STORE")).click();
		driver.findElement(By.cssSelector("img[alt='Hummingbird printed t-shirt']")).click();
		//driver.findElement(By.cssSelector("[alt='Brown bear printed sweater']")).click();
		driver.findElement(By.cssSelector("[class='btn btn-primary add-to-cart']")).click();
		Thread.sleep(2000);
		String total = driver.findElement(By.cssSelector(".product-total >  .value")).getText();
		Assert.assertEquals("$26.11", total);
		
	   
	}

};
