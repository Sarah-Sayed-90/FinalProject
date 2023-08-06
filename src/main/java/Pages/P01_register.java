package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;


public class P01_register extends PageBase {

    private By registerBtn = By.cssSelector("a[class=\"ico-register\"]");
    private static By genderMale = By.id("gender-male");
    private static By genderFemale = By.id("gender-female");
    private static By firstName = By.id("FirstName");
    private static By lastName = By.id("LastName");
    private static By emailField = By.id("Email");
    private static By dayOfBirth = By.cssSelector("select[name=\"DateOfBirthDay\"]");
    private static By monthOfBirth = By.cssSelector("select[name=\"DateOfBirthMonth\"]");
    private static By yearOfBirth = By.cssSelector("select[name=\"DateOfBirthYear\"]");
    private static By companyName = By.id("Company");
    private static By password = By.id("Password");
    private static By confirmPassword = By.id("ConfirmPassword");

    private static By registerBtn2 = By.id("register-button");

    private static By continueBtn = By.cssSelector("a[class=\"button-1 register-continue-button\"]");
    public P01_register(WebDriver driver) {
        super(driver);
    }

    public static void chooseGender(String gender) {
        if (gender.toLowerCase() == "male") {
            driver.findElement(genderMale).click();
        } else if (gender.toLowerCase() == "female") {
            driver.findElement(genderFemale).click();
        } else {
            System.out.println("Invalid Gender");
        }
    }

    public static P01_register personalData(String FirstName, String LastName, String EmailField){
        driver.findElement(firstName).sendKeys(FirstName);
        driver.findElement(lastName).sendKeys(LastName);
        driver.findElement(emailField).sendKeys(EmailField);
        return new P01_register(driver);
    }
    public static P01_register dateOfBirth(String Day, String Month, String Year){
        Select selectday = new Select(driver.findElement(dayOfBirth));
        selectday.selectByValue(Day);

        Select selectmonth = new Select(driver.findElement(monthOfBirth));
        selectmonth.selectByValue(Month);

        Select selectyear = new Select(driver.findElement(yearOfBirth));
        selectyear.selectByValue(Year);
        return new  P01_register(driver);
    }
    public static P01_register companyName(String CompanyName){
        driver.findElement(companyName).sendKeys(CompanyName);
        return new P01_register(driver);
    }
    public static P01_register passwords(String Password, String ConfirmPassword){
        driver.findElement(password).sendKeys(Password);
        driver.findElement(confirmPassword).sendKeys(ConfirmPassword);
        driver.findElement(registerBtn2).click();
        return new P01_register(driver);
    }
    public static P01_register ClickContinue(){
        driver.findElement(continueBtn).click();
        return new P01_register(driver);
    }




}