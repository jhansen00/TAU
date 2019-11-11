package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RedirectLinkPage {

    private WebDriver driver;
    private By redirectionName = By.className("example");
    private By triggerRedirectLink = By.id("redirect");


    public RedirectLinkPage(WebDriver driver){
        this.driver = driver;
    }

    public String getRedirectionPageName(){
        return driver.findElement(redirectionName).getText();
    }

    public StatusCodePage clickRedirectTriggerLink(){
        driver.findElement(triggerRedirectLink).click();
        return new StatusCodePage(driver);
    }
}
