package GUN02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.GenelWebDriver;
import utils.Tools;

public class _03_subscribe extends GenelWebDriver {
    By link=By.linkText("Newsletter");
    By yes=By.cssSelector("input[value='1']");
    By no=By.cssSelector("input[value='0']");
    By cnt=By.cssSelector("input[value='Continue']");

    @Test(priority = 1)
    void subscribeY(){
        wait.until(ExpectedConditions.elementToBeClickable(link));
        WebElement newsletter= driver.findElement(link);
        newsletter.click();
        WebElement accept= driver.findElement(yes);
        accept.click();
        WebElement continuebutton=driver.findElement(cnt);
        continuebutton.click();

        Tools.successmesagvalidation();
    }
    @Test(priority = 2)
    void subscribeN(){
        wait.until(ExpectedConditions.elementToBeClickable(link));
        WebElement newsletter= driver.findElement(link);
        newsletter.click();
        WebElement accept= driver.findElement(no);
        accept.click();
        WebElement continuebutton=driver.findElement(cnt);
        continuebutton.click();

        Tools.successmesagvalidation();
    }
    @Test(priority = 3)
    void subscribtionForBoth(){
        wait.until(ExpectedConditions.elementToBeClickable(link));

        WebElement newsletterlink= driver.findElement(link);
        newsletterlink.click();

        WebElement yesradiobuttun= driver.findElement(yes);
        WebElement noradiobutton=driver.findElement(no);

        if (yesradiobuttun.isSelected())
            noradiobutton.click();
        else
            yesradiobuttun.click();

        WebElement continuebutton= driver.findElement(cnt);
        continuebutton.click();

        Tools.successmesagvalidation();

    }






}
