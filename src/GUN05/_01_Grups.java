package GUN05;

import org.testng.annotations.Test;

public class _01_Grups {


    @Test(groups = "SmokeTest")
    void Test1() {
        System.out.println("Test 1 smoketest");
    }

    @Test(groups = "Regression")
    void Test3() {
        System.out.println("Test 3 regression test");
    }

    @Test(groups = "Regression")
    void Test15() {
        System.out.println("Test 5 regresion ");
    }

    @Test(groups = "Regression")
    void Test2() {
        System.out.println("Test 2 regression");
    }

    @Test(groups = "SmokeTest")
    void Test4() {
        System.out.println("Test 4 smoketest");
    }

    @Test(groups = "mokeTest")
    void Test6() {
        System.out.println("Test 6 regresion");
    }


    void Test7() {
        System.out.println("Test 7 smoketest");
    }


}
