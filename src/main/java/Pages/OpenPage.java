package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.Color;

public class OpenPage extends PageBase{
    private By registrationPassMsg = By.cssSelector("div[class=\"result\"]");
    private By errorMsg = By.cssSelector("div[class=\"message-error validation-summary-errors\"]");
    private By msgColor = By.cssSelector("div[class=\"result\"]");
    private By myAccButton = By.cssSelector("a[class=\"ico-account\"]");
    private By errorMsgColor = By.cssSelector("div[class=\"message-error validation-summary-errors\"]");



    public OpenPage(WebDriver driver) {
        super(driver);
    }
    public String getErrorMsg(){

        return driver.findElement(errorMsg).getText();
    }

    public boolean getMyAccBtn(){

        return driver.findElement(myAccButton).isDisplayed();
    }

    public String getRegritionPassMsg(){
        return driver.findElement(registrationPassMsg).getText();
    }
    public String getMsgColor(){
        String s = driver.findElement(msgColor).getCssValue("color");
        return Color.fromString(s).asHex();
    }


    public String getErrorMsgColor(){
        String rgbaColor = driver.findElement(errorMsgColor).getCssValue("color");
        return  Color.fromString(rgbaColor).asHex();
    }
}