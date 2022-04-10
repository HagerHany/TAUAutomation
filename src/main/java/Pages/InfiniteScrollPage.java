package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class InfiniteScrollPage {
     private WebDriver driver;
     private By textArea= By.className("jscroll-added");
     public InfiniteScrollPage(WebDriver driver){this.driver=driver;}
     /**
      * scroll till the paragraph with the specified index is found in the view
      * @param index is 1-based
      */
     public void scrollToParagraph(int index){
          var javaExecutor =(JavascriptExecutor)driver;
          //scroll to (x-axis,y-axis) to scroll vertically and horizontal
          String script="window.scrollTo(0,document.body.scrollHeight);";
          while (getPragraphNumber()<index){
               javaExecutor.executeScript(script);

          }
     }

     private int getPragraphNumber(){
         return driver.findElements(textArea).size();
     }
}
