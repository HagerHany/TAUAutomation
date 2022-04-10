package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgotPasswordPage {
    private WebDriver driver;
    private By emailID= By.id("email");
    private By buttonID= By.id("form_submit");

    public ForgotPasswordPage(WebDriver driver){
        this.driver=driver;
    }
    public void setEmail(String email){
        driver.findElement(emailID).sendKeys(email);
    }
    public EmailSent pressRetrievepassword(){
        driver.findElement(buttonID).click();
        return new EmailSent(driver);
    }


}
