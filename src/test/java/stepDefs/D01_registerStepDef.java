package stepDefs;

import Pages.P01_register;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import static stepDefs.Hooks.*;

public class D01_registerStepDef{
    @Given("A user Navigates to registration URL")
    public void AUserNavigatesToRegistrationURL(){
        driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");

    }
    @When("A user inserts valid Data")
    public void AUserInsertsValidData(){

        P01_register.chooseGender("female");
        P01_register.personalData("Sarah","Sayed","sara.ahmed@orange.com");
        P01_register.dateOfBirth("7","2","1990");
        P01_register.companyName("Orange");
        P01_register.passwords("1279929233","1279929233");
    }
    @Then("A registration Msg is appeared")
    public void ARegistrationMsgIsAppeared(){
        Assert.assertEquals(openPage.getRegritionPassMsg(),"Your registration completed");
        softAssert.assertEquals(openPage.getMsgColor(),"#4cb17c","message color isn't green");

        softAssert.assertAll();
    }

}