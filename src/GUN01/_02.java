package GUN01;

import org.testng.annotations.*;

public class _02 {
    /*
         @BeforeClass --> // Her class çalışıyorken önce burası çalışır
           @BeforeMetod --> // Her metoddan(test metod) önce çalışır
              @Test     -->  testlerin çalıştığı metodlar
              @Test     -->  testlerin çalıştığı metodlar
           @AfterMetod --> // Her metoddan(test metod) sonra çalışır
         @AfterClass --> // Her class çalışıyorken sonra burası çalışır
     */
    @BeforeClass
    void beforclass(){
        System.out.println("befor  class");
    }
    @BeforeMethod
    void beformethod(){
        System.out.println(" her test methodtan once calisacak :before method");
    }
    @Test
    void test1(){
        System.out.println("test 1 calisti");
    }
    @Test
    void test2(){
        System.out.println("test 2 calisti");
    }
    @AfterMethod
    void aftermethod(){
        System.out.println("her test methodtan sonra calisacak :after method");
    }
    @AfterClass
    void afterclass(){
        System.out.println("after class");
    }
}
