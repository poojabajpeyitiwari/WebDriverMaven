import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class LoginTest {
	public static WebDriver driver;

	@BeforeSuite
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "E:/Homework/Workspace/DataDrivenMavenProject/Browsers/chromedriver.exe");
		driver = new ChromeDriver();
	}

	@Test
	public void doLogin() {
		driver.get("http://facebook.com");
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("bajpeyipooja@gmail.com");
		driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("jc_306671y");
		driver.findElement(By.xpath("//*[@id='u_0_a']")).click();
	}

	@AfterSuite
	public void tearDown() {
		driver.quit();
	}

}
