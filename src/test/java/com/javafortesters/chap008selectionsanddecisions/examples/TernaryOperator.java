package com.javafortesters.chap008selectionsanddecisions.examples;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TernaryOperator {

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
        String answer = numberOfCats == 1? "cat" : "cats";
        assertEquals("cat", answer);
        assertEquals("cats", catOrCats(2));
        assertEquals("cat", catOrCats(1));
    }

    private String catOrCats(int number) {
        return  number>1? "cats":"cat";

    }
}
