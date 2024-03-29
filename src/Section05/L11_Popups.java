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

public class L11_Popups {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\20101922\\Desktop\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.automationtesting.co.uk/popups.html");
	    driver.findElement(By.cssSelector("[onclick='popup()']")).click();
	    
		String MainWindow = driver.getWindowHandle();
		
		Set<String> handles = driver.getWindowHandles();
		
		Iterator <String> iterate = handles.iterator();
		
		while(iterate.hasNext()) {
			String child = iterate.next();
			
			if(!MainWindow.equalsIgnoreCase(child)) {
				Thread.sleep(3000);
				driver.switchTo().window(child);
				driver.close();
			}
		}
		Thread.sleep(3000);
		driver.switchTo().window(MainWindow);
		driver.findElement(By.cssSelector("button[onclick='alertTrigger()']")).click();
		
	   
	}

};
