package TestPackage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCases {

	public static WebDriver driver;

	@BeforeMethod
	public void launchDriverTest() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().fullscreen();
	}

	@AfterMethod
	public void quitTest() {
		driver.quit();
	}

	@Test
	public void test1() {
		driver.navigate().to("https://www.google.com");
		System.out.println(driver.getTitle());	
	
	}

	@Test
	public void test2() {
		driver.navigate().to("https://mangakakalot.com");
		System.out.println(driver.getTitle());
	}

	@Test
	public void test3() {
		driver.navigate().to("https://mangakakalot.com");
		System.out.println(driver.getTitle());
	}
}
