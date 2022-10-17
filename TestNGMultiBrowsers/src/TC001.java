import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC001 {
	WebDriver driver;
	@Test
	public void openFF() throws InterruptedException {
		
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		Reporter.log("HRM opened in firefox");
		Thread.sleep(5000);
		
	}
	@BeforeMethod
	public void setUP(String Browser) {
		if(Browser.equals("FireFox")) {
			
			System.setProperty("webdriver.gecko.driver","C:\\\\Softwares\\\\Drivers\\\\geckodriver-v0.30.0-win64\\\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		
	}
	

}
