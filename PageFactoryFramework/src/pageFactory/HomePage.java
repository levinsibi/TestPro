package pageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Preconditions;

public class HomePage {

	
	WebDriver driver=null;
	
	@FindBy(how=How.XPATH,using="//button[@title='Sign in or create an account']")
	WebElement SignIn;
	@FindBy(how=How.XPATH,using="//a[text()='Sign in ']")
	WebElement SignInMyAccount;
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void signIn() {
	
		SignIn.click();
		WebDriverWait wait=new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(SignInMyAccount));
		SignInMyAccount.click();
	}
}
