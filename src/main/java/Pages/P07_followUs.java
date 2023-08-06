package Pages;

import io.cucumber.java.ja.但し;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;

public class P07_followUs extends PageBase{

    private By faceBookLink = By.cssSelector("a[href=\"http://www.facebook.com/nopCommerce\"]");
    private By twitterLink = By.cssSelector("a[href=\"https://twitter.com/nopCommerce\"]");
    private By newsLink = By.cssSelector("a[href=\"/news/rss/1\"]");
    private By youTubeLink =By.cssSelector("a[href=\"http://www.youtube.com/user/nopCommerce\"]");
    public P07_followUs(WebDriver driver) {
        super(driver);
    }
    public static String y;
    public static String x;
    public static String z;
    public static String n;
    public P07_followUs OpenFaceBook() {

        driver.findElement(faceBookLink).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));

        ArrayList<String> Tabs = new ArrayList<>(driver.getWindowHandles());
        System.out.println(Tabs.size());

        driver.switchTo().window(Tabs.get(1));
        System.out.println("tab 1:  " + driver.getCurrentUrl());
        y =driver.getCurrentUrl();

        driver.switchTo().window(Tabs.get(0));
        System.out.println("tab 0:  " + driver.getCurrentUrl());

        driver.close();

        return new P07_followUs(driver) ;
    }
    public P07_followUs OpenTwitter() {

        driver.findElement(twitterLink).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));

        ArrayList<String> Tabs = new ArrayList<>(driver.getWindowHandles());
        System.out.println(Tabs.size());

        driver.switchTo().window(Tabs.get(1));
        System.out.println("tab 1:  " + driver.getCurrentUrl());
        x =driver.getCurrentUrl();

        driver.switchTo().window(Tabs.get(0));
        System.out.println("tab 0:  " + driver.getCurrentUrl());

        driver.close();


        return new P07_followUs(driver) ;
    }
    public P07_followUs OpenNews() {
        driver.findElement(newsLink).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));

        ArrayList<String> Tabs = new ArrayList<>(driver.getWindowHandles());
        System.out.println(Tabs.size());

        driver.switchTo().window(Tabs.get(1));
        System.out.println("tab 1:  " + driver.getCurrentUrl());
        z =driver.getCurrentUrl();

        driver.switchTo().window(Tabs.get(0));
        System.out.println("tab 0:  " + driver.getCurrentUrl());

        driver.close();



        return new P07_followUs(driver);
    }
    public P07_followUs OpenYouTube() {

        driver.findElement(youTubeLink).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));

        ArrayList<String> Tabs = new ArrayList<>(driver.getWindowHandles());
        System.out.println(Tabs.size());

        driver.switchTo().window(Tabs.get(1));
        System.out.println("tab 1:  " + driver.getCurrentUrl());
        n =driver.getCurrentUrl();

        driver.switchTo().window(Tabs.get(0));
        System.out.println("tab 0:  " + driver.getCurrentUrl());

        driver.close();



        return new P07_followUs(driver) ;
    }

}