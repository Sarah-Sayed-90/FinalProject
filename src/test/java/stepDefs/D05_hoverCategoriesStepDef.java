package stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import Pages.P05_hoverCategories;

import static stepDefs.Hooks.*;

public class D05_hoverCategoriesStepDef {
    @Given("A user Navigates to Nop commerce URL")
    public void AUserNavigatesToNopCommerceURL(){
        driver.get("https://demo.nopcommerce.com/");

    }
    @When("A user hover on random category And select random item from this random category")
    public void AUserHoverOnRandomCategoryAndSelectRandomItemFromThisRandomCategory(){
        hoverCategoriesPage.selectRandom1();
    }
    @Then("the sub category title is contains what i select")
    public void TheSubCategoryTitleIsContainsWhatIlect(){
        Assert.assertEquals(P05_hoverCategories.selectedSubCategoryText, P05_hoverCategories.menu);
    }
}