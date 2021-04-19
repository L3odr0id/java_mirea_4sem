package com.company.PR2;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

public class PR2 {

    static List<Human> humans = List.of(
            new Human(74, "Name1", "Lastname1", LocalDate.of(1878, 12, 18), 70),
            new Human(56, "Name2", "Lastname2", LocalDate.of(1889, 4, 20), 50),
            new Human(90, "Name3", "Lastname3", LocalDate.of(1874, 11, 30), 95),
            new Human(63, "Name4", "Lastname4", LocalDate.of(1882, 1, 30), 77),
            new Human(61, "Name5", "Lastname5", LocalDate.of(1883, 7, 29), 66)
    );

    static Function<Human, Character> humanCharacterFunction = h -> h.getFirstname().charAt(1);

    public static void main(String[] args) {
        sortSecondLetter();
        filterByWeight();
        sortByAge();
        multiplyAllAges();
    }

    static void sortSecondLetter() {
        System.out.println("Сортировка по 2 букве имени: ");
        Stream<Human> stream = humans.stream().sorted(Comparator.comparing(humanCharacterFunction).reversed());
        printStream(stream);
    }

    static void filterByWeight() {
        System.out.println("\nФильтрация по весу больше чем 60: ");
        printStream(humans.stream().filter(human -> human.getWeight() > 60));
    }

    static void sortByAge() {
        System.out.println("\nСортировка по возрасту: ");
        Stream<Human> stream = humans.stream().sorted(Comparator.comparing(Human::getAge));
        printStream(stream);
    }

    static void multiplyAllAges() {
        System.out.println("\nПроизведение всех возрастов: ");
        int res = humans.stream().mapToInt(Human::getAge).reduce(1, (a, b) -> a * b);
        System.out.println(res);
    }

    static void printStream(Stream<Human> stream) {
        stream.forEach(System.out::println);
    }

}
