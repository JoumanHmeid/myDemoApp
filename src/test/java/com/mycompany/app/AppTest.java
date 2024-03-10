package com.mycompany.app;

import junit.framework.Test;
import junit.framework.TestCase;
import org.junit.*;

import java.util.ArrayList;

public class AppTest extends TestCase{

 //@Test //(package org.junit) 
    public void testIntegerFrequency() {
         ArrayList<Integer> numbers = new ArrayList<Integer>();
    numbers.add(1);numbers.add(2);numbers.add(3);numbers.add(4);numbers.add(5);
    numbers.add(1);numbers.add(2);numbers.add(3);numbers.add(1);
        String text = "Hello World!";
        int numberToSearch = 1;
        char charToSearch = 'o';

        String expectedResult = "frequency of the character o : 2\nfrquency of the int 1 : 3";
        assertEquals(expectedResult, App.search(numbers, text, numberToSearch, charToSearch));
    }

//@Test // (package org.junit) 
    public void testNullArrayList() {
        ArrayList<Integer> numbers = null;
        String text = "Hello World!";
        int numberToSearch = 1;
        char charToSearch = 'o';

        assertEquals("null integer list", App.search(numbers, text, numberToSearch, charToSearch));
    }

  //@Test // (package org.junit) 
    public void testEmptyString() {
         ArrayList<Integer> numbers = new ArrayList<Integer>();
    numbers.add(1);numbers.add(2);numbers.add(3);numbers.add(4);numbers.add(5);
    numbers.add(1);numbers.add(2);numbers.add(3);numbers.add(1);
        String text = null;
        int numberToSearch = 1;
        char charToSearch = 'o';

        assertEquals("empty string", App.search(numbers, text, numberToSearch, charToSearch));
    }

//@Test //(package org.junit) 
    public void testNonexistentInteger() {
         ArrayList<Integer> numbers = new ArrayList<Integer>();
    numbers.add(1);numbers.add(2);numbers.add(3);numbers.add(4);numbers.add(5);
    numbers.add(1);numbers.add(2);numbers.add(3);numbers.add(1);
        String text = "Hello World!";
        int numberToSearch = 6;
        char charToSearch = 'o';

        assertEquals("frequency of the character o : 2\nfrquency of the int 6 : 0", App.search(numbers, text, numberToSearch, charToSearch));
    }

//@Test //(package org.junit) 
    public void testNonexistentCharacter() {
         ArrayList<Integer> numbers = new ArrayList<Integer>();
    numbers.add(1);numbers.add(2);numbers.add(3);numbers.add(4);numbers.add(5);
    numbers.add(1);numbers.add(2);numbers.add(3);numbers.add(1);
        String text = "Hello World!";
        int numberToSearch = 1;
        char charToSearch = 'x';

        assertEquals("frequency of the character x : 0\nfrquency of the int 1 : 3", App.search(numbers, text, numberToSearch, charToSearch));
    }
}
