/**
 * 4. Создать приложение, удовлетворяющее требованиям, приведенным в задании.
 * Наследование применять только в тех заданиях, в которых это логически обосновано.
 * Аргументировать принадлежность классу каждого создаваемого метода и корректно переопределить для каждого класса методы
 * equals(), hashCode(), toString().
 * Создать объект класса Щенок, используя классы Животное, Собака.
 * Методы: вывести на консоль имя, подать голос, прыгать, бегать, кусать.
 */
package chapter4.task4;

public class Main {

    public static void main(String[] args) {

        Puppy puppy = new Puppy("Charlie");

        System.out.println("Name: " + puppy.getName());
        System.out.println("Voice: " + puppy.getVoice());
        System.out.println("Jump: " + puppy.getJump());
        System.out.println("Run: " + puppy.getRun());
        System.out.println("Bite: " + puppy.getBite());
    }
}
