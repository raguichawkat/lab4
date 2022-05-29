package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.WebForm;

public class BaseTest {
    private WebDriver driver;
    protected WebForm webForm;

    public void setup(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://formy-project.herokuapp.com/form");
        webForm = new WebForm(driver);

    }
    public void quitForm (){
        driver.quit();

    }

}
