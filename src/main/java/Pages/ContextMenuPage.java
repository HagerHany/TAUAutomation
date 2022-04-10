package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextMenuPage {
    private WebDriver driver;
    private By dashedBox= By.id("hot-spot");
    ContextMenuPage(WebDriver driver){
        this.driver=driver;
    }

    public void clickOnDashedBox(){
        Actions actions=new Actions(driver);
        actions.contextClick(driver.findElement(dashedBox)).perform();
    }

    public String GetAlertString(){
         return driver.switchTo().alert().getText();
    }

    public void acceptAlert(){
        driver.switchTo().alert().accept();
    }
}
