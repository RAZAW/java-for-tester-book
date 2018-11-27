package com.javafortesters.chap009arraysandforloopiteration.examples;

import com.javafortesters.domainentities.User;
import org.junit.Test;


import java.util.Arrays;

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

}
