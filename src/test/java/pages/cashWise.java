package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class cashWise {

  public cashWise(){
      PageFactory.initElements(Driver.getDriver(), this );
  }


  @FindBy(xpath = "//button[.='Log out']")
  public WebElement logOutButton;
  @FindBy(xpath = "//p[.='Log out from smokewise']")
  public WebElement logOutAlert;
  @FindBy(xpath = "//li[.='Log out']")
  public WebElement logOutLink;
  @FindBy(xpath = "(//p)[3]")
  public WebElement logOutDropDown;
  @FindBy(xpath = "//p[.='Please enter a valid email address']")
 public WebElement pleaseEnterCorrectUsernameText;
  @FindBy(xpath = "//p[.='Wrong password or email']")
  public WebElement wrongPassOrEmailText;
  @FindBy(xpath = "//h2[.='smokewise']")
  public WebElement smokeWiseText;
  @FindBy(xpath = "//h3[.='Sign in']")
  public WebElement singInPupUp;
  @FindBy(xpath = "//button[.='Sign in']")
  public WebElement singIn;
  @FindBy(xpath = "(//button[.='Sign up'])[2]" )
    public WebElement singUP;

  @FindBy(xpath = "(//input[@name ='email'])[2]")
    public WebElement emailInput;

  @FindBy(xpath = "(//input[@name ='password'])")
    public WebElement passwordInput;

  @FindBy(xpath = "(//input[@name ='repeat_password'])")
    public WebElement confPass;

  @FindBy(xpath = "//button[.='Continue']")
    public WebElement continueButton;

  @FindBy(xpath =  "//div[@type='AUTH']")
    public WebElement singUpPopUp;

  @FindBy(xpath = "//input[@name='first_name']")
    public WebElement firstName;

  @FindBy(xpath = "//input[@name='last_name']")
    public WebElement lastName;


  @FindBy(xpath = "//input[@name='company_name']")
    public WebElement companyName;

  @FindBy(xpath = "//div[@id='mui-component-select-business_area_id']")
    public WebElement dropDown;

  @FindBy(xpath = "//li[.='IT, Software Development']")
    public WebElement IT;

  @FindBy(xpath = "//input[@name='address']")
    public WebElement address;

  @FindBy(xpath = "//div[@id='mui-component-select-currency']")
    public WebElement currancyDrop;


    @FindBy(xpath = "//div[.='USD ($)']")
    public WebElement USD;

    @FindBy(xpath = "(//button[.='Sign up'])[3]")
    public WebElement singUpLast;


    @FindBy(xpath = "(//p)[3]")
  public WebElement language;

    @FindBy(xpath = "//li[1]")
  public WebElement english;
    @FindBy(xpath = "(//button[.='Sign in'])[2]")
  public  WebElement singInTwo;

    @FindBy(xpath = "//p[.='Wrong password or email']")
    public WebElement WrongPasswordOrEmail;
}

