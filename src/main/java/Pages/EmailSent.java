package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EmailSent {
    private WebDriver driver;
    private By messageID=By.tagName("h1");

    public EmailSent(WebDriver driver){
        this.driver=driver;
    }
    public String getmessage(){
        return driver.findElement(messageID).getText();

    }
}
