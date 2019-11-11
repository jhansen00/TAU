package redirectLink;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.RedirectLinkPage;
import pages.StatusCodePage;

import static org.testng.Assert.assertTrue;

public class RedirectLinkTest extends BaseTest {

    @Test
    public void testRedirectionLink(){
        RedirectLinkPage redirectLinkPage = homepage.clickRedirectLink();
        assertTrue(redirectLinkPage.getRedirectionPageName().contains("Redirection"), "Page name is incorrect.");
        StatusCodePage statusCodePage = redirectLinkPage.clickRedirectTriggerLink();
        assertTrue(statusCodePage.getStatusCodePageName().contains("Status Codes"), "Page name is incorrect.");
    }

}
