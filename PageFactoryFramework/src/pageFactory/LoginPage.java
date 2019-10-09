package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
WebDriver driver=null;
@FindBy(how=How.ID,using="username")
WebElement uname;
@FindBy(how=How.ID,using="password")
WebElement pwd;
@FindBy(how=How.XPATH,using="//button[@type='submit']")
WebElement signIn;

public LoginPage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
public void loginAction() {
	uname.sendKeys("levin");
	pwd.sendKeys("Welcome@1");
	signIn.click();
}
}
