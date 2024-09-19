package javaselenium;

import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
 

public class CalenderHandleUsing_DropdownListAndClickBtn {
	   public static void main(String[] args) {
	        WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	        driver.manage().deleteAllCookies();
	        driver.get("https://testautomationpractice.blogspot.com/");
	        
	        String dt = "10", mnth = "March", yr = "2015";
	        
	        driver.switchTo().frame("frame-one796456169");
	        driver.findElement(By.xpath("//span[@role='button']")).click();

	        // Select year
	        Select se = new Select(driver.findElement(By.xpath("//select[@class='ui-datepicker-year']")));
	        se.selectByVisibleText(yr);

	        // Call the user-defined method to select the month
	        selectMonth(driver, mnth);

	        // Select the desired day
	        List<WebElement> allDates = driver
	                .findElements(By.xpath("//table[contains(@class,'ui-datepicker-calendar')]//tbody//td"));
	        for (WebElement date : allDates) {
	            if (date.getText().equals(dt)) {
	                date.click();
	                break;
	            }
	        }
	    }

	    // User-defined method to select the month
	    public static void selectMonth(WebDriver driver, String targetMonth) {
	        Map<String, Integer> monthsMap = new HashMap<>();
	        monthsMap.put("January", 1);
	        monthsMap.put("February", 2);
	        monthsMap.put("March", 3);
	        monthsMap.put("April", 4);
	        monthsMap.put("May", 5);
	        monthsMap.put("June", 6);
	        monthsMap.put("July", 7);
	        monthsMap.put("August", 8);
	        monthsMap.put("September", 9);
	        monthsMap.put("October", 10);
	        monthsMap.put("November", 11);
	        monthsMap.put("December", 12);

	        while (true) {
	            String currentMonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();

	            // Convert the displayed month and target month to integers for comparison
	            int displayedMonthNumber = monthsMap.get(currentMonth);
	            int expectedMonthNumber = monthsMap.get(targetMonth);

	            if (displayedMonthNumber == expectedMonthNumber) {
	                break; // Stop the loop if the desired month is displayed
	            } 
	            // If displayed month is before the target month, click the "Next" button
	            else if (displayedMonthNumber < expectedMonthNumber) {
	                driver.findElement(By.xpath("//a[starts-with(@class,'ui-datepicker-next')]")).click();
	            } 
	            // If displayed month is  after the target month, click the "Previous" button
	            else {
	                driver.findElement(By.xpath("//a[starts-with(@class,'ui-datepicker-prev')]")).click();
	            }
	        }
	    }

}
