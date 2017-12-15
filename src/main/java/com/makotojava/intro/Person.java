package com.makotojava.intro;
import java.util.logging.Logger;

/**
 * Created by a6042895 on 12/8/17.
 */
public class Person {
    public static Logger l = Logger.getLogger(Person.class.getName());
    private String name;
    private int age;
    private int height;
    private int weight;
    private String eyeColor;
    private String gender;
    public Person(){
        // Nothing to do
    }
    public Person(String name, int age, int height, int weight, String eyeColor, String gender){
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.eyeColor = eyeColor;
        this.gender = gender;
    }
    public static void main( String[] args )
    {
        Person Luna = new Person("luna", 26, 158, 53, "brown", "female");
        l.info("Luna Person is created");
    }
}
