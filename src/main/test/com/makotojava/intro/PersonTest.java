package com.makotojava.intro;

import org.junit.Test;

import java.util.logging.Logger;

import static org.junit.Assert.*;

public class PersonTest {
    @Test
    public void testPerson(){
        Person p = new Person("Luna Feng", 26, 158, 53, "Brown", "FEMALE");
        Logger l = Logger.getLogger(Person.class.getName());
        l.info("Name: " + p.getName());
        l.info("Age: " + p.getAge());
        l.info("Height (cm): " + p.getHeight());
        l.info("Weight (kg): " + p.getWeight());
        l.info("Eye Color: " + p.getEyeColor());
        l.info("Gender: " + p.getGender());
        assertEquals("Luna Feng", p.getName());
        assertEquals(26, p.getAge());
        assertEquals(158, p.getHeight());
        assertEquals(53, p.getWeight());
        assertEquals("Brown", p.getEyeColor());
        assertEquals("FEMALE", p.getGender());
    }

}