package studymate;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.StudyMateGroupsPage;
import pages.StudyMateLoginPage;
import utilities.AppFlow;
import utilities.Config;
import utilities.Driver;

public class StudyMateLogin {
    @BeforeMethod
    public void setup(){
        Driver.getDriver().get(Config.getValue("studymateUrl"));
    }
    @AfterMethod
    public void cleanUp(){
       Driver.quit();
    }
    @Test
    public void login(){
        StudyMateLoginPage studyMateLoginPage = new StudyMateLoginPage();
        studyMateLoginPage.emailInput.sendKeys(Config.getValue("loginStudymate"));
        studyMateLoginPage.passwordInput.sendKeys(Config.getValue("passwordStudymate"));
        studyMateLoginPage.loginBtn.click();
        String expectedURl = "https://codewise.studymate.us/admin/analytics";
        AppFlow.pause(2000);
        Assert.assertEquals(Driver.getDriver().getCurrentUrl(), expectedURl);
    }
    @Test
    public void createG() {
        Faker faker = new Faker();
        StudyMateLoginPage studyMateLoginPage = new StudyMateLoginPage();
        studyMateLoginPage.emailInput.sendKeys(Config.getValue("loginStudymate"));
        studyMateLoginPage.passwordInput.sendKeys(Config.getValue("passwordStudymate"));
        studyMateLoginPage.loginBtn.click();
        StudyMateGroupsPage studyMateGroupsPage = new StudyMateGroupsPage();
        studyMateGroupsPage.groupsLink.click();
        studyMateGroupsPage.createAGroup.click();
        String groupName = "Batch" + System.currentTimeMillis();
        studyMateGroupsPage.groupNameInpt.sendKeys(groupName);
        AppFlow.pause(1000);
        studyMateGroupsPage.groupDateInpt.click();
        studyMateGroupsPage.groupDateInpt.sendKeys("05/14/2023");
        studyMateGroupsPage.content.click();
       studyMateGroupsPage.descriptInpt.sendKeys(faker.lebowski().quote());
        studyMateGroupsPage.creatBtn.click();
        String xpath = "//div[.='" + groupName + "']";
        WebElement createdGroup = Driver.getDriver().findElement(By.xpath(xpath));
        Assert.assertTrue(createdGroup.isDisplayed());
        AppFlow.pause(2000);
    }
    }

