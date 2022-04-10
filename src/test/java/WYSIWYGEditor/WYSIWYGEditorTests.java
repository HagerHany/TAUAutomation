package WYSIWYGEditor;

import Base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class WYSIWYGEditorTests extends BaseTests {
 @Test
    public void testWYSIWYGEditor(){
    var editorpage = homePage.click_on_WYSIWYGEditor_link();
    String str1="Hello ";
    String str2="Georgous ;)" ;
    editorpage.clearTextArea();
    editorpage.setTextArea(str1);
    editorpage.pressIncreaseIndentButton();
    editorpage.setTextArea(str2);
    assertEquals(editorpage.getTextArea(),str1+str2,"WRONG MESSAGE") ;
}

}
