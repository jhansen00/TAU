package ABTesting;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.ABTestingPage;

import static org.testng.Assert.assertTrue;

public class abTestingTests extends BaseTest {

    @Test
    public void testABTestingLink(){
        ABTestingPage abtestingpage = homepage.clickABTesting();
        assertTrue(abtestingpage.getABTestingTitle().contains("A/B Test Variation 1"), "Failed to find A/B Test Variation 1");
    }
}
