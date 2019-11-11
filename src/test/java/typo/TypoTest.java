package typo;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.TyposPage;

import static org.testng.Assert.assertTrue;

public class TypoTest extends BaseTest {

    @Test
    public void testPageTypos(){
        TyposPage typoPage = homepage.clickTyposLink();
        assertTrue(typoPage.getTypoMessaging().contains("Typos"), "Page name is incorrect.");
        assertTrue(typoPage.getTypoMessaging().contains("Sometimes you'll see a typo, other times you won't."), "Messaging contains a typo.");
    }
}
