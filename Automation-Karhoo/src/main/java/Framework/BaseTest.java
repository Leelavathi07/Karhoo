package Framework;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BaseTest {
	public static WebDriver driver;
	public Properties prop;
	public WebDriver InitializeDriver() throws IOException
	{
 prop=new Properties();
 FileInputStream fis=new FileInputStream("C:\\Users\\welcome\\eclipse-workspace\\KarhooTest\\src\\main\\java\\Globaldata.properties");
 prop.load(fis);
 String browsername=prop.getProperty("browser");
 if(browsername.equalsIgnoreCase("chrome"))
 {
	 System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\welcome\\\\Downloads\\\\chromedriver_win32 (2)\\\\chromedriver.exe");
	 driver=new ChromeDriver();
	  }
 else if(browsername.equalsIgnoreCase("ie"))
 {
	 System.setProperty("webdriver.ie.driver","\"C:\\\\Users\\\\welcome\\\\Downloads\\\\IEDriverServer_Win32_3.13.0\\\\IEdriverserver.exe\""); 
	 driver=new InternetExplorerDriver();
 }
 else if(browsername.equalsIgnoreCase("firefox"))
 {
	 System.setProperty("webdriver.gecko.driver", "\"C://Users//welcome//Downloads//geckodriver-v0.21.0-win32//geckodriver.exe\"");
	 driver=new FirefoxDriver();
 }
 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
driver.manage().window().maximize();	
 return driver;
	}
}
