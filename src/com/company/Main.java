package com.company;

public class Main {

    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person("AVA", 70, 190);
        System.out.println("Information about first person:" + "age = " + person1.getAge() + " name = " + person1.getName() + " height = " + person1.getHeight() + " and perfect weight is " + person1.perfectWeight(person1.getAge(), person1.getHeight()));
        System.out.println("Information about second person:" + "age = " + person2.getAge() + " name = " + person2.getName() + " height = " + person2.getHeight() + " and perfect weight is " + person2.perfectWeight(person2.getAge(), person2.getHeight()));
    }

}

class Person {
    private int age;
    private String name;
    private int weight;

    public Person() {
        this.age = 24;
        this.name = "ADA";
        this.weight = 170;
        System.out.println("You create new human with constructor");
    }

    public Person(String name, int age, int height) {
        this.name = name;
        this.age = age;
        this.weight = height;
    }

    public double perfectWeight(int age, int heigth) {

        return 50 + 0.75 * (weight - 150) + (age - 20) / 4;
    }


    public void setAge(int age) {

        this.age = age;
    }

    public int getAge() {

        return age;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getName() {

        return name;
    }

    public void setHeight(int height) {

        this.weight = height;
    }

    public int getHeight() {

        return weight;
    }
}