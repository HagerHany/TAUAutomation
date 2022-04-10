package Alerts;

import Base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class UploadFileTests extends BaseTests {
    @Test
    public void testUplaodFile(){
        var fileUploadPage =homePage.click_on_FileUpload_link();
        fileUploadPage.uploadFile("E:\\Hager\\ITI\\testAutomationUnveristySeleiunm\\.idea\\resources\\chromedriver.exe");
         assertEquals(fileUploadPage.getFileNmeConformition(),"chromedriver.exe","Not the same File");
    }
}
