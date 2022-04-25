package labTest2;

import java.util.ArrayList;

public class Person {
    private String name,occupation;
    private int age;
    private char gender;
    boolean frontLiner;
    private ArrayList<Person> occupation_list = new ArrayList<Person>();

    //constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //constructor
    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    //constructor
    public Person(String name, String occupation, int age, char gender) {
        this.name = name;
        this.occupation = occupation;
        this.age = age;
        this.gender = gender;
    }

    //constructor
    public Person(String name, String occupation, int age, char gender, boolean frontLiner) {
        this.name = name;
        this.occupation = occupation;
        this.age = age;
        this.gender = gender;
        this.frontLiner = frontLiner;
    }

    //constructor
    public Person(String name, String occupation, int age, char gender, boolean frontLiner, ArrayList<Person> occupation_list) {
        this.name = name;
        this.occupation = occupation;
        this.age = age;
        this.gender = gender;
        this.frontLiner = frontLiner;
        this.occupation_list = occupation_list;
    }


    public void setFrontLiner(boolean frontLiner) {
        this.frontLiner = frontLiner;
    }
}
