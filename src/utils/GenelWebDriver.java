package utils;

import net.bytebuddy.implementation.bytecode.Throw;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

public class GenelWebDriver {
    public static WebDriver driver;
    public static WebDriverWait wait;


    @BeforeClass
   public void baslangicislemler() {
        System.out.println("driver strat...");


        System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        driver = new ChromeDriver();
        // driver.manage().window().maximize();//max
        driver.manage().deleteAllCookies();//her zaman yeni baglanmis gibi oluyorsun

        wait = new WebDriverWait(driver, Duration.ofSeconds(30));//sayfanin guzel yuklensin diye zaman veriyor
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));//sadece ana sayfa yuklensin
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));//butun web icin gecerli
        driver.get("http://opencart.abstracta.us/index.php?route=account/login");

      logintest();
    }
    void logintest() {
        WebElement inputemail = driver.findElement(By.id("input-email"));
        inputemail.sendKeys("marziyeh@gmail.com");

        WebElement password= driver.findElement(By.id("input-password"));
        password.sendKeys("imaniman");

        WebElement loginbutton= driver.findElement(By.cssSelector("input[value='Login']"));
        loginbutton.click();
    }



    @AfterClass
   public void Bitisislemler() {
        System.out.println("driver stoped...");


        try {
            Thread.sleep(3000);

        } catch (InterruptedException e) {
            throw new RuntimeException(e);

        }
      driver.quit();
    }

}
