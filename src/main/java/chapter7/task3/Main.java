/**
 * 3. Написать класс Пользователь с полями: id, имя, возраст, страна. Создать массив Пользователей.
 * Отсортировать по стране и возрасту. Выбрать всех Пользователей, старше заданного возраста,
 * первая буква имени у которых начинается с заданной буквы. Получить максимальный и минимальный элемент
 * в сгруппированном результате по возрасту.
 */
package chapter7.task3;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        User[] users = new User[]{
                new User(1, 27, "John", "United States"),
                new User(2, 34, "Mary", "Canada"),
                new User(3, 41, "Liam", "Sweden"),
                new User(4, 37, "Olivia", "Sweden"),
                new User(5, 25, "Sarah", "Germany"),
                new User(6, 32, "Ellie", "United States"),
                new User(7, 36, "Michael", "Sweden"),
                new User(8, 29, "Charles", "Canada"),
                new User(9, 23, "Rick", "Germany"),
                new User(10, 30, "Melissa", "Canada"),
                new User(11, 45, "Erick", "Sweden")
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
        User[] filteredUsers = Arrays.stream(users)
                .filter(u -> u.getAge() >= 30 &&
                        u.getName().startsWith("M"))
                .toArray(User[]::new);
        for (User user : filteredUsers) {
            System.out.println(user);
        }

        // находим максимальный и минимальный элементы в сгруппированной группе по возрасту
        System.out.println("");
        System.out.println("Min element: " + filteredUsers[0] + "\nMax element: " +
                filteredUsers[filteredUsers.length - 1]);

    }
}
