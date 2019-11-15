package AddRemoveElement;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AddRemoveElementPage;

public class addRemoveElementTests extends BaseTest {

    @Test
    public void testAddElementRemoveElement(){
        AddRemoveElementPage addRemoveElement = homepage.clickAddRemoveElement();
        addRemoveElement.getAddRemoveElementPageContent();
        Assert.assertTrue(addRemoveElement.getAddRemoveElementPageContent().contains("Add/Remove Elements"), "Failed to find Add/Remove Element page title");

        addRemoveElement.clickAddElementButton();
        Assert.assertTrue(addRemoveElement.getDeleteButtonArea().contains("Delete"), "Element not found");

        addRemoveElement.clickDeleteButton();
        Assert.assertTrue(addRemoveElement.getDeleteButtonArea().isEmpty());

    }
}
