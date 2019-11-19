package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class KeyPressesPage {
    private WebDriver driver;
    protected HomePage homePage;
    private By contentField = By.className("example");
    private By textInputField = By.id("target");
    private By dynamicTextField = By.id("result");
    private By pageBody = By.cssSelector("body");


    public KeyPressesPage(WebDriver driver){
        this.driver = driver;
    }

    public String getKeyPressesContent(){
        return driver.findElement(contentField).getText();
    }
    public void keyPressesInputField(){
        driver.findElement(textInputField).sendKeys("DEF");
    }
    public void keyPressesBody(){
        driver.findElement(pageBody).sendKeys("ABC");
    }
    public String getDynamicText(){
        return driver.findElement(dynamicTextField).getText();
    }

}
