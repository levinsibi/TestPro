package pageFactory;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".//lib//chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.hrblock.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		HomePage home=new HomePage(driver);
		LoginPage login=new LoginPage(driver);
		home.signIn();
		login.loginAction();
		driver.quit();
	}

}
