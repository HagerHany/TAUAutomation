package Frames;

import Base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FramesTests extends BaseTests {
    @Test
    public void testframes(){
      var framepage=  homePage.click_on_Frames_link();
      framepage.clickOnLink();
      String bottom =  framepage.getBottomFrameText();
      String left= framepage.getLeftFrameText();
      assertEquals(bottom,"BOTTOM","Wrong Bottom Text");
      assertEquals(left,"LEFT","Wrong left Text");

    }
}
