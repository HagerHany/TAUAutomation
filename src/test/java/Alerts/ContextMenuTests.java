package Alerts;

import Base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ContextMenuTests extends BaseTests {
@Test
public void testDashedBoxClicked(){
 var contextMenupage=   homePage.click_on_ContextMenu_link();
    contextMenupage.clickOnDashedBox();
    String str=contextMenupage.GetAlertString();
    contextMenupage.acceptAlert();
    assertEquals(str,"You selected a context menu","WRONG TEXT");
}
}
