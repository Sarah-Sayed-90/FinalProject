package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.locators.RelativeLocator;

public class P03_homePage  extends PageBase{
    private By addToWishlist = RelativeLocator.with(By.cssSelector("button[class=\"button-2 add-to-wishlist-button\"]")).below(By.cssSelector("img[alt=\"Picture of HTC One M8 Android L 5.0 Lollipop\"]"));
    private By greenMsg = By.cssSelector("div[class=\"bar-notification success\"]");

    private By wishlistCart = By.cssSelector("span[class=\"wishlist-label\"]");
    private By qtyBox = By.cssSelector("input[class=\"qty-input\"]");


    public P03_homePage(WebDriver driver) {
        super(driver);
    }



    public P03_homePage AddToWishlist(){
        click1(addToWishlist);
        return new P03_homePage(driver);
    }
    public boolean successMsgDisplayed(){
        return driver.findElement(greenMsg).isDisplayed();
    }
    public String getMsgColoration(){
        String u = driver.findElement(greenMsg).getCssValue("background-color");
        return  Color.fromString(u).asHex();
    }
    public P03_homePage WishlistCart(){
        insertText(greenMsg);
        click1(wishlistCart);

        return new P03_homePage(driver);
    }

    public String checkQtyValue(){

        return driver.findElement(qtyBox).getAttribute("value");

    }


    public void selectCurrency() {
    }
}