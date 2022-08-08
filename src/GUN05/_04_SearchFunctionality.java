package GUN05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import utils.ParametreliWebDriver;

import java.util.List;

public class _04_SearchFunctionality extends ParametreliWebDriver {
    @Test
    @Parameters("arananKelime")
    void searchfunction(String txtsearch) {
        WebElement searchinput = driver.findElement(By.name("search"));
        searchinput.sendKeys(txtsearch);

        WebElement searchbutton = driver.findElement(By.cssSelector("[class='btn btn-default btn-lg']"));
        searchbutton.click();

        List<WebElement> caption = driver.findElements(By.cssSelector("[class='product-thumb'] [class='caption'] a"));
        //css h4>a
        for (WebElement e : caption) {
            Assert.assertTrue(e.getText().toLowerCase().contains(txtsearch));
        }


    }
}
