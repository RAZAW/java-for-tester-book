package com.javafortesters.chap13moreaboutexceptions.examples;

import com.javafortesters.domainentities.interim.exceptions.custom.InvalidPassword;
import com.javafortesters.domainentities.User;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class ExceptionTestClass {

    @Test(expected = InvalidPassword.class)
    public void constructUserWithException() throws InvalidPassword {
        User aUser = new User("username", "p");

    }

    @Test(expected = InvalidPassword.class)
    public void createDefaultUserWithNoThrowsInvalidPasswordException() throws InvalidPassword {
        User aUser = new User();
        assertEquals("password", aUser.getPassword());

    }

    @Test
    public void createUserWithInvalidPasswordExceptionMessages() throws InvalidPassword{
        User aUser;
        aUser = new User("username", "p");
        fail("An invalid password exceptions should have been thrown");
    }

    @Test
    public void setPasswordWithInvalidPasswordExceptionMessages() throws InvalidPassword {
        User aUser = new User();

        aUser.setPassword("tiny");
        fail("An invalid password exception should have been thrown");

    }


}
