package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class StatusCodePage {
    private WebDriver driver;
    private By statusCodeHeader = By.className("example");

    public StatusCodePage(WebDriver driver){
        this.driver = driver;
    }

    public String getStatusCodePageName(){
        return driver.findElement(statusCodeHeader).getText();
    }



}
