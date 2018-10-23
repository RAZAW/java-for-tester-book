package com.javafortesters.chap008selectionsanddecisions.examples;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TernaryOperatorTest {

    @Test
    public void moreTernary() {
        String url;
        url = "www.eviltester.com";

        url = url.startsWith("http") ? url : addHttp(url);

        assertTrue(url.startsWith("http://"));
        assertEquals("http://www.eviltester.com", url);
    }

    private String addHttp(String url) {
        return "http://" + url;
    }

    @Test
    public void ternaryExercise() {
        int numberOfCats = 1;
        String answer = numberOfCats == 1 ? "cat" : "cats";
        assertEquals("cat", answer);
        assertEquals("2 == cats", "cats", catOrCats(2));
        assertEquals("1 == cat", "cat", catOrCats(1));
    }

    private String catOrCats(int number) {
        return number > 1 ? "cats" : "cat";

    }

    @Test
    public void ifAddHttp() {
        String url = "www.seleniumsimplified.com";
        if (!url.startsWith("http")) url = addHttp(url);

        assertTrue(url.startsWith("http://"));
        assertEquals("url matches", "http://www.seleniumsimplified.com", url);
    }

    //Exercises
    @Test
    public void singleLineIf() {
        boolean truthy = true;
        if (truthy = true) assertTrue(truthy);
    }

    @Test
    public void multiLineIf() {
        boolean truthy = true;
        if (truthy = true) {
            assertTrue(truthy);
            assertFalse(!truthy);
        }
    }

    @Test
    public void ifElseAddHttp() {
        String url = "www.seleniumsimplified.com";
        if (url.startsWith("http")) {
            // no need to do anything
        } else {
            url = addHttp("www.seleniumsimplified.com");
        }
        assertTrue(url.startsWith("http://"));
        assertEquals("url matches", "http://www.seleniumsimplified.com", url);
    }

    @Test
    public void ifAssertTrue() {
        boolean truthy = true;
        if (truthy = true) assertTrue(truthy);
        else
            assertFalse(truthy);
    }

    @Test
    public void ifElseAssertTrue() {
        boolean truthy = true;
        if (truthy = true) {
            assertTrue(truthy);
            assertFalse(!truthy);
        } else {
            assertFalse(truthy);
        }
    }

    @Test
    public void ifElseNestedAddHttp() {
        String url = "seleniumsimplified.com";
        if (url.startsWith("http")) {
            //do nothing as url is fine
        } else {
            if (!url.startsWith("www")) {
                url = "www." + url;
            }
            url = addHttp(url);
        }

        assertTrue(url.startsWith("http://"));
        assertEquals("http://www.seleniumsimplified.com", url);
    }

    @Test
    public void nestedIfElseHorror() {
        boolean truthy = true;
        boolean falsey = false;
        if (truthy) {
            if (!falsey) {
                if (truthy && !falsey) {
                    if (truthy || falsey) {
                        assertTrue(truthy);
                        assertFalse(falsey);
                    }
                }
            } else {
                assertTrue(truthy);
                assertFalse(falsey);
            }
        } else {
            if (!truthy) {
                if (falsey) {
                    assertTrue(falsey);
                    assertFalse(truthy);
                }
            } else {
                assertFalse(falsey);
                assertFalse(truthy);
            }
        }
    }

    private String switchStatementMethod(String shortCode) {

        String countryName;

        switch (shortCode.toUpperCase()) {
            case "UK":
                countryName = "United Kingdom";
                break;
            case "US":
            case "USA":
                countryName = "United States";
                break;
            case "FR":
                countryName = "France";
                break;
            case "SE":
                countryName = "Sweden";
                break;
            default:
                countryName = "Rest Of World";
                break;
        }
        return countryName;

    }

    @Test
    public void switchStatement() {
        assertEquals("United Kingdom", switchStatementMethod("UK"));
        assertEquals("United States", switchStatementMethod("USA"));
        assertEquals("United States", switchStatementMethod("US"));
        assertEquals("France", switchStatementMethod("FR"));
        assertEquals("Sweden", switchStatementMethod("SE"));
        assertEquals("Rest Of World", switchStatementMethod("OK"));
    }

    private String switchOnInt(int number) {
        String changeToString;

        switch (number) {
            case 1:
                changeToString = "One";
                break;
            case 2:
                changeToString = "Two";
                break;
            case 3:
                changeToString = "Three";
                break;
            case 4:
                changeToString = "Four";
                break;
                default:
                    if (number > 4) {
                        changeToString = "Too big";
                    } else {
                        changeToString = "Too small";
                    }
                    break;
        }
        return changeToString;
    }

    @Test
    public void switchOnIntUsage() {
        assertEquals("One", switchOnInt(1));
        assertEquals("Two", switchOnInt(2));
        assertEquals("Three", switchOnInt(3));
        assertEquals("Four", switchOnInt(4));
        assertEquals("Too big", switchOnInt(10));
        assertEquals("Too small", switchOnInt(0));
    }

}
