package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DynamicLoadingExampleTwoPage {
    private WebDriver driver;
    public DynamicLoadingExampleTwoPage(WebDriver driver){
        this.driver=driver;
    }
    private By button= By.cssSelector("#start button");
    private By loadingBarID=By.id("loading");
    private By textID=By.id("finish");
    public void clickOnButton() {
        driver.findElement(button).click();
        //EXPLICIT WAIT
      /*  WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.presenceOfElementLocated(textID));*/

    }
    public String getText(){
        return driver.findElement(textID).getText();
    }

}
