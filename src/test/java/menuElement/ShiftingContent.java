package menuElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class ShiftingContent {

    private WebDriver driver;

    public void setUp(){

        //Instantiate new Chrome Driver and launch site
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");

        //Find element by text "Shifting Content"
        WebElement shiftingContestLink = driver.findElement(By.linkText("Shifting Content"));
        shiftingContestLink.click();

        //Find "Menu" element by partial text
        WebElement menuElement = driver.findElement(By.partialLinkText("Menu Element"));
        menuElement.click();

        //Print how many of the menu elements appear
        List<WebElement> menuElements = driver.findElements(By.tagName("li"));
        //WebElement menuElements = driver.findElements(By.tagName("li"));
        System.out.println(menuElements.size() + " menu elements");

        //Quit session
        driver.quit();
    }
    public static void main(String args[]){
        ShiftingContent test = new ShiftingContent();
        test.setUp();
    }
}
