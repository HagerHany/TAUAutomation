package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HoversPage {
    private WebDriver driver;
    private By FigureLocator= By.className("figure");
    private By boxcaption=By.className("figcaption");
     HoversPage(WebDriver driver)
     {
         this.driver=driver;
     }

     /**
      * @param index starts at 1
      */

     public FigureCaption hoverOverFigure(int index){
         WebElement figure=driver.findElements(FigureLocator).get(index-1);
         Actions actions=new Actions(driver);
         actions.moveToElement(figure).perform();

         return new FigureCaption(figure.findElement(boxcaption));

     }

     public class FigureCaption{
         private WebElement caption;
         private By header=By.tagName("h5");
         private By link=By.linkText("View profile");
         FigureCaption(WebElement caption){this.caption=caption;}

         public boolean isCaptionDisplayed(){
             return caption.isDisplayed();
         }
         public String getTitle(){
             return caption.findElement(header).getText();
         }

         public String getlink(){
             return caption.findElement(link).getAttribute("href");
         }
         public String getlinkText(){
             return caption.findElement(link).getText();
         }

     }
}
