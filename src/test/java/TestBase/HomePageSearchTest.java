package TestBase;

import HomePage.HomePage;
import Testbase.ScriptBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HomePageSearchTest extends ScriptBase {
    HomePage homepage;

    @BeforeTest
    public void init() {
        beforetest();

    }

    @Test
    public void searchbutton() {
        log.info("###Search Button Test Start###");
        homepage = new HomePage(driver);
        homepage.HomePageSearchButton();
        Assert.assertTrue(homepage.HomePageSearchButton());
        log.info("###Search Button Test Finish###");
    }

//@AfterTest
//public void jobClose(){
//driver.quit();
}