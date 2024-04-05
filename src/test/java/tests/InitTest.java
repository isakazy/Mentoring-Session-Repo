package tests;

import org.junit.Test;
import pages.SauceDemo;
import utilities.Config;
import utilities.Driver;

public class InitTest {

    SauceDemo sauceDemo = new SauceDemo();
    @Test
    public void test(){
        Driver.getDriver().get(Config.getValue("sauceDemo"));
        sauceDemo.userNameInputField.sendKeys(Config.getValue("sauceUser"));
        sauceDemo.passwordInputField.sendKeys(Config.getValue("saucePassword"));
        sauceDemo.loginButton.click();
    }
}
