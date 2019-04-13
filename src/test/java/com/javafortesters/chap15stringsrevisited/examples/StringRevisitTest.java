package com.javafortesters.chap15stringsrevisited.examples;

import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.util.logging.Logger;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

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

    @Test
    public void stringConcatenation() {
        String ps1 = "This is " + "String2";
        assertThat(ps1, is("This is String2"));
        String ps2 = "This is " + 4;
        assertThat(ps2, is("This is 4"));

        String thisIs = "This is ";
        String s1 = thisIs.concat("String1");
        assertThat(s1, is("This is String1"));

    }

    @Test
    public void convertingToAString() {

        String intConcatConvert = "" + 1;
        assertThat(intConcatConvert, is("1"));

        String integerIntConvert = Integer.toString(2);
        assertThat(integerIntConvert, is("2"));

        String integerStringConvert = String.valueOf(3);
        assertThat(integerStringConvert, is("3"));
    }

    @Test
    public void convertingFromAString() {
        assertThat(Integer.valueOf("2"), is(2));
        char[] cArray = {'2', '3'};
        assertThat("23".toCharArray(), is(cArray));
        assertThat(cArray.length, is(2));

        byte[] bArray = "hello there".getBytes();

    }

    @Test
    public void canConvertBytesUTF8() throws UnsupportedEncodingException {
        byte[] b8rray = "hello there".getBytes("UTF8");
    }

    @Test
    public void zeroLengthString() {
        String empty = new String();
        assertThat(empty.length(), is(0));
        char[] cArray = {'2', '3'};
        assertThat(new String(cArray), is("23"));
    }

    @Test
    public void compareToAndCompareToIgnoreCase() {
        String hello = "Hello";
        assertThat(hello.compareTo("Hello"), is(0));
        assertThat(hello.compareToIgnoreCase("hello"), is(0));
        assertThat(hello.compareTo("hello") < 0, is(true));
        assertThat(hello.compareTo("Helln") > 0, is(true));
    }

    @Test
    public void contains() {
        String hello = "Hello";
        assertThat(hello.contains("He"), is(true));
    }

    @Test
    public void contentEqualsAndEqualsAndEqualsIgnoreCaseAndstartswithAndendswith() {
        String hello = "Hello";
        String empty = "";
        assertThat(hello.contentEquals("Hello"), is(true));
        assertThat(hello.contentEquals("hello"), is(false));
        assertThat(hello.equals("Hello"), is(true));
        assertThat(hello.equalsIgnoreCase("HELLO"), is(true));
        assertThat(hello.startsWith("H"), is(true));
        assertThat(hello.endsWith("o"), is(true));
        assertThat(empty.isEmpty(), is(true));

    }



}
