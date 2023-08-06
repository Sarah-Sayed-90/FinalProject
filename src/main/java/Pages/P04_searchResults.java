package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class P04_searchResults extends PageBase {

    private By searchBox = By.cssSelector("input[id=\"small-searchterms\"]");
    private By searchBtn = By.cssSelector("button[class=\"button-1 search-box-button\"]");

    private By product = By.cssSelector("h2[class=\"product-title\"]");
    private By picture = By.cssSelector("div[class=\"picture\"]");
    private By sku = By.cssSelector("span[class=\"sku\"]");




    //Constractors
    public P04_searchResults (WebDriver driver) {
        super(driver);
    }
    //Variables

    //Actions
    public P04_searchResults searching(String x) {
        driver.findElement(searchBox).sendKeys(x);
        driver.findElement(searchBtn).click();
        return new P04_searchResults(driver);
    }

    public boolean SearchingChecker(String keyword ){


        List<WebElement> searchingResults = driver.findElements(product);

        List<String> text = new ArrayList<>();
        System.out.println(searchingResults.size());
        for (WebElement productName : searchingResults){
            String productText =  productName.getText().toLowerCase();
            text.add(productText);
            System.out.println(productText);

        }
        return text.stream().allMatch(s -> s.contains(keyword));
    }

    public P04_searchResults skuSearch(String y) {
        driver.findElement(searchBox).sendKeys(y);
        driver.findElement(searchBtn).click();
        driver.findElement(picture).click();
        return new P04_searchResults(driver);
    }
    public boolean skuSearchingChecker(String skukeyword ){


        List<WebElement> skuSearchingResults = driver.findElements(sku);

        List<String> text = new ArrayList<>();
        System.out.println(skuSearchingResults.size());
        for (WebElement productSkuName : skuSearchingResults){
            String productText =  productSkuName.getText().toLowerCase();
            text.add(productText);
            System.out.println(productText);

        }
        return text.stream().allMatch(s -> s.contains(skukeyword));
    }
}