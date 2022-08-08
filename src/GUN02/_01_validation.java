package GUN02;
/*
        Senaryo;
        1- Siteyi açınız
        2- Top Menudeki menu elemanlarının olduğunu doğrulayınız.
     */

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.GenelWebDriver;
import utils.Tools;

import java.util.ArrayList;
import java.util.List;

public class _01_validation extends GenelWebDriver {//http://opencart.abstracta.us/index.php?route=account/login
    @Test
    void logintest() {
        WebElement inputemail = driver.findElement(By.id("input-email"));
        inputemail.sendKeys("marziyeh@gmail.com");

        WebElement password= driver.findElement(By.id("input-password"));
        password.sendKeys("imaniman");

        WebElement loginbutton= driver.findElement(By.cssSelector("input[value='Login']"));
        loginbutton.click();
    }
    @Test
    void menuevalidation(){

        List<String> menueExpectedlist=new ArrayList<>();
        menueExpectedlist.add("Desktops");
        menueExpectedlist.add("Laptops & Notebooks");
        menueExpectedlist.add("Components");
        menueExpectedlist.add("Tablets");
        menueExpectedlist.add("Software");
        menueExpectedlist.add("Phones & PDAs");
        menueExpectedlist.add("Cameras");
        menueExpectedlist.add("MP3 Players");

        By menuefinder=By.cssSelector("ul[class='nav navbar-nav']>li");
        List<WebElement> menueActuallist=driver.findElements(menuefinder);

      //  for (int i=0;i<menueExpectedlist.size();i++)
        //    Assert.assertEquals(menueExpectedlist.get(i),menueActuallist.get(i).getText());

        Tools.compareToList(menueExpectedlist,menueActuallist);

    }

}
