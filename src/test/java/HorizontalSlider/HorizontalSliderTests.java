package HorizontalSlider;

import Base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class HorizontalSliderTests extends BaseTests {
    @Test
    public void testSetSlider4(){
        var horizontalsliderpage= homePage.click_on_HorizontalSlider_link();
        horizontalsliderpage.setSlider(4);
        assertEquals(horizontalsliderpage.getRange(),"2","not4");
    }
}
