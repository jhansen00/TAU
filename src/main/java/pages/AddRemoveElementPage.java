package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;


public class AddRemoveElementPage {

    private WebDriver driver;
    private By content = By.id("content");
    private By addElementButton = By.xpath("//*[@id=\"content\"]/div/button");
    private By deleteButtonArea = By.id("elements");
    private By deleteButton = By.className("added-manually");


    public AddRemoveElementPage(WebDriver driver){
        this.driver = driver;
    }

    public String getAddRemoveElementPageContent(){
        return driver.findElement(content).getText();
    }

    public void clickAddElementButton(){
        driver.findElement(addElementButton).click();
    }
    public String getDeleteButtonArea(){
        return driver.findElement(deleteButtonArea).getText();
    }
    public void clickDeleteButton(){
        driver.findElement(deleteButton).click();
    }

}
