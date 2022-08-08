package GUN03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import utils.GenelWebDriver;
import utils.Tools;

import java.util.List;

public class _02_AddressFunctionality extends GenelWebDriver {

    @Test
    void addressbook() {
        WebElement adressbook = driver.findElement(By.linkText("Address Book"));
        adressbook.click();
        WebElement newadress=driver.findElement(By.xpath("//*[text()='New Address']"));
        newadress.click();
        WebElement firstname=driver.findElement(By.id("input-firstname"));
        firstname.sendKeys("razi");
        WebElement lasname=driver.findElement(By.id("input-lastname"));
        lasname.sendKeys("hayhay");
        WebElement company=driver.findElement(By.id("input-company"));
        company.sendKeys("rasa");
        WebElement adress1=driver.findElement(By.id("input-address-1"));
        adress1.sendKeys("turkey,Van");
        WebElement adress2=driver.findElement(By.id("input-address-2"));
        adress2.sendKeys("turkey,Van");
        WebElement city=driver.findElement(By.id("input-city"));
        city.sendKeys("Van");
        WebElement postcode=driver.findElement(By.id("input-postcode"));
        postcode.sendKeys("1234");

        WebElement menue1=driver.findElement(By.id("input-country"));
        Select ddmenue=new Select(menue1);
        ddmenue.selectByIndex(20);

        WebElement menue2=driver.findElement(By.id("input-zone"));
        Select ppmenue=new Select(menue2);
        wait.until(ExpectedConditions.numberOfElementsToBeLessThan(By.cssSelector("[id='input-zone']>option"),ppmenue.getOptions().size()));
        //vaghty ke mikhay tu option dovom shahrha ro entekhab koni chon vase har keshvari baham fargh mikone bayad sabr koni ta avaz beshe
        //be khatere hamin montazer mimoni ta taghir kone.tedad shahrhaye har keshvar chon baham fargh mikone pas in rah manteghy miad

       // wait.until(ExpectedConditions.stalenessOf(driver.findElement(By.cssSelector("select[id='input-zone']>option"))));
        //bu elemanın bayatlamış hali gidene kadar bekle(ino ham mishe estefade kard be jaye satr40)
        //vaghty do ta dropdrown be ham dige vasl bashe mesle keshvar va shahrha
        ppmenue.selectByIndex(3);

        WebElement defaultyes=driver.findElement(By.xpath("//input[@name='default' and @value='1']"));
        defaultyes.click();

        WebElement continuebutton=driver.findElement(By.xpath("//input[@type='submit' and @value='Continue']"));
        continuebutton.click();


        Tools.successmesagvalidation();
    }

    @Test
    void adsoyaddegistirme(){

        WebElement adressbook = driver.findElement(By.linkText("Address Book"));
        adressbook.click();

        List<WebElement> editAll=driver.findElements(By.linkText("Edit"));
        WebElement sonedit=editAll.get(editAll.size()-1);//sonuncu edit
        System.out.println("editAll = " + editAll.size());;
       sonedit.click();

        WebElement firstname=driver.findElement(By.id("input-firstname"));
        firstname.clear();

        firstname.sendKeys("mahdi");
        WebElement lasname=driver.findElement(By.id("input-lastname"));

        lasname.clear();
        lasname.sendKeys("hanhan");

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("input-country")));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[id='input-zone']>option")));

        WebElement continuebutton=driver.findElement(By.xpath("//input[@type='submit' and @value='Continue']"));
        continuebutton.click();



        Tools.successmesagvalidation();

    }
    @Test(dependsOnMethods = {"adsoyaddegistirme"})
    void adresssilme(){
        WebElement adressbook = driver.findElement(By.linkText("Address Book"));
        adressbook.click();
        List<WebElement> deleteAll=driver.findElements(By.linkText("Delete"));
        WebElement sondelet=deleteAll.get(deleteAll.size()-2);//sonuncu edit
        System.out.println("editAll = " + deleteAll.size());;
        sondelet.click();
        Tools.successmesagvalidation();
    }
}
  //  List<WebElement> countries = driver.findElements(By.cssSelector("[id='input-country']>option"));
    //int randomNumForCountries = (int) ((Math.random()) * countries.size());
   // WebElement selectedCountry = driver.findElement(By.cssSelector("[id='input-country']>option:nth-child" + "(" + randomNumForCountries + ")"));
//selectedCountry.click();

