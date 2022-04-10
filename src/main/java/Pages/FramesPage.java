package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FramesPage {
    private WebDriver driver;
    private By link= By.linkText("Nested Frames");
    private String topFrame="frame-top";
    private String leftFrame="frame-left";
    private String bottomFrame="frame-bottom";
    private By body=By.tagName("body");




    public  FramesPage(WebDriver driver){
        this.driver=driver;
    }
    public void clickOnLink(){
        driver.findElement(link).click();
    }
    private void switchtoframe(String frame){
        driver.switchTo().frame(frame);
    }
   private void switchtomain(){
        driver.switchTo().parentFrame();
   }

   public String getLeftFrameText(){
        switchtoframe(topFrame);
        switchtoframe(leftFrame);
       // driver.switchTo().frame(leftFrame);
        String str = driver.findElement(body).getText();
        switchtomain();
        switchtomain();
        return  str;
   }

    public String getBottomFrameText(){
        switchtoframe(bottomFrame);
        // driver.switchTo().frame(leftFrame);
        String str = driver.findElement(body).getText();
        switchtomain();
        return  str;
    }
}
