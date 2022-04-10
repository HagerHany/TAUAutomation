package JavaScript;

import Base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class JavaScriptTests extends BaseTests {
    @Test
    /**LargeAndDeepDomPage**/
    public void testScrollToTable(){
       homePage.click_on_LargeAndDeepDom_link().scrollToTable();

    }
    @Test
    /**InfiniteScrollPage**/
    public void testScrollToFifthParagraph(){
        homePage.click_on_InfiniteScroll_link().scrollToParagraph(5);
    }

    /**DropDownPage**/
    @Test
    public void testDropdwonMultiple(){
        var dropDownPage= homePage.click_on_Dropdown_link();
        String option="Option 1";
        String option2="Option 2";
        dropDownPage.changeDropDownIntoMultiple();
        dropDownPage.setDropdown(option);
        dropDownPage.setDropdown(option2);
        var selected_options=dropDownPage.getDropdownOption();

        assertEquals(selected_options.size(),2,"# of selected options is wrong");
        assertTrue(selected_options.contains(option),"selected opption is wrong");
        assertTrue(selected_options.contains(option2),"selected opption is wrong");


    }
}
