package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginPage {

    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//button[@class='ibm-profile-link']")
    public WebElement profileButton;

    @FindBy(linkText = "Minha IBM")
    public WebElement loginPageButton;

    @FindBy(id = "username")
    public WebElement usernameBox;

    @FindBy(id = "continue-button")
    public WebElement continueBtn;

    @FindBy(id = "password")
    public WebElement passwordBox;

    @FindBy(id = "signinbutton")
    public WebElement signinBtn;

    @FindBy(id = "password-error-msg")
    public WebElement errorMsg;

    public void whenUsernameAndPasswordIncorrect(String username, String password) {
        //Click on profile button from Home page
        profileButton.click();

        //Click on login page button from Home page
        loginPageButton.click();

        //Send username
        usernameBox.sendKeys(username);

        //Click on continue button
        continueBtn.click();

        //Send password
        passwordBox.sendKeys(password);

        //Click on sign in button
        signinBtn.click();

        //Verify error message is displaying or not
        Assert.assertTrue(errorMsg.isDisplayed(), "Error message is displaying");


    }
}
