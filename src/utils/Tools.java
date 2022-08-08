package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;
import java.util.Locale;

public class Tools {
    public static void compareToList(List<String> menueExpectedlist, List<WebElement> menueActuallist){
        for (int i=0;i<menueExpectedlist.size();i++)
            Assert.assertEquals(menueExpectedlist.get(i),menueActuallist.get(i).getText(),"bekledigimiz menue var olan la ayni mi dogruysa tamam degilse bu yaziya gosterir");

    }
    public static void successmesagvalidation(){
        WebElement yesilyazi= GenelWebDriver.driver.findElement(By.xpath("//*[@class='alert alert-success alert-dismissible']"));
        Assert.assertTrue(yesilyazi.getText().toLowerCase().contains("success"));
    }
    public static void Bekle(int saniye){

        try {
            Thread.sleep(saniye*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
