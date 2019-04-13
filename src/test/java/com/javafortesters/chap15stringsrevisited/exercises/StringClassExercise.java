package com.javafortesters.chap15stringsrevisited.exercises;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class StringClassExercise {

    @Test
    public void stringStringConstruction() {
        String someThing = "Waqas";
        assertThat(someThing.concat(" Raza"), equalTo("Waqas Raza"));
    }

    @Test
    public void stringCharConstruction() {
        char[] charWillChange = {'1', '2', '3'};
        assertThat(new String(charWillChange), is("123"));
    }

    @Test
    public void stringbyteConstruction() {
        byte[] byteWillChange = "hello there".getBytes();
        assertThat(new String(byteWillChange, 3, 3), is("lo"));
    }
}