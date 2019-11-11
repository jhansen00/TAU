package dropdown;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.DropdownPage;

import java.util.List;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class DropdownTest extends BaseTest {

    @Test
    public void testSelectOption(){
        DropdownPage dropdownpage = homepage.clickDropdown();

        String option = "Option 1";
        dropdownpage.selectFromDropdown(option);
        List<String> selectedOptions = dropdownpage.getSelectedOptions();
        assertEquals (selectedOptions.size(), 1, "Incorrect number of selections.");
        assertTrue(selectedOptions.contains(option), "Option not selected.");
    }
}
