import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

/**
 * Created by arpan on 19/12/2016.
 */
public class FirstPage {


    private  String firefox_driver_path = "E:\\JARs\\Selenium-3.0.1\\geckodriver-v0.11.1-win64\\geckodriver.exe";
    private  String chrome_driver_path = "E:\\JARs\\Selenium-3.0.1\\chromedriver_win32\\chromedriver.exe";
    WebDriver driver;

    @BeforeClass
    public void setUp () {
        System.setProperty("webdriver.chrome.driver",chrome_driver_path);
        driver = new ChromeDriver();
        driver.get("https://bbc.co.uk");
        driver.manage().window().maximize();
    }

    @Test
    public void verifyTitle() {
       String title = driver.getTitle();
        System.out.println("title: " + title);
    }

    @Test
    public void verifyMethod() {
        System.out.println("hello from github");
    }


    @AfterClass
    public void tearDown() {
        driver.quit();
    }







}
