package com.junyeong.yu.prototype.design_pattern.java8;

import java.util.*;
import java.util.stream.Collectors;

public class LambdaDemo {
    private static class Person {

        public Person(String id, String firstName, String lastName, int age) {
            this.id = id;
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
        }

        private String id;
        private String firstName;
        private String lastName;
        private int age;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("1", "Junyeong", "Yu", 30));
        persons.add(new Person("2", "Gow", "Tham", 15));
        persons.add(new Person("3", "Adam", "Thomas", 30));

        String result = persons.stream()
                .filter(person -> person.getAge() > 20)
                .map(Person::getLastName)
                .collect(
                        Collectors.joining(", ")
                );
        System.out.println(result);

        //Optional<Person> opt = persons.stream().max(Comparator.comparing());

    }
}
