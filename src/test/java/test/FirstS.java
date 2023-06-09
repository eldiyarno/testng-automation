package test;

import com.github.javafaker.Faker;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
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
        Assert.assertTrue(title.contains(testD));
    }
}
