package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class KeyPressesPage {
    private WebDriver driver;
    private By inputID= By.id("target");
    private By resultSection= By.id("result");

    KeyPressesPage(WebDriver driver){
        this.driver=driver;
    }

    public void setInput(String input){
        driver.findElement(inputID).sendKeys(input);
    }
    public String getResult(){
       return driver.findElement(resultSection).getText();
    }

    public void setInputPI(){
        //setInput(Keys.chord(Keys.ALT,"227")+"=3.14");
       setInput("π"+"=3.14");
    }
}
