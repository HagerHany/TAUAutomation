package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class HorizontalSliderPage {
    private WebDriver driver;
    private By slider= By.xpath("//div[@class='sliderContainer']//input[@type='range']");
    private By range=By.id("range");
    HorizontalSliderPage(WebDriver driver){
        this.driver=driver;
    }
    public void setSlider( int index){
        for(int i=0;i<2*index;i++)
        driver.findElement(slider).sendKeys(Keys.ARROW_RIGHT);
    }

    public String getRange(){
        return driver.findElement(range).getText();
    }


}
