package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckboxesPage {
    private WebDriver driver;
    private By checkboxOne = By.xpath("//form[@id=\"checkboxes\"]/input[1]");
    private By checkboxTwo = By.xpath("//form[@id=\"checkboxes\"]/input[2]");

    public CheckboxesPage(WebDriver driver){
        this.driver = driver;
    }

    public void clickCheckboxOne(){
        driver.findElement(checkboxOne).click();
    }

    public void clickCheckboxTwo(){
        driver.findElement(checkboxTwo).click();
    }

    public boolean isCheckboxOneChecked(){
        return driver.findElement(checkboxOne).isSelected();
    }

    public boolean isCheckboxTwoChecked(){
        return driver.findElement(checkboxOne).isSelected();
    }
}
