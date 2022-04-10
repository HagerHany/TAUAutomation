package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;
    private By userNameID=By.id("username");
    private By passwordID=By.id("password");
    //private By loginButton=By.tagName("button");
    private By loginButton=By.cssSelector("#login button");
    //constructor
    public LoginPage(WebDriver driver){
        this.driver=driver;
    }

    public void SetUsername(String name){
        driver.findElement(userNameID).sendKeys(name);
    }
    public void SetPassword(String Password){
        driver.findElement(passwordID).sendKeys(Password);
    }

    public SecureAreaPage PressloginButton(){
        driver.findElement(loginButton).click();
        return new SecureAreaPage(driver);
    }
}
