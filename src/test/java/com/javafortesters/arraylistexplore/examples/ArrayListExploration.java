package com.javafortesters.arraylistexplore.examples;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExploration {

    @Test
    public void checkingArraySize() {
        ArrayList<String> strings = new ArrayList<>();
        Assert.assertEquals(0, strings.size());
        strings.add("Hello");
        Assert.assertEquals(1, strings.size());
        strings.clear();
        Assert.assertEquals(0, strings.size());
    }

    @Test
    public void addingToArrayList() {
        List<String> strings = new ArrayList<>();
        fillUpArray(strings, 40);
        Assert.assertEquals(40, strings.size());
        Assert.assertEquals("String0", strings.get(0));
        Assert.assertEquals("String39", strings.get(39));
        strings.clear();
        Assert.assertEquals(0, strings.size());
        strings.add(0, "Waqas");
        strings.add(1, "Mahvish");
        strings.add(2, "Hadi");
        strings.add(3, "Zaynah");
        Assert.assertEquals(4, strings.size());
        Assert.assertEquals("Waqas", strings.get(0));
        Assert.assertEquals("Mahvish", strings.get(1));
        Assert.assertEquals("Hadi", strings.get(2));
        Assert.assertEquals("Zaynah", strings.get(3));

    }

    private void fillUpArray(List<String> strings, int howMany) {
        for (int x=0; x<howMany; x++) {
            strings.add("String"+x);
        }
    }


}
