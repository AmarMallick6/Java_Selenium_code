package javaselenium.BuiltInMethhods;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserMethods {

	public static void main(String[] args) throws InterruptedException {
		/* In this methods Driver interact with webPages not with WebElements.
		01 . close() :->  Use to close the current browser windows. 
		02 . quit() :->  Use to close all browser windows.
         */
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		driver.findElement(By.xpath("//div[@class='orangehrm-login-footer-sm']//a[2]")).click();
		driver.findElement(By.xpath("//div[@class='orangehrm-login-footer-sm']//a[4]")).click();
		Thread.sleep(3000);  //optional command use to see how it execute the code
		driver.close();
		//Close multiple specific browser windows...>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
		     Set<String> wids = driver.getWindowHandles();
		     List<String> ids= new ArrayList<String>(wids);
		     for (String wid : ids) {
			String wtitle = driver.switchTo().window(wid).getTitle();
				if (wtitle.equals("OrangeHRM Inc - YouTube") || wtitle.equals("Human Resources Management Software | OrangeHRM")) {
					driver.close();
				}
			}
		
		Thread.sleep(3000);  //optional command use to see how it execute the code
		driver.quit();
	}

}
