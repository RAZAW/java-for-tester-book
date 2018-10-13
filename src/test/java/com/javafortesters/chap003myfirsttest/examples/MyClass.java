package com.javafortesters.chap003myfirsttest.examples;

import static org.junit.Assert.assertTrue;

public class MyClass {

    public void incorrectMethod() {
        assertTrue(false);
    }

    public static int addTwoNumbers(int a, int b) {
        return a+b;
    }
}
