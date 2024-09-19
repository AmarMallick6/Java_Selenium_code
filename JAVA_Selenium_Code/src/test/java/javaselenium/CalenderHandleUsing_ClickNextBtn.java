package javaselenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderHandleUsing_ClickNextBtn {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().deleteAllCookies();
		driver.get("https://www.irctc.co.in/nget/train-search");
		String expectdate = "1-January-2025"; //Below 4 syntax for easy to change Date..
		String[] sp = expectdate.split("-");
		String dt = sp[0];
		String mnth = sp[1];
		String yr = sp[2];
		driver.findElement(By.id("jDate")).click();
		// Select Month and year.......................................
		while (true) {
			String actualmonth = driver.findElement(By.xpath("//span[starts-with (@class,'ui-datepicker-month')]"))
					.getText();
			String actualyear = driver.findElement(By.xpath("//span[starts-with (@class, 'ui-datepicker-year')]"))
					.getText();
			if (actualmonth.equals(mnth) && actualyear.equals(yr)) {
				break;
			} else {
				driver.findElement(By.xpath("//a[contains(@class,'ui-datepicker-next')]")).click();
			}
		}
		// Select date ...................................................
		List<WebElement> Alldate = driver
				.findElements(By.xpath("//table[contains(@class,'ui-datepicker-calendar')]//tbody//td"));
		for (WebElement dates : Alldate) {
			if (dates.getText().equals(dt)) {
				dates.click();
			}
		}
            driver.close();
	}
}
