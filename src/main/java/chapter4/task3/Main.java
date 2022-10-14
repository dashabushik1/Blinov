/**
 * 3. Создать приложение, удовлетворяющее требованиям, приведенным в задании.
 * Наследование применять только в тех заданиях, в которых это логически обосновано.
 * Аргументировать принадлежность классу каждого создаваемого метода и корректно переопределить для каждого класса методы
 * equals(), hashCode(), toString().
 * Создать объект класса Планета, используя классы Материк, Океан, Остров.
 * Методы: вывести на консоль название материка, планеты, количество материков.
 */
package chapter4.task3;

public class Main {

    public static void main(String[] args) {

        Planet planet = new Planet("Earth");

        planet.addContinent(new Continent("Eurasia"));
        planet.addContinent(new Continent("Africa"));
        planet.addContinent(new Continent("North America"));
        planet.addContinent(new Continent("South America"));
        planet.addContinent(new Continent("Australia"));
        planet.addContinent(new Continent("Antarctica"));

        planet.addOcean(new Ocean("Atlantic Ocean"));
        planet.addOcean(new Ocean("Pacific Ocean"));
        planet.addOcean(new Ocean("Indian Ocean"));
        planet.addOcean(new Ocean("Arctic Ocean"));

        System.out.println("Name of continent: " + planet.getContinents().get(3).getName());
        System.out.println("Name of planet: " + planet.getName());
        System.out.println("Number of continents: " + planet.getContinents().size());
    }
}
