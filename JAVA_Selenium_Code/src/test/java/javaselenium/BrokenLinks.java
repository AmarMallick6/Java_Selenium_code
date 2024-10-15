package javaselenium;

import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
	/* BrokenLink :-> which links have no corresponding resource available in server is known as BrokenLinks.
	 * BrokenLink Status code is >=400 and It does not return anything.
	 * Check Broken Links -->>>
	   Step-1--> Check hreference value is not null or not empty .
	   Step-2--> Convert hrefvalue String to URL format.
	   Step-3--> hit URL for connect to the server.
	   Step-4-->   Verify Status code is >= 400
	   */
		
	
	WebDriver driver= new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("http://www.deadlinkcity.com/");
	// Capture Number of Links present >>>>>>>>>>>>>>
	 List<WebElement> links = driver.findElements(By.tagName("a"));
	 System.out.println("All Links present in the site is : " + links.size()); //48
	 
	 
		 int brokenlinkcount=0;
	 //Step-1--> Check hreference value is not null or not empty >>>>>>>>>>>>>
	 for (WebElement link : links) {
		    String hrefvalue = link.getAttribute("href");
		    if (hrefvalue==null || hrefvalue.isEmpty()) {
		    	System.out.println(hrefvalue +" -->>>Link is not clickable");
		    	continue; } 
		    
		    try {
	 //Step-2--> Convert hrefvalue String to URL format >>>>>>>>>>>>>>>>>
		  URL linkUrl= new URL(hrefvalue);
	 //Step-3--> hit URL for connect to the server >>>>>>>>>>>>>>>>>>>
		 HttpURLConnection  conect = (HttpURLConnection) linkUrl.openConnection(); //open connection to the server
           conect.connect(); //Connect to  the server & send request to the server
		    int responscode = conect.getResponseCode(); // Show ResponseCode Value
	//Step-4 --> Verify Status code is >= 400  >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
		 if (responscode>=400) {
			 System.out.println(hrefvalue  +" ==>Broken Link");
			 brokenlinkcount++;
		 }else {
			System.out.println(hrefvalue+" ==>Not a Broken Link");
		}

			} catch (Exception e) {
				// TODO: handle exception
			}
	 }	
	 System.out.println("Broken Link is :"+  brokenlinkcount); //42
		driver.close();		
	}
}
	 
	
	 
	 
	
