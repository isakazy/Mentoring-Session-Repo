package tests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.guru99;
import pages.logInPage;
import utilities.Config;
import utilities.Driver;


public class InitTest {
    logInPage logInPage = new logInPage();

    Actions actions = new Actions(Driver.getDriver());
    guru99 guru99 = new guru99();




    @Test
    public void test(){
        Driver.getDriver().get(Config.getValue("sauceDemo"));

        logInPage.userNameInputField.sendKeys(Config.getValue("sauceUser"));
        logInPage.passwordInputField.sendKeys(Config.getValue("saucePassword"));
        logInPage.loginButton.click();



    }

    @Test
    public void TestGuru(){
        Driver.getDriver().get(Config.getValue("guruTest"));
for(WebElement i : guru99.list){
    Assert.assertTrue(i.isDisplayed());
}

    }

    @Test
    public void HoverGuru(){
        Driver.getDriver().get(Config.getValue("guruTest"));

        for(WebElement i : guru99.list){
            actions.moveToElement(i).perform();

        }
    }

    @Test
    public void GuruDropDown(){
        Driver.getDriver().get(Config.getValue("guruTest"));
        guru99.seleniumDropDown.click();
        Assert.assertTrue(guru99.seleniumDropDownOpen.isDisplayed());

    }

@Test
    public void testAlert(){

        Driver.getDriver().get(Config.getValue("guruTest"));
        guru99.NewCostumerButton.click();
        guru99.submitAlert.click();
        Alert alert = Driver.getDriver().switchTo().alert();
        Assert.assertEquals(alert.getText(), Config.getValue("expectedAlert"));
    }



    @Test
    public void testField() {
        Driver.getDriver().get("https://demo.guru99.com/V1/html/addcustomerpage.php");
        guru99.NewCostumerButton.click();
        guru99.nameInputField.sendKeys("whatever");
        guru99.nameInputField.clear();
        Assert.assertEquals(guru99.massage.getText(), Config.getValue("expectedMassage"));

    }


//   @After
//    public void CleanUp(){
//        Driver.quit();
//   }


}
