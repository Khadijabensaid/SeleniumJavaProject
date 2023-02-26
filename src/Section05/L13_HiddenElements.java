package Section05;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import junit.framework.Assert;

public class L13_HiddenElements {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\20101922\\Desktop\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.automationtesting.co.uk/hiddenElements.html");
		
		
		System.out.println(driver.findElement(By.cssSelector(".col-12.col12-small > p:nth-of-type(2)")).isDisplayed());
		System.out.println(driver.findElement(By.cssSelector(".col-12.col12-small > p:nth-of-type(3)")).isDisplayed());
		
		
	    
	   
	}

};
