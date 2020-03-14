import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

public class test1 {

	public static void main(String[] args) {
		
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Acer\\workspace\\Newjava\\chromedriver.exe");
	
			WebDriver driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get("http:\\www.google.com");
			
			WebElement element=driver.findElement(By.name("q"));
			element.sendKeys(Keys.SHIFT,"Testing Software");
			element.sendKeys(Keys.ENTER,"");
			System.out.println(driver.getTitle());
			
		
			
			
			
		}

}
