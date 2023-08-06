package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class P05_hoverCategories extends PageBase {

    public static String selectedSubCategoryText;
    public static String menu;
    public static String selectedCategoryText;
    public P05_hoverCategories(WebDriver driver) {
        super(driver);
    }






    public P05_hoverCategories selectRandom1() {
        List<WebElement> mainLinks = driver.findElements(By.xpath("//ul[@class=\"top-menu notmobile\"]/li"));
        int count = mainLinks.size();
        System.out.println("count is " + count);
        int selectedCategory = (int) Math.floor(Math.random() * count);
        actions().moveToElement(mainLinks.get(selectedCategory)).perform();
        selectedCategoryText = mainLinks.get(selectedCategory).getText();
        System.out.println("to know which category is selected:   " + selectedCategoryText);

        selectedCategory = selectedCategory + 1;
        String locator = "(//ul[@class='top-menu notmobile'])/li[" + selectedCategory + "]//li";
        List<WebElement> subCategoryLinks = driver.findElements(By.xpath(locator));

        if (!subCategoryLinks.isEmpty()) {
            int subCategoryCount = subCategoryLinks.size();
            System.out.println("profile links " + subCategoryCount);
            int selectedSubCategory = (int) Math.floor(Math.random() * subCategoryCount);
            selectedSubCategoryText = subCategoryLinks.get(selectedSubCategory).getText();
            subCategoryLinks.get(selectedSubCategory).click();
        } else {
            mainLinks.get(selectedCategory - 1).click();
            selectedSubCategoryText = selectedCategoryText;
        }
        menu = driver.findElement(By.cssSelector("div[class=\"page-title\"]")).getText();

        return new P05_hoverCategories(driver) ;
    }

}