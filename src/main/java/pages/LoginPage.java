package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    //WebDriver field
    private WebDriver driver;

    //LoginPage constructor
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    //Find and declare Username field
    private By usernameField = By.id("username");

    //Find and declare Password field
    private By passwordField = By.id("password");

    //Find and declare login button
    private By loginButton = By.cssSelector("#login button");

    //Set User Name
    public void setUsername(String username) {
        driver.findElement(usernameField).sendKeys(username);
    }

    //Set Password
    public void setPasssword(String password) {
        driver.findElement(passwordField).sendKeys(password);
    }

    //Click Login Button
    public  SecureAreaPage clickLoginButton(){
        driver.findElement(loginButton).click();
        return new SecureAreaPage(driver);
    }
}