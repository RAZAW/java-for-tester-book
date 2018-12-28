package com.javafortesters.chap0010introducingcollections.examples;

import com.javafortesters.domainentities.User;
import org.junit.Test;

import java.util.*;

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

    @Test
    public void hashExampleMethod() {
        Set workdays = new HashSet();
        workdays.add("Monday");
        workdays.add("Tuesday");
        workdays.add("Wednesday");
        workdays.add("Thursday");
        workdays.add("Friday");

        assertTrue(!workdays.isEmpty());
        assertEquals(5, workdays.size());
    }

    @Test
    public void setOfUsers() {
        Set<User> setUser = new <User>HashSet();
        User setUserOne = new User("alcapone", "password");
        setUser.add(setUserOne);
        setUser.add(setUserOne);
        assertEquals(1, setUser.size());

    }

    @Test
    public void mapPlayMethod() {
        Map<String, String> mapa = new <String, String>HashMap();
        mapa.put("key1", "value1");
        mapa.put("key2", "value2");
        mapa.put("key3", "value3");

        assertEquals(3, mapa.size());
        assertEquals("value1", mapa.get("key1"));

        mapa.put("key1", "newvalue1");
        assertEquals("newvalue1", mapa.get("key1"));

        mapa.remove("key1");
        assertEquals(2, mapa.size());

        assertTrue(mapa.containsKey("key2"));
        assertTrue(mapa.containsValue("value3"));

        mapa.clear();
        assertEquals(0, mapa.size());
        assertTrue(mapa.isEmpty());

    }

    @Test
    public void mapOfUsers() {
        Map<String, User> mapz = new HashMap<String, User>();

            User userone = new User("waqas", "password");
            User usertwo = new User("raza", "password");

            mapz.put(userone.getUsername(), userone);
            mapz.put(userone.getUsername(), usertwo);

            assertEquals(1, mapz.size());
            assertEquals("waqas", userone.getUsername());

            /**
            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean containsKey(Object key) {
                return false;
            }

            @Override
            public boolean containsValue(Object value) {
                return false;
            }

            @Override
            public User get(Object key) {
                return null;
            }

            @Override
            public User put(String key, User value) {
                return null;
            }

            @Override
            public User remove(Object key) {
                return null;
            }

            @Override
            public void putAll(Map<? extends String, ? extends User> m) {

            }

            @Override
            public void clear() {

            }

            @Override
            public Set<String> keySet() {
                return null;
            }

            @Override
            public Collection<User> values() {
                return null;
            }

            @Override
            public Set<Entry<String, User>> entrySet() {
                return null;
            }

            */
        }
    }



