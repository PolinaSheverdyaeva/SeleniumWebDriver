package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.xml.xpath.XPath;

public class LoginPage {

    public WebDriver ldriver;

    public LoginPage(WebDriver rdriver){
        ldriver=rdriver;
        PageFactory.initElements(rdriver, this);
    }
    @FindBy(id="Email")
    @CacheLookup
    WebElement txtEmail;

    @FindBy(id="Password")
    @CacheLookup
    WebElement txtPassword;

    @FindBy(xpath="//*[@id='submit']")
    @CacheLookup
    WebElement btnSubmit;

    @FindBy(xpath = "//*[@id='signup']")
    @CacheLookup
    WebElement btnSignUp;

    public void setUserName(String userName){
        txtEmail.clear();
        txtEmail.sendKeys(userName);
    }

    public void setPassword(String password){
        txtPassword.clear();
        txtPassword.sendKeys(password);
    }
}
