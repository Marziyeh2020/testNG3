package GUN01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.logging.Level;
import java.util.logging.Logger;

import java.time.Duration;


public class _04Enable {
    public static WebDriver driver;
    public static WebDriverWait wait;


    @BeforeClass
    void baslangicislemler() {
        System.out.println("driver strat...");


        System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        driver = new ChromeDriver();
        // driver.manage().window().maximize();//max
        driver.manage().deleteAllCookies();//her zaman yeni baglanmis gibi oluyorsun

        wait = new WebDriverWait(driver, Duration.ofSeconds(30));//sayfanin guzel yuklensin diye zaman veriyor
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));//sadece ana sayfa yuklensin
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));//butun web icin gecerli

    }


    @AfterClass
    void Bitisislemler() {
        System.out.println("driver stoped...");


        try {
            Runtime.getRuntime().exec("taskkill /F /IM chromedriver.exe /T");
        } catch (Exception ignored) {

        }

    }
}

