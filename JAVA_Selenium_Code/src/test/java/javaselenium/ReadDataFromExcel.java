package javaselenium;

import java.io.File;
import java.time.Duration;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ReadDataFromExcel {
	WebDriver  driver;
	@BeforeMethod
public	void setUp() {
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	//you can read data from @Dataprovider by using method name value as data provider attribute value using @test. 
	//Also can read data from @Dataprovider by using data provider name value as data provider attribute value using @test
    @Test(dataProvider = "Logindata")
	public  void mainTest(String username,String pwd) {
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(pwd);
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		driver.close();
	}
    
    @DataProvider(name = "Logindata")
    public String[][] testdata() {
    	XSSFWorkbook wb = null;
    	try {
    	File datafile=new File(System.getProperty("user.dir")+"\\TestData\\DataDemo.xlsx");
    	 wb = new XSSFWorkbook(datafile);
    	}catch (Exception e) {
			e.printStackTrace();
		}
             XSSFSheet s = wb.getSheet("LoginData");
            int rows = s.getLastRowNum();//count the row numbers
    	   int cols=s.getRow(0).getLastCellNum();//count the column numbers
    	   String data[][]=new  String[rows][cols];
    	   for (int r = 0; r < rows; r++) {
    		     XSSFRow row = s.getRow(r+1); //using (r+1)as index because first index is header row
    		     for (int c = 0; c < cols; c++) {
    		    	         XSSFCell cell = row.getCell(c);
    		    	         CellType celltype = cell.getCellType();
    		    	         switch (celltype) {
							case STRING: data[r][c]=cell.getStringCellValue();
							break;
							case NUMERIC: data[r][c]=Integer.toString((int)cell.getNumericCellValue());
							break;
							case BOOLEAN:data[r][c]=Boolean.toString(cell.getBooleanCellValue());
                               break;
							default:
								break;
							}
    		 	}
			}
    	   return data;
    	
    }
        }
