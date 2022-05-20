package variousConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome {
//we make global variable
static WebDriver driver;
	
	public static void main(String[] args) {
		
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\arefh\\December2021Selenium\\1st_Selenuim\\driver\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		//delete Cookies
//		driver.manage().deleteAllCookies();
//		//go to the site
//		driver.get("https://techfios.com/billing/?ng=dashboard/");
//		//Maximize the window
//		driver.manage().window().maximize();
//		
//		//identify username element and data insertion
//		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
//		//identify password element & data insertion
//		driver.findElement(By.id("password")).sendKeys("abc123");
//		//identify login element and click
//		driver.findElement(By.name("login")).click();
//		
//		//close browser
//		driver.close();
		
//In above we did 3 steps and we can make methods for each and called the by thier names like below
		launchBrowser();
		loginTest();
		tearDown();
		//calling negative loging test
		launchBrowser();
		negativeLoginTest();
		tearDown();
//we will have to many negative test therefore they made framework tool thats called Junit that doesn't need to write main method it already
//attached to it.
	}
	public static void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\arefh\\December2021Selenium\\1st_Selenuim\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		//delete Cookies
		driver.manage().deleteAllCookies();
		//go to the site
		driver.get("https://techfios.com/billing/?ng=dashboard/");
		//Maximize the window
		driver.manage().window().maximize();	
	}
	public static void loginTest() {
		//identify username element and data insertion
		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
		//identify password element & data insertion
		driver.findElement(By.id("password")).sendKeys("abc123");
		//identify login element and click
		driver.findElement(By.name("login")).click();
		
	}
	public static void negativeLoginTest() {
		//identify username element and data insertion
				driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
				//identify password element & data insertion
				driver.findElement(By.id("password")).sendKeys("abc12233");
				//identify login element and click
				driver.findElement(By.name("login")).click();
		
	}
	public static void tearDown() {
		//close browser
		driver.close();
		
	}



		
		
		
	}


