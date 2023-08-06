package stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import Pages.P06_homeSlider;

import static stepDefs.Hooks.*;

public class D06_homeSlidersStepDef {
    @Given("A user Navigates to nopcommerce URL")
    public void AUserNavigatesToNopcommerceURL(){
        driver.get("https://demo.nopcommerce.com/");
    }

    @When("A user open Nokia Slider Url")
    public void aUserOpenNokiaSliderUrl() {
        slidersPage.FirstSlider();
    }

    @Then("the expected nokia Url like {string}")
    public void theExpectedNokiaUrlLike(String nokiaUrl) {
        Assert.assertEquals(P06_homeSlider.p,nokiaUrl);
        softAssert.assertAll();
    }

    @When("A user open IPhone Slider Url")
    public void aUserOpenIPhoneSliderUrl() {
        slidersPage.SecondSlider();
    }

    @Then("the expected iphone  Url like {string}")
    public void theExpectedIphoneUrlLike(String iphoneUrl) {
        Assert.assertEquals(P06_homeSlider.v,iphoneUrl);
        softAssert.assertAll();
    }
}