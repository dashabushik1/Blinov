/**
 * 4. Создать класс Park с внутренним классом, с помощью объектов которого можно хранить информацию об аттракционах,
 * времени их работы и стоимости.
 */
package chapter5.task4;

public class Main {

    public static void main(String[] args) {

        Park park = new Park();

        park.addAttraction("View wheel", "18.00 - 22.00", 4.50);
        park.addAttraction("Autodrome", "10.00 - 21.00", 4.50);
        park.addAttraction("Trampoline \"Springboard-1\"", "10.00 - 21.00", 1.50);
        park.addAttraction("Labyrinth", "14.00 - 20.00", 6.00);
        park.addAttraction("Zodiac", "12.00 - 18.00", 3.00);
        park.addAttraction("Mini-Jet", "11.00 - 15.00", 2.00);

        System.out.println(park.toString().replace("[", "")
                .replace("]", ""));
    }
}
