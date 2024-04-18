import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Web_Automation {

//	public static void main(String[] args) {
	WebDriver driver;
	
	Web_Automation()
	{
		this.driver = driver;
	}
	@BeforeMethod
	public void loaddriver()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kisho\\OneDrive\\Documents\\Selenium\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();	
	}
	
	@Test
	public void lauchUrl()
	{
		// TODO Auto-generated method stub
		
		driver.get("https://www.google.com/");
		String title = driver.getTitle();
		Assert.assertEquals(title, "Google");
	}

//	}
	@AfterMethod
	public void closebrowser()
	{
		driver.close();
	}

}
