package GUN04;

import org.testng.annotations.*;

public class _01_intro {
    @BeforeSuite
    void bsuit() {
        System.out.println("before suite");
    }

    @BeforeTest
    void bTest() {
        System.out.println("before test");
    }

    @BeforeGroups
    void bgrups() {
        System.out.println("before grups");
    }

    @BeforeClass
    void bclass() {
        System.out.println("before class");
    }

    @BeforeMethod
    void bmethod() {
        System.out.println("before method");
    }


    @Test
    void test1() {
        System.out.println("testing....");
    }

    @Test
    void test2() {
        System.out.println("testing1.....");
    }


    @AfterMethod
    void Amethod() {
        System.out.println("after method");
    }

    @AfterClass
    void aclass() {
        System.out.println("after class");
    }

    @AfterGroups
    void Agroups() {
        System.out.println("after grups");
    }

    @AfterTest
    void Atest() {
        System.out.println("after test");
    }

    @AfterSuite
    void Asuite() {
        System.out.println("after suite");
    }


}
