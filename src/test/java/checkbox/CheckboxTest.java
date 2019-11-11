package checkbox;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CheckboxesPage;

public class CheckboxTest extends BaseTest {
    @Test
    public void testCheckingCheckboxes(){
        CheckboxesPage checkboxpage = homepage.clickCheckboxes();
        checkboxpage.clickCheckboxTwo();
        checkboxpage.clickCheckboxTwo();
        checkboxpage.clickCheckboxOne();

        boolean checkboxOne = checkboxpage.isCheckboxOneChecked();
        boolean checkboxTwo = checkboxpage.isCheckboxTwoChecked();

        Assert.assertEquals(checkboxOne, true);
        Assert.assertEquals(checkboxTwo, true);
    }
}
