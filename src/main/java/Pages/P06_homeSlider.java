package Pages;

import org.openqa.selenium.WebDriver;

public class P06_homeSlider extends PageBase{

    public static String p;
    public static String v;
    public P06_homeSlider(WebDriver driver) {
        super(driver);
    }
    public P06_homeSlider FirstSlider(){
        driver.get("https://demo.nopcommerce.com/nokia-lumia-1020");
        p = driver.getCurrentUrl();

        return new P06_homeSlider(driver);
    }
    public P06_homeSlider SecondSlider(){

        driver.get("https://demo.nopcommerce.com/iphone-6");
        v = driver.getCurrentUrl();

        return new P06_homeSlider(driver);
    }
}