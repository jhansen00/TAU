package forgetPassword;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.EmailSentPage;
import pages.ForgotPasswordPage;

import static org.testng.Assert.assertTrue;

public class ForgetPasswordTests extends BaseTest {

    @Test
    public void testForgetPasswordEmail(){
        ForgotPasswordPage forgetPasswordPage = homepage.clickForgotPassword();
        forgetPasswordPage.setEmailAddress("test@test.com");
        EmailSentPage emailSentPage = forgetPasswordPage.clickRetrievePasswordButton();
        assertTrue (emailSentPage.getSentMessage().contains("Your e-mail's been sent!"));
    }
}
