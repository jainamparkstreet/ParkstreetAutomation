package Package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		 driver.get("https://stgappnavigator.parkstreet.com/login");
		 
		 WebElement username=driver.findElement(By.id("email"));
		 WebElement password=driver.findElement(By.id("password"));
		 
		 username.sendKeys("jbedoya");
		 password.sendKeys("Park2003Street");
		 
		 WebElement login=driver.findElement(By.className("btn"));
		 login.click();
		 
		 Thread.sleep(10000);
		 
		 WebElement internal = driver.findElement(By.className("psi-dropdown-v2"));
		 internal.click();
		 // To check login successfully or not we can user assertion for that
		 
	
	}

}
