package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SubPage {
    private WebDriver driver;
    private By status = By.xpath("//div [@class=\"alert alert-success\"]");
    public SubPage(WebDriver driver){
        this.driver = driver;
    }

    public String getStatus (){
        driver.findElement(status);
        return "The form was successfully submitted!";



    }

}
