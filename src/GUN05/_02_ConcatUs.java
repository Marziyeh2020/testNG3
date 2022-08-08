package GUN05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import utils.GenelWebDriver;

public class _02_ConcatUs extends GenelWebDriver {

   @Test
   @Parameters("mesaj")//xml deki adi
    void  ContactUs(String gelenmesaj){//metoddaki adi
        WebElement contactbutton= driver.findElement(By.linkText("Contact Us"));
        contactbutton.click();

        WebElement enquiryArea= driver.findElement(By.id("input-enquiry"));
        enquiryArea.sendKeys(gelenmesaj);

        WebElement submitbutton= driver.findElement(By.cssSelector("[value='Submit']"));
        submitbutton.click();

        WebElement cotactUslabel= driver.findElement(By.cssSelector("[id='content']>h1"));
        System.out.println(cotactUslabel.getText());


        Assert.assertEquals("Contact Us",cotactUslabel.getText(),"karsilaştirma sonucu");


    }
}
