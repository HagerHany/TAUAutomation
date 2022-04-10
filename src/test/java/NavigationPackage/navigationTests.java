package NavigationPackage;

import Base.BaseTests;
import org.testng.annotations.Test;

import java.util.Base64;

public class navigationTests  extends BaseTests {
    @Test
    public void testNavigator(){
        homePage.click_on_DynamicLoading_link().clickOnExample1();
        getWindowManger().goBack();
        getWindowManger().refresh();
        getWindowManger().goForward();
        getWindowManger().goTo("https://www.google.com/");


    }

    /*multipleWindow***/
    @Test
    public void testMultipleWindow(){
        homePage.click_on_MultipleWindow_link().cliskHere();
        getWindowManger().switchTabs("New Window");

    }
  /***sabka bas sa7 bs sabka ma3fna ya3ny*****/
    /*
    @Test
    public void testNavigator2(){
        var mangae=homePage.click_on_DynamicLoading_link().openExampleTwoInNewTab();
        mangae.switchTabs("The Internet");


    }*/
}
