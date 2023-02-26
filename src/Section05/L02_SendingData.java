package Section05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class L02_SendingData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\20101922\\Desktop\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.automationtesting.co.uk/contactForm.html");
		driver.findElement(By.cssSelector("input[name='first_name']")).sendKeys("Khadija");
		driver.findElement(By.cssSelector("input[name='last_name']")).sendKeys("ben");
		driver.findElement(By.cssSelector("input[name='email']")).sendKeys("khadija@gmail.com");
		
		
	}

}
