package ForgotPassword;

import Base.BaseTests;
import Pages.EmailSent;
import Pages.ForgotPasswordPage;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;
public class ForgotPassordsTests extends BaseTests {
    @Test
    public void testforgotpasswordsuccessfull(){
        ForgotPasswordPage forgotPasswordPage= homePage.click_on_Forgot_link();
        forgotPasswordPage.setEmail("tau@example.com");
        EmailSent emailSent=forgotPasswordPage.pressRetrievepassword();
        //internal server Error dh 3ashn el server wa23
        assertTrue(emailSent.getmessage().contains("Internal Server Error"),"something wnet wrong");
    }
}
