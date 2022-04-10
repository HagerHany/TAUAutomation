package Login;

import Base.BaseTests;
import Pages.LoginPage;
import Pages.SecureAreaPage;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class LoginTests extends BaseTests {
    @Test
  public void testSuccessfullLogin(){
      LoginPage loginPage=homePage.click_on_FormAuthentication_link();
      loginPage.SetUsername("tomsmith");
      loginPage.SetPassword("SuperSecretPassword!");
      SecureAreaPage secureAreaPage=loginPage.PressloginButton();
      //matnsesh el x el f el a5r ya a5ty :)
     /* assertEquals(secureAreaPage.getAlertText(),"You logged into a secure area!\n" +
              "×","The data you entered is not correct");*/
        //another_way
        assertTrue(secureAreaPage.getAlertText().contains("You logged into a secure area!"),"The data you entered is not correct");


  }
}
