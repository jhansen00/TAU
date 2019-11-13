package contextMenu;

import base.BaseTest;
//import javafx.scene.control.Alert;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ContextMenuPage;
import org.openqa.selenium.Alert;

public class contextMenuTests extends BaseTest {
    @Test
    public void testContextMenuPage() {
        //Navigate to the Context Menu Page and assign it to a local variable
        ContextMenuPage contextMenuPage = homepage.clickContextMenu();
        //Get the Context Menu Page text
        contextMenuPage.getContextMenu();
        //Validate if the Context Menu page has the expected text
        Assert.assertTrue(contextMenuPage.getContextMenu().contains("Context Menu"), "Failed to find Context text");

        //Right Click on hotspot
        contextMenuPage.clickHotSpot();
        //Switch to the Javascript Alert
        Alert alert = driver.switchTo().alert();
        //Get the text of the Javascript Alert
        alert.getText();
        //Validate that the alert contains the expected text
        Assert.assertTrue(alert.getText().contains("You selected a context menu"), "Failed to find context menu");
        //Select OK to close the alert
        alert.accept();
        //validate the alert is no longer present
        Assert.assertTrue(contextMenuPage.getContextMenu().contains("Context Menu"), "Failed to find Context text");
    }
}
