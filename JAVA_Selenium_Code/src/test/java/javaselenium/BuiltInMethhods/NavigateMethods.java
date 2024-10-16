package javaselenium.BuiltInMethhods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethods {

	public static void main(String[] args) {
 /**navigate()--> The driver  to access browser history & to navigate to a given URL.
 * 1.to() --> Load a new web page in current browser window & the method  will be 
		                  blocked until full page load is not complete.
 * 2.refresh()--> refresh the current page.
 * 3.forward()-->move a single item forward in the browser history.
 * 4.back()--> move a single item backward in the browser history.
 **/
		WebDriver  driver = new ChromeDriver();
		driver.navigate().to("https://www.Ajio.com");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.findElement(By.xpath("//span[@aria-label='WOMEN']")).click();
		
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
	}
}
