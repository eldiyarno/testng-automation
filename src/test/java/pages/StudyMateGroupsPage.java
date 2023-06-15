package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class StudyMateGroupsPage {
    public StudyMateGroupsPage (){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[. = 'Groups']")
    public WebElement groupsLink;
    @FindBy(xpath= "//button[@class = 'MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium css-79mk38']")
    public WebElement createAGroup;

    @FindBy(name = "name")
    public WebElement groupNameInpt;
    @FindBy(xpath = "//input[@class = 'MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputAdornedEnd css-1uvydh2']")
    public WebElement groupDateInpt;
    @FindBy(xpath = "//textarea")
    public WebElement descriptInpt;

    @FindBy(xpath = "//div/button[@class = 'MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium css-79mk38']")
    public WebElement creatBtn;
    @FindBy(id = "content")
    public WebElement content;


}
