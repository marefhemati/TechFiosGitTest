package variousConcept;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginTest_Junit {
//we make global variable of driver
	WebDriver driver;

	@Before // @Before runs before each test when it on test finished it goes to other
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\arefh\\December2021Selenium\\1st_Selenuim\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		// delete Cookies
		driver.manage().deleteAllCookies();
		// go to the site
		driver.get("https://techfios.com/billing/?ng=dashboard/");
		// Maximize the window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);//if it open it 3 second it will not wait more and will go to next.
	}

	@Test
	public void loginTest() {
		// identify username element and data insertion
		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
		// identify password element & data insertion
		driver.findElement(By.id("password")).sendKeys("abc123");
		// identify login element and click
//		Thread.sleep(3000); // we use it for our own uderstanding 
//		WebDriverWait wait = new WebDriverWait(); // we use for real coding 
		driver.findElement(By.name("login")).click();
	}

	@Test
	public void negativeLoginTestPassword() {
		// identify username element and data insertion
		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
		// identify password element & data insertion
		driver.findElement(By.id("password")).sendKeys("abc12233");
		// identify login element and click
		driver.findElement(By.name("login")).click();
	}


	@After
	public void tearDown() {
		// close browser
		driver.close();

	}
}
