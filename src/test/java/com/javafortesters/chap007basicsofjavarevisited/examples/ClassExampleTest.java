package com.javafortesters.chap007basicsofjavarevisited.examples;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ClassExampleTest {

    @Test
    public void callingClassField() {
      assertEquals("class field matches",
              "a class field",
      ClassExample.aClassField);
    }

    @Test
    public void pubFieldTest() {
        ClassExample insta = new ClassExample("Waqas");
        assertEquals("public field original value",
                "a public field",
                insta.pubField);
    }

    @Test
    public void IntegerTypes() {
        byte aByteHas1Byte;
        short aShortHas2Bytes;
        int anIntHas4Bytes;
        long aLongHas8Bytes;

        System.out.println(
                "* `byte` range: " +
                        Byte.MIN_VALUE + " to " +
                        Byte.MAX_VALUE);

        System.out.println(
                "* `short` range: " +
                        Short.MIN_VALUE + " to " +
                        Short.MAX_VALUE);

        System.out.println(
                "* `int` range: " +
                        Integer.MIN_VALUE + " to " +
                        Integer.MAX_VALUE);

        System.out.println(
                "* `long` range: " +
                        Long.MIN_VALUE + " to " +
                        Long.MAX_VALUE);
    }

    @Test
    public void ternaryOperatorsExplored() {
        int x;
        x = 4>3 ? 2 : 1;
        assertEquals(2, x);

        assertTrue(5>=4? true : false);
    }

    @Test
    public void someStringMethods() {
        String aString = "abcdef";

        assertEquals(6, aString.length());
        assertTrue(aString.compareToIgnoreCase("ABCDEF")==0);
        assertTrue(aString.contains("bcde"));
        assertTrue(aString.startsWith("abc"));

        assertEquals('c', aString.charAt(2));
        assertEquals("ef", aString.substring(4));
    }
}
