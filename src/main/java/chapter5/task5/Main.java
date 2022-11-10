/**
 * 5. Создать класс Mobile с внутренним классом, с помощью объектов которого
 * можно хранить информацию о моделях телефонов и их свойствах.
 */
package chapter5.task5;

public class Main {

    public static void main(String[] args) {

        Mobile mobile = new Mobile();

        Mobile.Brand brandOne = Mobile.Brand.APPLE;
        Mobile.Brand brandTwo = Mobile.Brand.BLACKBERRY;
        Mobile.Brand brandThree = Mobile.Brand.SAMSUNG;

        System.out.println("Mobiles from " + brandOne + " company: " +
                mobile.findMobilesFromOneBrand(brandOne).toString().replace("[", "")
                        .replace("]", ""));

        System.out.println("-----------------------------");
        System.out.println("Mobiles from " + brandTwo + " company: " +
                mobile.findMobilesFromOneBrand(brandTwo).toString().replace("[", "")
                        .replace("]", ""));

        System.out.println("-----------------------------");
        System.out.println("Mobiles from " + brandThree + " company: " +
                mobile.findMobilesFromOneBrand(brandThree).toString().replace("[", "")
                        .replace("]", ""));

        System.out.println("-----------------------------");
        System.out.println("Mobiles from all companies: " +
                mobile.getMobiles().toString().replace("[", "")
                        .replace("]", ""));
    }
}
