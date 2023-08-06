package stepDefs;

import Pages.P01_register;
import Pages.P02_login;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import static stepDefs.Hooks.*;

public class D02_loginStepDef {
    @Given("A user registered successfully for this  valid scenario")
    public void AUserRegisteredSuccessfullyForThis_ValidScenario(){
        driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");

        P01_register.chooseGender("female");
        P01_register.personalData("Sarah","Sayed","sara.ahmed@orange.com");
        P01_register.dateOfBirth("7","2","1990");
        P01_register.companyName("Orange");
        P01_register.passwords("1279929233","1279929233");
        P01_register.ClickContinue();

    }
    @When("A user registered successfully for this valid scenario")
    public void AUserRegisteredSuccessfullyForThisValidScenario(){
        driver.get("https://demo.nopcommerce.com/");
        P02_login.Login("mahmoudN22@gmail.com","27863686");

    }
    @Then("The URL is true and My account tab is displayed")
    public void TheURLIsTrueAndMyAccountTabIsDisplayed(){
        Assert.assertEquals(driver.getCurrentUrl(),"https://demo.nopcommerce.com/","Success login");
        Assert.assertTrue(openPage.getMyAccBtn(),"My account tab is displayed");

        softAssert.assertAll();
    }

    @Given("A user registered successfully for this in valid scenario")
    public void AUserRegisteredSuccessfullyForThisInValidScenario(){
        driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");

        P01_register.chooseGender("female");
        P01_register.personalData("Sarah","Sayed","sara.ahmed@orange.com");
        P01_register.dateOfBirth("7","2","1990");
        P01_register.companyName("Orange");
        P01_register.passwords("1279929233","1279929233");
        P01_register.ClickContinue();

    }
    @When("A user inserts valid user name and in valid password after registration")
    public void AUserInsertsValidUserNameAndInValidPasswordAfterRegistration(){
        driver.get("https://demo.nopcommerce.com/");
        P02_login.Login("mahmoudN11@gmail.com","12345678");

    }
    @Then("An error Message is displayed and his color is red")
    public void AnErrorMessageIsDisplayedAndHisColorIsRed(){
        softAssert.assertEquals(openPage.getErrorMsgColor(),"#e4434b","message color isn't red");

        softAssert.assertTrue(openPage.getErrorMsg().contains("Login was unsuccessful"));
        softAssert.assertAll();
    }

}