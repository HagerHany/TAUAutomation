package Hovers;

import Base.BaseTests;
import Pages.HoversPage;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class HoversTests extends BaseTests {
    @Test
    public void testHoverUser1(){
    HoversPage hoversPage = homePage.click_on_Hovers_link();
    int index=1;
    HoversPage.FigureCaption figureCaption = hoversPage.hoverOverFigure(index);
    assertTrue(figureCaption.isCaptionDisplayed(),"Caption is not displayed");
    assertEquals(figureCaption.getTitle(),"name: user1","Title is wrong");
    assertEquals(figureCaption.getlinkText(),"View profile","linktext is wrong");
    assertTrue(figureCaption.getlink().endsWith("/users/1"),"wrong caption link");
    }
}
