package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class HomePage {

    //Instantiate driver field
    private WebDriver driver;

    //Home Page constructor
    public  HomePage(WebDriver driver){
        this.driver = driver;
    }

    //Click the Form Authentication link
    public LoginPage clickFormAuthentication(){
        clickLink("Form Authentication");
        return new LoginPage(driver);
    }
    //Click the Dropdown link
    public DropdownPage clickDropdown(){
        clickLink("Dropdown");
        return new DropdownPage(driver);
    }

    //Click the Forgot Password link
    public  ForgotPasswordPage clickForgotPassword(){
        clickLink("Forgot Password");
        return new ForgotPasswordPage(driver);
    }

    //Click on Redirect Link
    public RedirectLinkPage clickRedirectLink(){
        clickLink("Redirect Link");
        return new RedirectLinkPage(driver);
    }

    //Click on Typos Link
    public TyposPage clickTyposLink(){
        clickLink("Typos");
        return new TyposPage(driver);
    }

    //Click on A/B Testing Link
    public ABTestingPage clickABTesting(){
        clickLink("A/B Testing");
        return new ABTestingPage(driver);
    }

    //Click on Checkboxes link
    public CheckboxesPage clickCheckboxes(){
        clickLink("Checkboxes");
        return new CheckboxesPage(driver);
    }

    //Click on Hovers link
    public HoversPage clickHovers(){
        clickLink("Hovers");
        return new HoversPage(driver);
    }

    //Click on Context Menu link
    public ContextMenuPage clickContextMenu(){
        clickLink("Context Menu");
        return new ContextMenuPage(driver);
    }

    //Clicking the link with the passed in text
    private void clickLink(String linkText){
        driver.findElement(By.linkText(linkText)).click();
    }
}
