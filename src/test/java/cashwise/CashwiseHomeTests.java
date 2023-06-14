package cashwise;

import com.github.javafaker.Faker;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.CashWiseHomePage;
import utilities.AppFlow;
import utilities.Config;
import utilities.Driver;

public class CashwiseHomeTests {

    Faker faker =new Faker();

    @BeforeMethod
    public void setup(){
        Driver.getDriver().get(Config.getValue("cashwiseUrl"));
    }

    @Test
    public void checkContact(){
        CashWiseHomePage cashWiseHomePage = new CashWiseHomePage();
        cashWiseHomePage.contactUsNameInput.sendKeys(faker.name().firstName());
        cashWiseHomePage.contactUsPhoneInput.sendKeys(faker.phoneNumber().subscriberNumber(9));
        cashWiseHomePage.contactUsEmailInput.sendKeys(faker.internet().emailAddress());
        cashWiseHomePage.contactUsSendButton.click();
        Assert.assertTrue(cashWiseHomePage.contactSubmittedPopUp.isDisplayed());
    }

    @Test
    public void languageTest(){
        AppFlow.pause(1000);
        CashWiseHomePage cashWiseHomePage = new CashWiseHomePage();

        cashWiseHomePage.languageOptionsBtn.click();
        for (WebElement option: cashWiseHomePage.listOfLanguage){
            System.out.println(option.getText());
        }
        Assert.assertEquals(cashWiseHomePage.listOfLanguage.size(),2);
    }
    @AfterMethod
    public void cleanUp(){
        Driver.quit();
    }
}
