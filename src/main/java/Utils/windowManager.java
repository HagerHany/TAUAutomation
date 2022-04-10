package Utils;

import org.openqa.selenium.WebDriver;

public class windowManager {
    private WebDriver driver;
    private WebDriver.Navigation navigate;
    public windowManager(WebDriver driver){
        this.driver=driver;
        navigate=driver.navigate();
    }
    public void goBack(){
        navigate.back();
    }
    public void goForward(){
        navigate.forward();
    }
    public void refresh(){
        navigate.refresh();
    }

    public void goTo(String URL) {
    navigate.to(URL);
    }

    public void switchTabs(String tabTitle){
       var windows= driver.getWindowHandles();
       System.out.println("Number of windows "+windows.size());
       System.out.println("windows handles");
       windows.forEach(System.out::println);
       for(String window:windows)
       {
           System.out.println("Switching to window"+window);
           driver.switchTo().window(window);
           System.out.println("The current title Of Tab: "+driver.getTitle());
           if(tabTitle.equals(driver.getTitle()))
               break;
       }
    }
}
