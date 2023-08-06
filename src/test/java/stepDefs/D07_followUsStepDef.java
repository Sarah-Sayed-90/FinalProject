package stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import Pages.P07_followUs;


import static stepDefs.Hooks.*;

public class D07_followUsStepDef {
    @Given("A user Navigates to  URL")
    public void aUserNavigatesToURL() {
        driver.get("https://demo.nopcommerce.com/");
    }

    @When("A user click to facebook follow us links")
    public void aUserClickToFacebookFollowUsLinks() {

        followUsPage.OpenFaceBook();

    }

    @Then("the current facebook Url like {string}")
    public void theCurrentFacebookUrlLike(String expfacebookurl) {

        Assert.assertEquals(P07_followUs.y,expfacebookurl);
        softAssert.assertAll();
    }

    @When("A user click to twitter follow us links")
    public void aUserClickToTwitterFollowUsLinks() {

        followUsPage.OpenTwitter();

    }

    @Then("the current twitter Url like {string}")
    public void theCurrentTwitterUrlLike(String exptwitterurl) {

        Assert.assertEquals(P07_followUs.x,exptwitterurl,"failed");
        softAssert.assertAll();
    }

    @When("A user click to news follow us links")
    public void aUserClickToNewsFollowUsLinks() {

        followUsPage.OpenNews();

    }

    @Then("the current news Url like {string}")
    public void theCurrentNewsUrlLike(String expnewsurl) {
        Assert.assertEquals(P07_followUs.z,expnewsurl,"Failed");
        softAssert.assertAll();
    }

    @When("A user click to youtube follow us links")
    public void aUserClickToYoutubeFollowUsLinks() {

        followUsPage.OpenYouTube();

    }

    @Then("the current youtube Url like {string}")
    public void theCurrentYoutubeUrlLike(String expyoutubeurl) {
        Assert.assertEquals(P07_followUs.n,expyoutubeurl);
        softAssert.assertAll();
    }
}