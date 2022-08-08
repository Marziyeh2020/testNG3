package GUN01;

import org.testng.annotations.Test;

public class GUN01 {
    @Test(priority = 1)//annotation
    void  websitesiniac(){
        System.out.println("driver tamamlandi ve web sitesi acildi");
    }//sira vermezsen otomatik calistiriliyor alphabetik kar mikone vaghty play mikoni

    //yesil tik assertion hata vermedi

    @Test(priority = 2)
    void  logintestislemiyap(){
        System.out.println("login islemi yapildi");
    }

    @Test(priority = 3)
    void  driverkapandi(){
        System.out.println("driver kapatildi");
    }
}
