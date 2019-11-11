package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ABTestingPage {

    private WebDriver driver;
    private By ABTestingTitle = By.className("example");

    public ABTestingPage(WebDriver driver){
        this.driver = driver;
    }

    public String getABTestingTitle(){
        return driver.findElement(ABTestingTitle).getText();
    }
}
