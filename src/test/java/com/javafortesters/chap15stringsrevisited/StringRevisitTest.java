package com.javafortesters.chap15stringsrevisited;

import org.junit.Test;

import java.util.logging.Logger;

public class StringRevisitTest {


    private static final Logger LOGGER = Logger.getLogger(StringRevisitTest.class.getName());

    @Test
    public void usingEscapeCharacters() {

        // a tab character \t
        System.out.println(" I love my \t teddy bear");
        LOGGER.info("I love my\t teddy bear");

        // a backspace character \b
        System.out.println("I'm missing \"s\" from \"Waqas\"\b\b");
        LOGGER.info("I'm missing \"s\" from \"Waqas\"\b\b");

        // a new line character \n
        System.out.println("\"teddy bear\"\n will be on separate line");
        LOGGER.info("\"teddy bear\"\n will be on separate line");

        // a carriage return character \r
        System.out.println("I'm using a carriage return\r and using it again\r that's it only two times");
        LOGGER.info("All that i'm writing here won't be outputted\r becasue i've used carriage return from \"because\"");

        // a single quote character \'
        System.out.println("My job title is \'QA Engineer\' in \'Sedex\'");
        LOGGER.info("My job title is \'QA Engineer\' in \'Sedex\'");

        // a double quote character
        System.out.println("My full name is \"Syed Waqas Ali Raza\"");
        LOGGER.info("My full name is \"Syed Waqas Ali Raza\"");

        // a backslash character
        System.out.println("This is a single backslash \\");
        LOGGER.info("This is a single backslash \\");
    }
}
