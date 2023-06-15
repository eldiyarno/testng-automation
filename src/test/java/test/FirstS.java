package test;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import pages.CashWiseHomePage;
import utilities.Config;
import utilities.Driver;

public class FirstS {

    @Test
    public void testi (){
        Faker faker = new Faker();
        String testD = faker.lorem().word();
        Driver.getDriver().get(Config.getValue("someUrl"));
        Driver.getDriver().findElement(By.name("q")).sendKeys(testD + Keys.ENTER);
        String title = Driver.getDriver().getTitle();


    }


}
