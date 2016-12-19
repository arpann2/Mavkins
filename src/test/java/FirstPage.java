import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Created by arpan on 19/12/2016.
 */
public class FirstPage {

    /*
    private  String firefox_driver_path = "E:\\JARs\\Selenium-3.0.1\\geckodriver-v0.11.1-win64\\geckodriver.exe";
    WebDriver driver;

    public void setUp () {
        System.setProperty("webdriver.gecko.driver",firefox_driver_path);
        driver = new FirefoxDriver();
        driver.get("https://bb.co.uk");
    }


    public void verifyTitle() {
        driver.getTitle();
    }

    public void tearDown() {
        driver.quit();
    }

    */

    @Test
    public void verifyMethod() {
        System.out.println("hello from github");
    }



}
