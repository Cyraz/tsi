package com.tsi.java.practical_three;

import java.util.*;
import java.util.stream.Collectors;

public class StreamExample {

    public static void main(String[] args) {
        // create a studentList
        List<Dog> dogs = new ArrayList<>();

        dogs.add(new Dog("A", 25));
        dogs.add(new Dog("B", 7));
        dogs.add(new Dog("C", 8));
        dogs.add(new Dog("D", 3));

        var maxAge = dogs.stream()
                .reduce((dog1, dog2) -> dog1.age > dog2.age ? dog1 : dog2)
                .get();

        System.out.println(maxAge);

        Set<String> set = new HashSet<>();

        set.add("Apple");
        set.add("Apple");
        set.add("Peaches");


        System.out.println(set);

        Map<String, String> map = new HashMap<>();

        map.put("class1", "Java");
        map.put("class2", "English");
        map.put("class3", "Physics");

        map.entrySet().stream()
                .map(entry -> entry.setValue(entry.getValue().toUpperCase(Locale.ROOT)))
                .forEach(System.out::println);

        System.out.println(map);

    }

    static void print(String st) {
        System.out.println(st);
    }
}
