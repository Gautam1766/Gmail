package TestCaseFile;



import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import UtilitiesP.ReadCong;

public class BaseCls {
	
	public static WebDriver driver;
	
//	public static Logger Log1;
	ReadCong rc=new ReadCong();
	 String url2=rc.getUrl();
	 String bro=rc.getBro();
	
	@BeforeSuite
	void BL() 
	{
		switch (bro.toLowerCase()) {
		case "chrome":
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			break;
			
		case "edge":
			driver=new EdgeDriver();
			driver.manage().window().maximize();
			break;
			
		case "firefox":
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
			break;

		default:
			driver=null;
			break;
		}
	//	Log1=LogManager.getLogger("Game");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	}
	public void screenshot() throws Exception 
	{
		File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File Dset= new File("C:\\Users\\pc\\eclipse-workspace\\Game\\ScreenShot\\ST3.png");
		FileUtils.copyFile(source, Dset);
	}

}
