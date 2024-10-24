package javaselenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class I_FrameHandle {

	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://ui.vision/demo/webtest/frames/");
		WebElement frame_3 = driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
	    driver.switchTo().frame(frame_3).switchTo().frame(0);//Switch to nested I-frame.
	    driver.findElement(By.xpath("//div[@id='i11']//div[@class='AB7Lab Id5V1']")).click();
        driver.switchTo().defaultContent();//Return to Main Frame.
		

	}

}
