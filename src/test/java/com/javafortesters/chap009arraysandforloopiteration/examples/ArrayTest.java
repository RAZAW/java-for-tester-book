package com.javafortesters.chap009arraysandforloopiteration.examples;

import com.javafortesters.domainentities.User;
import org.junit.Test;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

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
        String alias = "";

        for (User user : users) {
            alias = user.getUsername();
            System.out.println(alias);

        }
    }

    @Test
    public void arrayWorkdayTest() {
        String[] workdays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
        String days = "";
        for (String workday : workdays) {
            days = days + "|" + workday;
        }

        assertEquals("|Monday|Tuesday|Wednesday|Thursday|Friday", days);
    }

    @Test
    public void traditionalForLoop() {
        String[] workdays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
        String days = "";

        for (int i = 0; i < workdays.length; i++) {
            days = days + "|" + i + "-" + workdays[i];
        }

        assertEquals("|0-Monday|1-Tuesday|2-Wednesday|3-Thursday|4-Friday", days);
    }

    @Test
    public void createAnArrayOf100Users() {
        User[] users = new User[100];
        for (int userIndex = 0; userIndex < users.length; userIndex++) {
            int userId = userIndex + 1;
            users[userIndex] = new User("user" + userId, "password" + userId);
        }
        assertEquals(100, users.length);

        for (User aUser : users) {
            System.out.println(aUser.getUsername() + "," + aUser.getPassword());
        }

        int userID = 1;
        for (User aUser : users) {
            assertEquals("user" + userID, aUser.getUsername());
            assertEquals("password" + userID, aUser.getPassword());
            userID++;
        }

        assertEquals(101, userID);

    }

    @Test
    public void sortTheArray() {

        String[] workdays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};

        Arrays.sort(workdays);

        assertEquals("Friday", workdays[0]);
        assertEquals("Monday", workdays[1]);
        assertEquals("Thursday", workdays[2]);
        assertEquals("Tuesday", workdays[3]);
        assertEquals("Wednesday", workdays[4]);
    }

    @Test
    public void sortDifferentCaseArray() {

        String[] workdays = {"monday", "Tuesday", "Wednesday", "thursday", "Friday"};

        Arrays.sort(workdays);

        assertEquals("Friday", workdays[0]);
        assertEquals("Tuesday", workdays[1]);
        assertEquals("Wednesday", workdays[2]);
        assertEquals("monday", workdays[3]);
        assertEquals("thursday", workdays[4]);
    }

    @Test
    public void sortOutNumbers() {
        int[] numbers = {1, 5, 6, 4, 2};
        assertEquals(5, numbers.length);
        assertEquals(5, numbers[1]);
        Arrays.sort(numbers);
        assertEquals(2, numbers[1]);
    }


    @Test
    public void createTriangle2dArray() {

        int[][] triangle = new int[16][];

        for (int row=0; row<triangle.length; row++) {
            triangle[row] = new int[row+1];
                for (int i=0; i<(row+1); i++) {
                    triangle[row][i] = i;
                }
        }
        print2DIntArray(triangle);
    }

    public void print2DIntArray(int [][]multi) {
        for (int[] outer : multi) {
            if (outer==null) {
                System.out.print("null");
            } else {
                for (int inner : outer) {
                    System.out.print(inner + ",");
                }
            }

            System.out.println("");
        }
    }

    @Test
    public void collectoinInterface() {
        Collection workdays;
        workdays = new ArrayList();
        workdays.add("Monday");
        workdays.add("Tuesday");
        workdays.add("Wednesday");
        workdays.add("Thursday");
        workdays.add("Friday");
        assertEquals(5, workdays.size());

        Collection<String> daysOfWeek = new <String>ArrayList();
        Collection<Integer> ages = new ArrayList<>();
        assertEquals(0, daysOfWeek.size());
        assertEquals(0, ages.size());

        daysOfWeek.addAll(workdays);
        assertEquals(daysOfWeek.size(), workdays.size());
        assertTrue(daysOfWeek.containsAll(workdays));
        Collection<String> weekendDays = new <String>ArrayList();
        weekendDays.add("Saturday");
        weekendDays.add("Funday");
        assertEquals(2, weekendDays.size());
        assertTrue(weekendDays.contains("Saturday"));
        weekendDays.remove("Funday");
        assertFalse(weekendDays.contains("Funday"));
        weekendDays.add("Sunday");
        assertEquals(2, weekendDays.size());
        assertTrue("Bug fixed, Sunday in collection now", weekendDays.contains("Sunday"));

        daysOfWeek.addAll(weekendDays);
        assertTrue(daysOfWeek.containsAll(weekendDays));

        for (String dayOfWeek : daysOfWeek) {
            System.out.println(dayOfWeek);
        }

        assertEquals(7, daysOfWeek.size());
        daysOfWeek.clear();
        assertEquals(0, daysOfWeek.size());
        assertTrue(daysOfWeek.isEmpty());
    }

    @Test
    public void collectionOfUsers() {
        Collection<User> userCollection = new <User>ArrayList();
        assertEquals(0, userCollection.size());
        assertTrue(userCollection.isEmpty());
        User firstUser = new User("waqas", "gold");
        User secondUser = new User("mahvish", "silver");
        userCollection.add(firstUser);
        userCollection.add(secondUser);
        assertEquals(2, userCollection.size());
        assertFalse(userCollection.isEmpty());

        Collection<User> anotherUserCollection = new <User>ArrayList();
        User thirdUser = new User("hadi", "platinum");
        User fourthUser = new User("zaynah", "diamond");
        anotherUserCollection.add(thirdUser);
        anotherUserCollection.add(fourthUser);
        userCollection.addAll(anotherUserCollection);
        assertEquals(4, userCollection.size());
        assertTrue(userCollection.containsAll(anotherUserCollection));
        anotherUserCollection.removeAll(userCollection);
        assertEquals(0, anotherUserCollection.size());
        userCollection.clear();
        assertTrue(userCollection.isEmpty());



    }

}
