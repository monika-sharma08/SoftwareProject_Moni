package com.thetestingacdemy.ex_05_TestNGExamples;

import org.testng.annotations.*;

public class APITesting024_All_Annotations {
    @BeforeTest
    void demo4(){
        System.out.println("BeforeMethod");
    }

    @Test
    void demo5(){
        System.out.println("Test");
    }

    @AfterTest
    void demo6(){
        System.out.println("AfterMethod");
    }
}
