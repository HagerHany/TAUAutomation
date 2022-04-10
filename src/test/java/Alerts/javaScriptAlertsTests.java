package Alerts;

import Base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class javaScriptAlertsTests extends BaseTests {

    @Test
    public void testJSAcceptAlerts(){
       var jsAlertpage= homePage.click_on_JavaScriptAlerts_link();
       jsAlertpage.clickJSAlertButton();
       jsAlertpage.clickToAcceptAlert();
        assertEquals(jsAlertpage.getResult(),"You successfully clicked an alert","result is not correct");
    }
    @Test
    public void testGetTextFromAlerts(){
        var jsAlertpage= homePage.click_on_JavaScriptAlerts_link();
        jsAlertpage.clickJSConfrimButton();
        String str=jsAlertpage.getAlertText();
        jsAlertpage.clickToCancelAlert();
        assertEquals( str,"I am a JS Confirm","alert text is wrong");

    }

    @Test
    public void testSetInputForAlerts(){
        var jsAlertpage= homePage.click_on_JavaScriptAlerts_link();
        jsAlertpage.clickJSPromptButton();
        String str="TAU ROCKS";
        jsAlertpage.setAlertPromptInput(str);
        jsAlertpage.clickToAcceptAlert();
        assertEquals( jsAlertpage.getResult(),"You entered: "+str,"SETTING INPUT FAILLEDDD");
        assertTrue( jsAlertpage.getResult().contains("TAU ROCKS"),"Setting alert text is incorrect");
    }
}
