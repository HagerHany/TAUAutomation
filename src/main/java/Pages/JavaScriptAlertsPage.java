package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class JavaScriptAlertsPage {
    private WebDriver driver;
    private By jsAlertButton= By.xpath("//button[text()='Click for JS Alert']");
    private By jsConfrimButton= By.xpath("//button[text()='Click for JS Confirm']");
    private By jsPromptButton=By.xpath("//button[text()='Click for JS Prompt']");
    private By result=By.id("result");
    JavaScriptAlertsPage(WebDriver driver){
        this.driver=driver;
    }
    public void clickJSAlertButton(){
        driver.findElement(jsAlertButton).click();
    }

    public void clickJSConfrimButton(){
        driver.findElement(jsConfrimButton).click();
    }
    public void clickJSPromptButton(){
        driver.findElement(jsPromptButton).click();
    }

    public void clickToAcceptAlert(){
        driver.switchTo().alert().accept();
    }

    public void clickToCancelAlert(){
        driver.switchTo().alert().dismiss();
    }

    public String getAlertText(){
       return driver.switchTo().alert().getText();
    }

    public String getResult(){
       return driver.findElement(result).getText();
    }

    public void setAlertPromptInput(String input){
         driver.switchTo().alert().sendKeys(input);
    }




}
