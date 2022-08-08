package GUN01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utils.GenelWebDriver;

import java.time.Duration;

public class _05_ornek extends GenelWebDriver {//http://opencart.abstracta.us/index.php?route=account/login

    /*
   Senaryo ;
     1- http://opencart.abstracta.us/index.php?route=account/login  sitesini açınız.
     2- asd@gmail.com  ve 123qweasd   bilgileri ile login olan test metodunu yazınız.
     3- Login olup olmadığınızı assert ile kontrol ediniz.

 */
    @Test
    void logintest() {
        WebElement inputemail = driver.findElement(By.id("input-email"));
        inputemail.sendKeys("05441445901");

        WebElement password= driver.findElement(By.id("input-password"));
        password.sendKeys("marziyeh");

        WebElement loginbutton= driver.findElement(By.cssSelector("input[value='Login']"));
        loginbutton.click();
    }

}
