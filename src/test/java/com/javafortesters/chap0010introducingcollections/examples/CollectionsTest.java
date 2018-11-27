package com.javafortesters.chap0010introducingcollections.examples;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class CollectionsTest {

    @Test
    public void collectionMethod() {

        String[] someDays = {"Tuesday", "Thursday", "Wednesday", "Monday", "Friday"};
        List<String> days = Arrays.asList(someDays);

        //for each loop
        int forCount = 0;
        for (String day : days) {
            if (day.equals("Monday")) {
                break;
            }
            forCount++;
        }
        assertEquals("Monday is at position 3", 3, forCount);

        // for loop
        int loopCount;
        for (loopCount = 0; loopCount <= days.size(); loopCount++) {
            if (days.get(loopCount).equals("Monday")) {
                break;
            }
        }
        assertEquals("Monday is at position 3", 3, loopCount);

        //while loop
        int count = 0;
        while (!days.get(count).equals("Monday")) {
            count++;
        }
        assertEquals("Monday is at position", 3, count);

        //do while loop
        int doCount = -1;
        do {
            doCount++;
        } while (!days.get(doCount).equals("Monday"));
        assertEquals("Monday is at position 3", 3, doCount);
    }

    @Test
    public void loopingExercise() {

        String[] workdays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
        List<String> listDays = Arrays.asList(workdays);
        int count = 0;
        while (!listDays.get(count).equals("Friday")) {
            count++;
        }
        assertEquals("Friday is at index 4", 4, count);

        int countFor;
        for (countFor=0; !listDays.get(countFor).equals("Friday"); countFor++) {
            }
            assertEquals("Friday is st position 4", 4, countFor);
        }
    }


