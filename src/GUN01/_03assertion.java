package GUN01;

import org.testng.Assert;
import org.testng.annotations.Test;
//yesil tik:teste hata yok
//sari carpi:teste hata var
//beyaz:test calismadigi.skip

public class _03assertion {
    @Test
   void Equal(){
        String s1="merhaba";
        String s2="iyi aksamlar";

        //olusan,beklenen,hata basligi
        Assert.assertEquals(s1,s2,"karsilastirma sonucu");
    }
    @Test
    void notEqual(){
        String s1="merhaba";
        String s2="iyi aksamlar";

        //olusan,beklenen,hata basligi
        Assert.assertNotEquals(s1,s2,"karsilastirma sonucu");
    }
    @Test
    void True(){
        int s1=55;
        int s2=555;

        //olusan,beklenen,hata basligi
        Assert.assertTrue(s1==s2,"karsilastirma sonucu");
    }
    @Test
    void nullornek(){
        String s1=null;


        //olusan,beklenen,hata basligi
        Assert.assertNull(s1,"karsilastirma sonucu");
    }
    @Test
    void direkfail(){//bazi mogheha mituni if bezari ve dar un halat direk fail mituni bedi
        Assert.fail();
    }
}
