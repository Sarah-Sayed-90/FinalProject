package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P02_login extends PageBase {
    private static By LoginButton1 = By.cssSelector("a[class=\"ico-login\"]");
    private static By EmailField =By.id("Email");
    private static By PasswordField = By.id("Password");
    private static By LoginButton2 = By.cssSelector("button[class=\"button-1 login-button\"]");



    public P02_login(WebDriver driver) {
        super(driver);
    }
    public static P02_login Login(String Email, String Password){
        driver.findElement(LoginButton1).click();
        driver.findElement(EmailField).sendKeys(Email);
        driver.findElement(PasswordField).sendKeys(Password);
        driver.findElement(LoginButton2).click();
        return new P02_login(driver);
    }

}