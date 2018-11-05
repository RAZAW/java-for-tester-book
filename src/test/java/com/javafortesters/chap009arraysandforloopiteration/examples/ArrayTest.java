package com.javafortesters.chap009arraysandforloopiteration.examples;

import com.javafortesters.domainentities.User;
import org.junit.Test;


import static org.junit.Assert.assertEquals;

public class ArrayTest {

    @Test
    public void createAnArrayOfUsers() {

        User[] users = new User[3];
        users[0] = new User("bob", "ba55Word");
        users[1] = new User("eris", "ea55Word");
        users[2] = new User("ken", "ka55Word");

        assertEquals("bob", users[0].getUsername());
        assertEquals("eris", users[1].getUsername());
        assertEquals("ken", users[2].getUsername());
    }
}
