package GUN03;

import org.testng.Assert;
import org.testng.annotations.Test;
import utils.GenelWebDriver;//intervew
 /*
   interviewlarda sorulan bir konu : testlere öncelikleri nasıl verirsin ?
   priority, dependecy;   Nasıl kullanırsın ?
   1- priority =1 gibi sıralı rakamlar vererek bununla çalışma sırasını belirtirim.
   2- dependOnMethods : bununla kendinden önce hangi metod çalışması gerekiyor ise onu belirtirim.
      bir metodu direkt çalıştırdığınızda kendinden önce bağımlı 1  metod var ise ototmaitk onları
      önce çağırıp sonra kendisi çalışır. Fakat 2 veya daha fazla tane var ise bağımlı olduğu metod ozaman çalışamaz.
 */


public class _01_Dependency  {

    @Test
    void startcar(){
        System.out.println("start car");
    }

    @Test(dependsOnMethods = {"startcar"})
    void drivingcar(){
        System.out.println("driving kar");
        Assert.fail();
    }

    @Test(dependsOnMethods = {"startcar","drivingcar","parkcar"},alwaysRun = true)
    void stopcar(){
        System.out.println("car stop");
    }

    @Test(dependsOnMethods = {"startcar","drivingcar"})
    void parkcar(){
        System.out.println("parking car");
    }


}
