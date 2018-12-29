package com.javafortesters.chap011exceptions.examples;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ExceptionsExampleTest {

    //Exception
    //An exception is an object raised which interrupts the flow of execution in an application

    @Test
    public void throwNullPointerException() {
        Integer age = null;
        String ageString;

        try {
            ageString = age.toString();

        } catch (NullPointerException e) {
            System.out.println("getMessage - " + e.getMessage());
            System.out.println("getStackTrace - " + e.getStackTrace());
            System.out.println("printStackTrace");
            e.printStackTrace();
            age = 18;
            ageString = age.toString();
        } catch (IllegalArgumentException e) {
            System.out.println("Illegal Argument: " + e.getMessage());
        }

        String yourAge = "You are " + age.toString() + " years old";

        assertEquals("You are 18 years old", yourAge);
    }

}
