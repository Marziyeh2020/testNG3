package GUN02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import utils.GenelWebDriver;
import utils.Tools;

public class _02_Editaccount extends GenelWebDriver {
    @Test
    void Editaccount(){


        editaccount("razi","pass");
        Tools.Bekle(2);
        editaccount("leila","hosseini");


         }
         void editaccount(String ad,String soyad){
             WebElement edit= driver.findElement(By.xpath("//*[text()='Edit Account']"));
             edit.click();


             WebElement firstname= driver.findElement(By.id("input-firstname"));
             firstname.clear();
             firstname.sendKeys(ad);

             WebElement lastname= driver.findElement(By.id("input-lastname"));
             lastname.clear();
             lastname.sendKeys(soyad);

             WebElement continuebutton=driver.findElement(By.cssSelector("input[value='Continue']"));
             continuebutton.click();

             Tools.successmesagvalidation();

         }


}
