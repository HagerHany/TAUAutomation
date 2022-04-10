package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MultipleWindowPage {
    private WebDriver driver;
    private By Link= By.linkText("Click Here");
    public MultipleWindowPage(WebDriver driver){
        this.driver=driver;
    }
    public void cliskHere(){
        driver.findElement(Link).click();
    }
}
