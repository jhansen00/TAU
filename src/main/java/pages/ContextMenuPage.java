package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ContextMenuPage {
    private WebDriver driver;
    private By contextMenuPage = By.className("example");
    public By hotSpot = By.id("hot-spot");

    public ContextMenuPage(WebDriver driver){
        this.driver = driver;
    }

    public String getContextMenu(){
        return driver.findElement(contextMenuPage).getText();
    }
    public void clickHotSpot(){
        WebElement hotspot = driver.findElement(hotSpot);
        Actions actions = new Actions(driver);
        actions.contextClick(hotspot).perform();
    }
}