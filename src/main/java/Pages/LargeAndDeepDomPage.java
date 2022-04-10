package Pages;

import org.openqa.selenium.*;

public class LargeAndDeepDomPage {
   private WebDriver driver;
   private By tableID= By.id("large-table");
   public LargeAndDeepDomPage(WebDriver driver){
       this.driver=driver;
   }
   public void scrollToTable(){
       WebElement table=driver.findElement(tableID);
       String script="arguments[0].scrollIntoView();";
       ((JavascriptExecutor)driver).executeScript(script,table);
   }

}
