package Section05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class L03_Checkboxes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\20101922\\Desktop\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.automationtesting.co.uk/dropdown.html");
		System.out.println(driver.findElement(By.cssSelector("input[id='cb_red']")).isSelected());
		System.out.println(driver.findElement(By.cssSelector("input[id='cb_green']")).isSelected());
		driver.close();
	
		
	}

}
