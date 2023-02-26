package Section05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class L06_DropDownMenu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\20101922\\Desktop\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.automationtesting.co.uk/dropdown.html");
		Select menuItem = new Select(driver.findElement(By.cssSelector("select#cars")));
		//it select the item Jeep on our dropdown , we select the visible value on the website
		menuItem.selectByVisibleText("Jeep");
		//we select the value which in on the select css
		menuItem.selectByValue("ford");
	}

}
