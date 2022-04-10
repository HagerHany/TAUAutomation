package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;
   // private By formAuthenticationLink=By.linkText("Form Authentication");
    public HomePage(WebDriver driver){
        this.driver=driver;
    }
    /*public LoginPage click_on_FormAuthentication_link(){
        driver.findElement(formAuthenticationLink).click();
        return new LoginPage(driver);
    }*/
    //since we have 45 links that are accessed by the same web locator so we have to make one general function
    public void getLinks(String link){
        driver.findElement(By.linkText(link)).click();
    }

    public LoginPage click_on_FormAuthentication_link(){
        getLinks("Form Authentication");
        return new LoginPage(driver);}

    public DropDownPage click_on_Dropdown_link(){
        getLinks("Dropdown");
        return new DropDownPage(driver);}

    public ForgotPasswordPage click_on_Forgot_link(){
        getLinks("Forgot Password");
        return new ForgotPasswordPage(driver);}

    public HoversPage click_on_Hovers_link(){
        getLinks("Hovers");
        return new HoversPage(driver);}

    public KeyPressesPage click_on_KeyPresses_link(){
        getLinks("Key Presses");
        return new KeyPressesPage(driver);
    }

    public HorizontalSliderPage click_on_HorizontalSlider_link(){
        getLinks("Horizontal Slider");
        return new HorizontalSliderPage(driver);
    }

    public JavaScriptAlertsPage click_on_JavaScriptAlerts_link(){
        getLinks("JavaScript Alerts");
        return new JavaScriptAlertsPage(driver);
    }

    public FileUploadPage click_on_FileUpload_link(){
        getLinks("File Upload");
        return new FileUploadPage(driver);
    }
    public ContextMenuPage click_on_ContextMenu_link(){
        getLinks("Context Menu");
        return new ContextMenuPage(driver);
    }

    public WYSIWYGEditorPage click_on_WYSIWYGEditor_link(){
        getLinks("WYSIWYG Editor");
        return new WYSIWYGEditorPage(driver);
    }
    public FramesPage click_on_Frames_link(){
        getLinks("Frames");
        return new FramesPage(driver);
    }
    public DynamicLoadingPage click_on_DynamicLoading_link(){
        getLinks("Dynamic Loading");
        return new DynamicLoadingPage(driver);
    }

    public LargeAndDeepDomPage click_on_LargeAndDeepDom_link(){
        getLinks("Large & Deep DOM");
        return new LargeAndDeepDomPage(driver);
    }

    public InfiniteScrollPage click_on_InfiniteScroll_link(){
        getLinks("Infinite Scroll");
        return new InfiniteScrollPage(driver);
    }
    public MultipleWindowPage click_on_MultipleWindow_link(){
        getLinks("Multiple Windows");
        return new MultipleWindowPage(driver);
    }
}
