package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.time.Duration;

public class Driver {

    private static WebDriver driver;

    public static WebDriver getDriver() {
        if(driver == null) {
            switch (ConfigReader.getProperty("browser")) {
                case "safari":
                    driver = new SafariDriver();
                    break;
                case "firefox":
                    driver = new FirefoxDriver();
                    break;
                default:
                    ChromeOptions opt = new ChromeOptions();
                    opt.addArguments("--remote-allow-origins=*");
                    opt.addArguments("--no-sandbox");
                    opt.addArguments("--disable-dev-shm-usage");
                    opt.addArguments("--disable-gpu");
                    opt.addArguments("--headless");
                    opt.addArguments("--window-size=1920,1080'");
                    opt.addArguments("--ignore-certificate-errors");
                    opt.addArguments("--disable-extensions");

                    driver = new ChromeDriver(opt);
            }
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.manage().window().maximize();
        }
        return driver;
    }

    public static void close() {
        if(driver != null) {
            driver.close();
            driver = null;
        }
    }

    public static void quit() {
        if(driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
