package labb.upg.ett;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static List<Person> personList = new ArrayList<>();

    public static void main(String[] args) {
        personList.add(new Person("Ulla", "f", 29000));
        personList.add(new Person("Olof", "m", 27000));
        personList.add(new Person("Krille", "m", 28800));
        personList.add(new Person("Josefin", "f", 57000));
        personList.add(new Person("Jonas", "m", 43000));
        personList.add(new Person("Lena", "f", 31750));
        personList.add(new Person("Fia", "f", 55300));
        personList.add(new Person("Eva", "f", 33000));
        personList.add(new Person("Uffe", "m", 87000));
        personList.add(new Person("Otto", "m", 25000));

        Map<String, Double> average;
        average = personList.stream()
                .collect(Collectors.groupingBy(Person::getGender, Collectors.averagingDouble(Person::getSalary)));
        System.out.println(average);

        Optional<Person> max = personList.stream().max(Comparator.comparing(Person::getSalary));
        System.out.println(max.get().getName() + " Tjänar mest " + max.get().getSalary());
        Optional<Person> min = personList.stream().min(Comparator.comparing(Person::getSalary));
        System.out.println(min.get().getName() + " Tjänar minst " + min.get().getSalary());
    }
}
