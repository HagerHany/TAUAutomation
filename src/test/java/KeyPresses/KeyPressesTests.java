package KeyPresses;

import Base.BaseTests;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class KeyPressesTests extends BaseTests {
    @Test
   public void testBackSpace(){
        var keypressespage=homePage.click_on_KeyPresses_link();
        keypressespage.setInput("H"+ Keys.BACK_SPACE);
        assertTrue(keypressespage.getResult().contains("BACK_SPACE"),"not correct") ;
        assertEquals(keypressespage.getResult(),"You entered: BACK_SPACE","not correct");
    }
    @Test
    public void testPI(){
        var keypressespage=homePage.click_on_KeyPresses_link();
        keypressespage.setInputPI();
        assertEquals(keypressespage.getResult(),"You entered: 4","not correct");

    }
}
