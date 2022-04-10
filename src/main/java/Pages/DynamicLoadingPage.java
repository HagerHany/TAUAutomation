package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class DynamicLoadingPage {
    private WebDriver driver;
    private By example1= By.linkText("Example 1: Element on page that is hidden");
    private By example2= By.linkText("Example 2: Element rendered after the fact");

    public DynamicLoadingPage(WebDriver driver){
        this.driver=driver;
    }

    public DynamicLoadingExampleOnePage clickOnExample1(){
        driver.findElement(example1).click();
        return new DynamicLoadingExampleOnePage (driver);
    }
    public DynamicLoadingExampleTwoPage clickOnExample2(){
        driver.findElement(example2).click();
        return new DynamicLoadingExampleTwoPage (driver);
    }

    /***sabka bas sa7 bs sabka ma3fna ya3ny*****/
/*
    public windowManager openExampleTwoInNewTab(){
        Actions action=new Actions(driver);
        action.keyDown(Keys.CONTROL).build().perform();
        driver.findElement(example2).click();
        action.keyUp(Keys.CONTROL).build().perform();
        return new windowManager (driver);

    }

*/


}
