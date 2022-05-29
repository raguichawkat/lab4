package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class WebForm {
    private WebDriver driver;
    private By firstNameField = By.id("first-name");
    private By lastNameField = By.id("last-name");
    private By jobTitleField = By.id("job-title");
    private By submitButton = By.xpath("//a[@class=\"btn btn-lg btn-primary\"]");

    private By radioBtn1 = By.id("radio-button-1");
    private By radioBtn2 = By.id("radio-button-2");
    private By radioBtn3 = By.id("radio-button-3");


    public WebForm (WebDriver driver){
        this.driver = driver;
    }

    public void setFirstName(String firstName){

        driver.findElement(firstNameField).sendKeys(firstName);
    }

    public void setLastName(String lastName){
        driver.findElement(lastNameField).sendKeys(lastName);

    }

    public void setJobTitle(String jobTitle){
        driver.findElement(jobTitleField).sendKeys(jobTitle);

    }

    public void setHighestLevelOfEduction(String highestLevelOfEduction){
        if (highestLevelOfEduction.equals("High School"))
            driver.findElement(radioBtn1).click();
        if (highestLevelOfEduction.equals("College"))
            driver.findElement(radioBtn2).click();
        if (highestLevelOfEduction.equals("Grad School"))
            driver.findElement(radioBtn3).click();
    }

    public SubPage clickOnSubmitButton(){
        driver.findElement(submitButton).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        return new SubPage(driver);

    }

}
