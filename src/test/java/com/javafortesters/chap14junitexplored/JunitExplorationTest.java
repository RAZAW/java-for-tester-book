package com.javafortesters.chap14junitexplored;

import com.javafortesters.domainentities.interim.exceptions.custom.InvalidPassword;
import com.javafortesters.domainentities.interim.exceptions.custom.User;
import org.junit.*;
import org.junit.rules.ExpectedException;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

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

    @Test
    public void allAssertsMethod() {

        int a = 5;
        int b = 4;

        int c [] = new int[] {1, 2, 3, 4, 5};
        int d [] = new int[] {1, 2, 3, 4, 5};

        String age = null;

        assertEquals("5 + 4 = 9", 9, a + b);
        assertFalse(a + b != 9);
        assertTrue(a + b == 9);
        assertArrayEquals(c, d);
        assertNotNull("check actual is not null", a);
        assertNotSame("check actual and expected are not same", a, b);
        assertNull("check actual is null", age);
        assertSame("check expected and actual are same", a, b + 1);


    }

    @Test
    public void assertThatMethod() {

        int a = 5;
        int b = 4;

        int c [] = new int[] {1, 2, 3, 4, 5};
        int d [] = new int[] {1, 2, 3, 4, 5};

        String age = null;
        String city = "High Wycombe";

        assertThat(a + b, equalTo(9));
        assertThat(a + b, not(10));
        assertThat(a + b, is(9));
        assertThat(c, is(equalTo(d)));
        assertThat(b, notNullValue());
        assertThat(a, is(not(equalTo(b))));
        assertThat(age, nullValue());
        assertThat(city, startsWith("High"));

    }

}