package com.contour;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

enum Gender {
    MALE, FEMALE
}

class Person {
    private String name;
    private int age;
    private Gender gender;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }

    public Person(String name, int age, Gender gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }
}

public class Main {

    public static void main(String[] args) {
	// write your code here

        List<Person> people = getPeople();

        // Imperative approach means doing stuff using loops and stuff.
        // Declarative Approach means using streams.

        // Filtering using streams
        System.out.println("------------ Filtering using streams ------------");
        List<Person> females = people.stream()
                .filter(person -> person.getGender().equals(Gender.FEMALE))
                .collect(Collectors.toList());
        females.forEach(System.out::println);
        System.out.println();

        // Sorting stuff Ascending
        System.out.println("------------ Sorting stuff Ascending ------------");
        List<Person> sortedWithAge = people.stream()
                .sorted(Comparator.comparing(Person::getAge))
                .collect(Collectors.toList());
        sortedWithAge.forEach(System.out::println);
        System.out.println();

        // Sorting stuff Descending
        System.out.println("------------ Sorting stuff Descending ------------");
        List<Person> sortedWithAgeDescending = people.stream()
                .sorted(Comparator.comparing(Person::getAge).reversed())
                .collect(Collectors.toList());
        sortedWithAgeDescending.forEach(System.out::println);
        System.out.println();

        // All Match Ex. Everyone in this list that has an age greater than 50
        System.out.println("------------ All Match ------------");
        boolean allMatchExample = people.stream()
                .allMatch(person -> person.getAge() > 5);
        System.out.println(allMatchExample);
        System.out.println();

        // All Match Ex. Everyone in this list that has an age greater than 5
        System.out.println("------------ Any Match ------------");
        boolean anyMatchExample = people.stream()
                .anyMatch(person -> person.getAge() > 120);
        System.out.println(anyMatchExample);
        System.out.println();

        // All Match Ex. Everyone in this list that has an age greater than 5
        System.out.println("------------ None Match ------------");
        boolean noneMatchExample = people.stream()
                .noneMatch(person -> person.getName().equals("John"));
        System.out.println(noneMatchExample);
        System.out.println();

        // Max
        System.out.println("------------ Max ------------");
        people.stream()
                .max(Comparator.comparing(Person::getAge))
                .ifPresent(System.out::println);
        System.out.println();

        // Min
        System.out.println("------------ Min ------------");
        people.stream()
                .min(Comparator.comparing(Person::getAge))
                .ifPresent(System.out::println);
        System.out.println();

        // Grouping
        System.out.println("------------ Grouping ------------");
        Map<Gender, List<Person>> groupByGender = people.stream()
                .collect(Collectors.groupingBy(Person::getGender));
        groupByGender.forEach((gender, people1) -> {
            System.out.println(gender);
            people1.forEach(System.out::println);
            System.out.println();
        });

        // Example: out of all females, print the name of female with the lowest age.
        System.out.println("------------ Example ------------");
        Optional<String> youngestFemaleAge = people.stream()
                .filter(person -> person.getGender().equals(Gender.FEMALE))
                .min(Comparator.comparing(Person::getAge))
                .map(Person::getName);
        youngestFemaleAge.ifPresent(System.out::println);
        System.out.println();
    }

    public static List<Person> getPeople() {
        return List.of(
                new Person("Osama Khan", 23, Gender.MALE),
                new Person("Fatima Khan", 10, Gender.FEMALE),
                new Person("Hadi Rehman", 25, Gender.MALE),
                new Person("Alina Khan", 67, Gender.FEMALE),
                new Person("Uzair Shah", 45, Gender.MALE),
                new Person("Zeb Khan", 83, Gender.FEMALE),
                new Person("Usman Khan", 102, Gender.MALE),
                new Person("Anar Gul", 96, Gender.MALE)
        );
    }

}


















