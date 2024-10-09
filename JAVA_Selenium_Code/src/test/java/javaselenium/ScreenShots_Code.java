/**
 * 
 */
package javaselenium;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShots_Code {

	/**
	 * We   Capture ScreenShots in 2 Conditions like -->>
	  When executes TestCases  gets fail & When occurs  exceptions.
	 * 1.Full Page 2.WebElement 3.Specific area of WebPage.
	 * Using  TakeScreenshot Interface and getScreenshotAs method to capture full page Screenshots.
	 * Using WebElement Interface and getScreenshotAs method to capture specific area and specific webElement Screenshots.
	 */
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.Ajio.com");
		//Take Full Page ScreenShots..........................
		TakesScreenshot ts= (TakesScreenshot) driver;
		 File sourcefile = ts.getScreenshotAs(OutputType.FILE);
		 File targetFile=new File(System.getProperty("user.dir")+"\\screenshots\\Fullpage.png");
		 sourcefile.renameTo(targetFile);
		 
		//Take Specific area ScreenShots.....................
		  WebElement Mainbanner = driver.findElement(By.xpath("//img[@alt='new']"));
		 File sfile = Mainbanner.getScreenshotAs(OutputType.FILE);
		 File tFile= new File(System.getProperty("user.dir")+"\\screenshots\\Main.png");
		  sfile.renameTo(tFile);
		  
	   //Take ScreenShots of WebElement.....
		 WebElement logo = driver.findElement(By.xpath(" //img[@alt='Ajio logo']"));
	     File src = logo.getScreenshotAs(OutputType.FILE);
	     File trgt= new File(System.getProperty("user.dir")+"\\screenshots\\Logo.png");
	     src.renameTo(trgt); //copy source file in to target file

	}

}
