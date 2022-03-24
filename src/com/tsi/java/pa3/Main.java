package com.tsi.java.pa3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();

        personList.add(new Person("Jon", 22));
        personList.add(new Person("Paul", 19));
        personList.add(new Person("Mithun", 23));
        personList.add(new Person("Lucas", 23));
        personList.add(new Person("Edgars", 25));
        personList.add(new Person("Alksi", 26));
        personList.add(new Person("Yoon", 25));
        personList.add(new Person("Yoon", 25));

        // group all person based on age
        // 23(Mithun, lucas) 25(alksi, yoon)

       var updatedList =  personList.stream()
                .collect(Collectors.groupingBy(Person::getAge));

        System.out.println(updatedList);

    }
}
