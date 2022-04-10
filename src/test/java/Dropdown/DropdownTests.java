package Dropdown;

import Base.BaseTests;
import Pages.DropDownPage;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class DropdownTests extends BaseTests {
    @Test
    public void testdropdownsuccessfull(){
        //DropDownPage dropDownPage= homePage.click_on_Dropdown_link();
        var dropDownPage= homePage.click_on_Dropdown_link();
        String option="Option 1";
        dropDownPage.setDropdown(option);
        var selected_options=dropDownPage.getDropdownOption();

        assertEquals(selected_options.size(),1,"# of selected options is wrong");
        assertTrue(selected_options.contains(option),"selected opption is wrong");

    }

    /*****java script****/
    /**** transfer into javascript package**/
    /*
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


    }*/
}
