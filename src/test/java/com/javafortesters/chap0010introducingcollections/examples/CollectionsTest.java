package com.javafortesters.chap0010introducingcollections.examples;

import org.junit.Test;

import java.util.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

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
        for (countFor = 0; !listDays.get(countFor).equals("Friday"); countFor++) {
        }
        assertEquals("Friday is st position 4", 4, countFor);
    }

    @Test
    public void familyCollection() {

        String[] razas = {"Waqas", "Mahvish", "Hadi", "Zaynmah"};
        assertEquals(4, razas.length);
        List<String> razasList = Arrays.asList(razas);
        int counter = 0;
        for (String rl : razasList) {
            if (rl.equals("Hadi")) {
                break;
            }
            counter++;
        }
        assertEquals("Hadi", razasList.get(counter));
        assertEquals(2, counter);
    }

    @Test
    public void carsCollection() {
        String[] cars = {"Bentley", "Mercedes", "BMW"};
        assertEquals(3, cars.length);
        List<String> carsList = Arrays.asList(cars);
        int county = 0;
        for (String car : carsList) {
            if (car.equalsIgnoreCase("mercedes")) ;
            break;
        }
        county++;
        assertTrue(county == 1);
        assertEquals("Mercedes", carsList.get(1));

    }

    @Test
    public void planetsAsList() {
        List<String> planets = new <String>ArrayList();
        assertTrue(planets.isEmpty());
        assertTrue(planets.size()==0);
        planets.add(0, "Mercury");
        planets.add(1, "Venus");
        planets.add(2, "Earth");
        planets.add(3, "Mars");
        assertEquals(4, planets.size());
        assertEquals("Earth", planets.get(2));
        planets.remove(2);
        assertEquals(3, planets.size());


    }

    @Test
    public void hashMapTest() {
        Map<Integer, String> ages = new HashMap<>();
        ages.put(32, "Waqas");
        ages.put(26, "Mahvish");
        ages.put(5, "Hadi");
        ages.put(1, "Zaynah");

        assertEquals(4, ages.size());
        assertEquals("Waqas", ages.get(32));
        assertTrue(ages.containsValue("Mahvish"));
        assertTrue(!ages.isEmpty());

    }

    @Test
    public void setTest() {
        Set weekdays = new HashSet();
        weekdays.add("Monday");
        weekdays.add("Tuesday");
        weekdays.add("Wednesday");
        weekdays.add("Thursday");
        weekdays.add("Friday");

        assertEquals(5, weekdays.size());
        assertTrue(weekdays.contains("Wednesday"));
    }

    @Test
    public void listTest() {
        List<String> family = new ArrayList<String>();
        family.add(0, "Dad");
        family.add(1, "Mum");
        assertTrue(!family.isEmpty());
        assertEquals(2, family.size());
        assertEquals("Dad", family.get(0));

    }

    @Test
    public void collectionTest() {
        Collection<String> friends = new ArrayList<>();
        friends.add("Haider");
        friends.add("Usman");
        friends.add("Omair");
        friends.add("Shoaib");
        friends.add("Abdul");

        assertTrue(!friends.isEmpty());
        assertEquals(5, friends.size());
        assertEquals(true, friends.contains("Omair"));
    }

    @Test
    public void canFillAList() {
        List<String> strings= new ArrayList<>();
        fillList(strings, 40);
    }

    private void fillList(List<String> strings, int howmany) {
        for (int x=0; x<howmany; x++) {
            strings.add("String"+x);
        }
    }
}


