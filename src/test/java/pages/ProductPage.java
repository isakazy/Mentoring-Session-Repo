package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ProductPage {


    public ProductPage(){
        PageFactory.initElements(Driver.getDriver(), this );
    }

    @FindBy(xpath = " //button[@id='add-to-cart-sauce-labs-fleece-jacket']")
    public WebElement jacket;

}
