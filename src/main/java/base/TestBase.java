package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import static utils.TargetProperties.getTestProperty;

public abstract class TestBase {
    public static WebDriver driver;

    @BeforeSuite
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to(getTestProperty("url"));
    }

    @AfterSuite
    public void tearDown() {
        driver.quit();
    }
}
