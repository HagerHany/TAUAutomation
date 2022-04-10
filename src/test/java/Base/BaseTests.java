package Base;

import Pages.HomePage;
import Utils.EventReporter;
import Utils.windowManager;
import com.google.common.io.Files;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.io.IOException;

public class BaseTests {
    //create a web driver object
    private EventFiringWebDriver driver;
    protected HomePage homePage;
    @BeforeClass
    public void SetUp(){
        //where is the executable file that we have downloaded
         System.setProperty("webdriver.chrome.driver","E:\\Hager\\ITI\\testAutomationUnveristySeleiunm\\.idea\\resources\\chromedriver.exe");
        //initizate the driver
        driver=new EventFiringWebDriver(new ChromeDriver(getChromeOptions()));
        driver.register(new EventReporter());

                   //implicit wait
        //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
                  //wait for the whole page to load
        // driver.manage().timeouts().pageLoadTimeout(50,TimeUnit.SECONDS);
        goHome();
        setCookie();
        homePage=new HomePage(driver);


        /**different ways to full screen of the window**/
         //driver.manage().window().maximize();
        // driver.manage().window().fullscreen();


        /**resizing the window**/
        // driver.manage().window().setSize(new Dimension(375,812));


       /**LOCATING AN ELEMENT **/
          //findelement will return the very frist element it found matches my query in the DOM
        // WebElement Inputs= driver.findElement(By.linkText("Inputs"));

      /*  // Inputs.click();
        WebElement shifting_content= driver.findElement(By.linkText("Shifting Content"));
        shifting_content.click();
        WebElement Menu_Element= driver.findElement(By.linkText("Example 1: Menu Element"));
        Menu_Element.click();
        List<WebElement> Lists= driver.findElements(By.tagName("li"));
        System.out.println(Lists.size());
        */




       /*Find and count all the elments that are links <a></a>
        FINDELEMENTS WILL RETURN LIST OF OBJECTS THAT MATCHES THE QUERY IN THE DOM*/
       /* List<WebElement> Links= driver.findElements(By.tagName("a"));
        System.out.println(Links.size());
*/


        //System.out.println(driver.getTitle());
        //close the window
        //driver.quit();
    }

    @BeforeMethod
    public void goHome(){
        driver.get("https://the-internet.herokuapp.com/");
    }

    @AfterMethod
    public void recordFailure(ITestResult result){
        if(ITestResult.FAILURE==result.getStatus()){
        var camera = (TakesScreenshot)driver;
        File ScreenShot=camera.getScreenshotAs(OutputType.FILE);
        try {
            Files.move(ScreenShot,new File("E:\\Hager\\ITI\\testAutomationUnveristySeleiunm\\.idea\\resources\\ScreenShots\\"+result.getName()+".png"));
        } catch (IOException e) {
            e.printStackTrace();

    }
        }
    }

   /* @AfterClass
    public void tearDown(){
        driver.quit();

    }*/
    /*
    public static void main(String args[]){
        BaseTests tests = new BaseTests();
        tests.SetUp();
    }*/
    public windowManager getWindowManger(){
        return new windowManager(driver);
    }
    private ChromeOptions getChromeOptions(){
        ChromeOptions options=new ChromeOptions();
        options.addArguments("disable-infobars");
       //options.setHeadless(true);
        return options;
    }

    private void setCookie(){
        Cookie cookie = new Cookie.Builder("tau","123")
                .domain("the-internet.herokuapp.com")
                .build();
        driver.manage().addCookie(cookie);
    }

}


