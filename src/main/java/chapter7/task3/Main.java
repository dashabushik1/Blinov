/**
 * 3. Написать класс Пользователь с полями: id, имя, возраст, страна. Создать массив Пользователей.
 * Отсортировать по стране и возрасту. Выбрать всех Пользователей, старше заданного возраста,
 * первая буква имени у которых начинается с заданной буквы. Получить максимальный и минимальный элемент
 * в сгруппированном результате по возрасту.
 */
package chapter7.task3;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        User[] users = new User[]{
                new User(1L, 27, "John", "United States"),
                new User(2L, 34, "Mary", "Canada"),
                new User(3L, 41, "Liam", "Sweden"),
                new User(4L, 37, "Olivia", "Sweden"),
                new User(5L, 25, "Sarah", "Germany"),
                new User(6L, 32, "Ellie", "United States"),
                new User(7L, 36, "Michael", "Sweden"),
                new User(8L, 29, "Charles", "Canada"),
                new User(9L, 23, "Rick", "Germany"),
                new User(10L, 30, "Melissa", "Canada"),
                new User(11L, 45, "Erick", "Sweden")
        };

        System.out.println("Unsorted users: ");
        for (User user : users) {
            System.out.println(user);
        }

        // cортировка пользователей по стране и возрасту с помощью Comparator
        System.out.println(""); // либо нужна сортировка сразу по одной выбранной стране, потом по возрасту по выбранной стране?
        System.out.println("Sorted users by country and age: ");
        Arrays.stream(users)
                .sorted(Comparator.comparing(User::getCountry)
                        .thenComparingInt(User::getAge))
                .forEach(System.out::println);

        // выбранные пользователи по возрасту и первой букве имени с помощью промежуточного метода filter
        System.out.println("");
        System.out.println("Users over the age of 30 whose names begin with the letter M: ");
        List<User> usersByGivenAgeAndFirstLetterOfName = Arrays.stream(users)
                .filter(u -> u.getAge() >= 30 &&
                        u.getName().startsWith("M"))
                .collect(Collectors.toList());
        for (User user : usersByGivenAgeAndFirstLetterOfName) {
            System.out.println(user);
        }

        // находим максимальный и минимальный элементы в сгруппированной группе по возрасту
        System.out.println(""); // todo max element
        Optional<User> minElement = usersByGivenAgeAndFirstLetterOfName
                .stream()
                .findFirst();
        System.out.println("Min element: " + minElement.get().getName() + ", " + minElement.get().getAge());
    }
}
