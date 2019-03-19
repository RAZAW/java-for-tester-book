package com.javafortesters.chap14junitexplored;

import com.javafortesters.domainentities.interim.exceptions.custom.InvalidPassword;
import com.javafortesters.domainentities.interim.exceptions.custom.User;
import org.junit.*;
import org.junit.rules.ExpectedException;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

import static org.hamcrest.CoreMatchers.containsString;

public class JunitExplorationTest {

    @Rule
    public ExpectedException expected = ExpectedException.none();

    @Test
    public void invalidPasswordThrown()
            throws InvalidPassword {

        expected.expect(InvalidPassword.class);
        User user = new User("username", "<6");
    }

    @Test
    public void invalidPasswordThrownBecauseOfLength()
            throws InvalidPassword {

        expected.expect(InvalidPassword.class);
        expected.expectMessage("> 6 chars");
        User user = new User("username", "<6");
    }


    @Test
    public void invalidPasswordThrownBecauseOfLengthWithMatcher()
            throws InvalidPassword {

        expected.expect(InvalidPassword.class);
        expected.expectMessage(containsString("> 6 chars"));
        User user = new User("username", "<6");

    }

    @Ignore("This method is not part of this class")
    @Test
    public void arrayTechnicalTest() {
        int[] a = {4, 6, 2, 5, 9, 1};
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
    }

    @BeforeClass
    public static void runOncePerClassBeforeAnyTests() {
        System.out.println("@BeforeClass method");
    }

    @Before
    public void runBeforeEveryTestMethod() {
        System.out.println("@Before each method");
    }
}