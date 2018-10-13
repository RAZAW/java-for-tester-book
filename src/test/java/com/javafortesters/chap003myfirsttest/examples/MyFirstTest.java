package com.javafortesters.chap003myfirsttest.examples;

import org.junit.Test;

import com.javafortesters.chap003myfirsttest.examples.MyClass.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class MyFirstTest {

    @Test
    public void canAddTwoPlusTwo() {
        int answer = 2 + 2;
        assertEquals("2+2=4", 4, answer);
    }

    /**
    @Test
    public void canSeeNameIsMahvish() {
        String name = "Mahvish";
        assertEquals("name is Mahvish", "Mahvish", name);
        System.out.println(name);
    }
     */


    @Test
    public void canSubtractTwoMinusTwo() {
        int answer = 2 - 2;
        assertEquals("2-2=0", 0, answer);
    }

    @Test
    public void canDivide2By4() {
        int answer = 4 / 2;
        assertEquals("4/2=2", 2, answer);
    }

    @Test
    public void canMultiply2By2() {
        int answer = 2 * 2;
        assertEquals("2*2=4", 4, answer);
    }
    /*
    @Test
    public void answerIs() {
        assertTrue(MyClass.addTwoNumbers(3,4)==7);
    }
    */
}
