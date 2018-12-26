package com.javafortesters.chap0010introducingcollections.examples;

import com.javafortesters.domainentities.User;
import org.junit.Test;
import java.util.List;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TestList {

    @Test
    public void getElementAtAnIndex() {
        List<String> days = new ArrayList<String>();
        days.add("Monday");
        days.add("Tuesday");
        days.add("Wednesday");

        assertEquals(3, days.size());
        assertFalse(days.isEmpty());

        assertEquals("Monday", days.get(0));
        assertEquals("Tuesday", days.get(1));
        assertEquals("Wednesday", days.get(2));

        days.remove(1);
        assertEquals("Wednesday", days.get(1));
        assertEquals(2, days.size());

    }

    @Test
    public void addAnElementAtASpecificIndex() {
        List<String> days = new ArrayList<String>();
        days.add("Tuesday");
        days.add("Thursday");
        days.add("Saturday");

        days.add(0,"Monday");
        days.add(2, "Wednesday");
        days.add(4, "Friday");
        days.add(6, "Sunday");

        assertEquals(7, days.size());
        assertEquals("Saturday", days.get(5));

    }

    @Test
    public void listOfUsers() {
        List<User> users = new <User>ArrayList();
        User bob = new User("bob", "passwordtest");
        User eris = new User("eris", "passwordbest");

        users.add(bob);
        assertEquals(1, users.size());
        users.add(0, eris);
        assertEquals(2, users.size());
        assertEquals(0, users.indexOf(eris));
        assertEquals(1, users.indexOf(bob));
        users.remove(0);
        assertTrue(users.size()==1);
        assertEquals(0, users.indexOf(bob));

    }
}
