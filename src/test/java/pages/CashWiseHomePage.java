package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class CashWiseHomePage {
    public CashWiseHomePage (){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//div/button[@class = 'MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButtonBase-root css-1o6c4rv']")
    public WebElement signInButton;

    @FindBy(xpath = "//div/button[@class = 'MuiButton-root MuiButton-outlined MuiButton-outlinedPrimary MuiButton-sizeMedium MuiButton-outlinedSizeMedium MuiButtonBase-root css-1jmsc0p']")
    public WebElement signUpButton;

    @FindBy(name = "name")
    public WebElement contactUsNameInput;
    @FindBy(name = "phone")
    public WebElement contactUsPhoneInput;
    @FindBy(name = "email")
    public WebElement contactUsEmailInput;
    @FindBy(xpath = "//button[@class = 'MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-fullWidth MuiButtonBase-root css-1nzhnk']")
    public WebElement contactUsSendButton;

    @FindBy(xpath = "//div[@type = 'MINI']//h2")
    public WebElement contactSubmittedPopUp;

    @FindBy(xpath = "//div[@class = 'App']/div[1]/div[1]/div[2]/div")
    public WebElement languageOptionsBtn;

    @FindBy(xpath = "//ul/li")
    public List<WebElement> listOfLanguage;


}
