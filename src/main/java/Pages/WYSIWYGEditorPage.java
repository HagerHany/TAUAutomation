package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WYSIWYGEditorPage {
    private WebDriver driver;
    private String frameId="mce_0_ifr";
    private By textArea= By.id("tinymce");
    private By increaseIndentButton=By.xpath("//button[@title='Increase indent']");
    public WYSIWYGEditorPage (WebDriver driver){
        this.driver=driver;
    }
    //function to swtich into the frame
    private void switchToFrame(){
        driver.switchTo().frame(frameId);
    }

    //function to switch to the main page
    private void switchToMain(){
        driver.switchTo().parentFrame();
    }

    //function to clear textarea
    public void clearTextArea(){
        switchToFrame();
        driver.findElement(textArea).clear();
        switchToMain();
    }

    //function to set textarea
    public void setTextArea(String text){
        switchToFrame();
        driver.findElement(textArea).sendKeys(text);
        //switchToMain();
    }
    //function to set textarea
    public String getTextArea( ){
        switchToFrame();
         String str= driver.findElement(textArea).getText();
        switchToMain();
        return str;
    }

   //function to click Increase indent button
    public void pressIncreaseIndentButton(){
        driver.findElement(increaseIndentButton).click();
    }


}
