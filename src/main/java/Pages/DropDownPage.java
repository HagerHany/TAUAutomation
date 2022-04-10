package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.stream.Collectors;

public class DropDownPage {
    private WebDriver driver;
    private By dropdown= By.id("dropdown");
    public DropDownPage(WebDriver driver){
        this.driver=driver;
    }

    private Select Dropdown(){
        return new Select(driver.findElement(dropdown));
    }

    public void setDropdown(String option){
        Dropdown().selectByVisibleText(option);
    }
    public List<String> getDropdownOption(){
        List<WebElement> options_selected=Dropdown().getAllSelectedOptions();
                                        //map(foreach element in the list get its text )
                                                     // and then collect it into a list of string
        return options_selected.stream().map(e->e.getText()).collect(Collectors.toList());
    }

    /******JAVA SCRIPT****/
    public void changeDropDownIntoMultiple(){
        WebElement dropdwonmenu=driver.findElement(dropdown);
        String script="arguments[0].setAttribute('multiple', '');";
        var jsdriver= (JavascriptExecutor)driver;
        jsdriver.executeScript(script,dropdwonmenu);
    }


}
