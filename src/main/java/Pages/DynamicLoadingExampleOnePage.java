package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DynamicLoadingExampleOnePage {
    private WebDriver driver;
    private By button= By.cssSelector("#start button");
    private By loadingBarID=By.id("loading");
    private By textID=By.id("finish");


    public DynamicLoadingExampleOnePage (WebDriver driver){
        this.driver=driver;
    }
    public void clickOnButton(){
        driver.findElement(button).click();
        //EXPLICIT WAIT
       /* WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.invisibilityOf(driver.findElement(loadingBarID)));
       */
        //FLUENT WAIT
        FluentWait wait=new FluentWait(driver)
                .withTimeout(Duration.ofSeconds(5))
                .pollingEvery(Duration.ofSeconds(1))
                .ignoring(NoSuchElementException.class);

        wait.until(ExpectedConditions.invisibilityOf(driver.findElement(loadingBarID)));

    }
    public String getText(){
         return driver.findElement(textID).getText();
    }
}
