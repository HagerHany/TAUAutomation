package DynamicLoading;

import Base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class DynamicLoadingPage extends BaseTests {
    @Test
    public void testWaitUntillHidden(){
       var example1page =homePage.click_on_DynamicLoading_link().clickOnExample1();
       example1page.clickOnButton();
       assertEquals(example1page.getText(),"Hello World!","WRONG TEXT");
    }

    @Test
    public void testWaitUntillAppear(){
        var example2page =homePage.click_on_DynamicLoading_link().clickOnExample2();
        example2page.clickOnButton();
        assertEquals(example2page.getText(),"Hello World!","WRONG TEXT");
    }
}
