package resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.*;

public class Base {

    public static WebDriver driver;
    public static WebDriverWait wait;
    public static Properties prop;

    public static GoogleNewsPage googleNewsPage;

    public static WebDriver driverSetup() throws IOException {

        prop = new Properties();

        final FileInputStream fis = new FileInputStream("src/test/java/resources/global.properties");

        prop.load(fis);

        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 20);

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(prop.getProperty("url"));

        googleNewsPage = new GoogleNewsPage(driver);

        return driver;
    }
}