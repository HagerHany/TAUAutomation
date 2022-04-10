package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FileUploadPage {
    WebDriver driver;
    private By file= By.id("file-upload");
    private By uploadButtonId=By.id("file-submit");
    private By confirmationBox=By.id("uploaded-files");
    FileUploadPage(WebDriver driver){
        this.driver=driver;
    }
    public void uploadFile(String fileAbsulotePath)
    {
        driver.findElement(file).sendKeys(fileAbsulotePath);
        clickUploadButton();
    }

    public void clickUploadButton(){
        driver.findElement(uploadButtonId).click();
    }

    public String getFileNmeConformition(){
        return  driver.findElement(confirmationBox).getText();
    }

}
