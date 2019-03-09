package TestBase;

import HomePage.HomePage;
import Testbase.ScriptBase;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.logging.Logger;

public class CatalogTest extends ScriptBase {
    public static final Logger log = Logger.getLogger(CatalogTest.class.getName());
    HomePage HomePage;

    @BeforeTest
    public void init() {
        beforetest();
    }

    @Test (priority = 1)
    public void VerifyCatalogDressSelectable() throws InterruptedException {
        log.info("###VerifyCatalogDressSelectable Test Start####");
        HomePage = new HomePage(driver);
       HomePage.HomepageCatalog(driver, "Dresses", "Casual Dresses");
        log.info("###VerifyCatalogDressSelectable Test Finish####");
    }
    @Test(priority = 2)
    public void VerifyCatalogWomenSelectable() throws InterruptedException {
        log.info("###VerifyCatalogWomenSelectable Test Start####");
        HomePage = new HomePage(driver);
        HomePage.CategoryWomen(driver, "women", "tshirts");
        log.info("###VerifyCatalogWomenSelectable Test Finish####");

    //@AfterTest
   // public void jobClose() {

        //driver.close();
    //}
}}