package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class guru99 {
    public guru99(){
        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(xpath = "//ul[@class='menusubnav']/li")
    public List<WebElement> list;

    @FindBy(xpath = "//a[@class='dropdown-toggle']")
    public WebElement seleniumDropDown;


    @FindBy(xpath = "//ul[@class='dropdown-menu']")
    public WebElement seleniumDropDownOpen;


    @FindBy(xpath = "//a[.='New Customer']")
    public WebElement NewCostumerButton;

    @FindBy(xpath = "//input[@value='Submit']")
    public WebElement submitAlert;

    @FindBy(xpath = "//input[@name='name']")
    public WebElement nameInputField;

    @FindBy(xpath = "//label[@id='message']")
    public WebElement massage;


}
