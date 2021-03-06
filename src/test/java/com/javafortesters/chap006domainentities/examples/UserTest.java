package com.javafortesters.chap006domainentities.examples;

import com.javafortesters.domainentities.interim.exceptions.custom.InvalidPassword;
import com.javafortesters.domainentities.User;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UserTest {

    @Test
    public void canConstructANewUser() {
        User user = new User();
    }

    @Test
    public void userHasDefaultUsernameAndPassword() {
        User user = new User();

        assertEquals("default username expected",
                "username",
                user.getUsername());

        assertEquals("default password expected",
                "password",
                user.getPassword());
    }

    @Test
    public void canConstructWithUsernameAndPassword() {
        User user = new User("admin", "pa55w0rD");

        assertEquals("given username expected",
                "admin",
                user.getUsername());

        assertEquals("given password expected",
                "pa55w0rD",
                user.getPassword());
    }

    @Test
    public void canSetPasswordAfterConstructed() throws InvalidPassword {
        User user = new User();
        user.setPassword("paZZwor6");

        assertEquals("setter password expected",
                "paZZwor6",
                user.getPassword());

    }
}
