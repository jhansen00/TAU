package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TyposPage {
    private WebDriver driver;
    private By typosMessaging = By.className("example");

    public TyposPage(WebDriver driver){
        this.driver = driver;
    }

    public String getTypoMessaging(){
        return driver.findElement(typosMessaging).getText();
    }
}
