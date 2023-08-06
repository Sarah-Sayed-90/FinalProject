package stepDefs;

import Pages.P01_register;
import Pages.P02_login;
import Pages.P03_homePage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;
import Pages.*;

import java.time.Duration;

public class Hooks {
    public static WebDriver driver;
    public static PageBase pageBase;
    public static SoftAssert softAssert;
    public static P01_register registerPage;
    public static P02_login loginPage;
    public static P03_homePage homePage;
    public static P04_searchResults searchPage;
    public static P05_hoverCategories hoverCategoriesPage;
    public static P06_homeSlider slidersPage;
    public static P07_followUs followUsPage;

    public static OpenPage openPage;






    @Before
    public void setUp(){

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        pageBase = new PageBase(driver);
        softAssert = new SoftAssert();
        registerPage = new P01_register(driver);
        loginPage = new P02_login(driver);
        homePage = new P03_homePage(driver);
        searchPage = new P04_searchResults(driver);
        hoverCategoriesPage = new P05_hoverCategories(driver);
        slidersPage = new P06_homeSlider(driver);
        followUsPage = new P07_followUs(driver);
        openPage = new OpenPage(driver);








    }

    @After
    public void tearDown(){

        driver.quit();
    }
}