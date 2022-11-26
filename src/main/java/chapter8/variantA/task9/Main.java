/**
 * 9. Напечатать квитанцию об оплате телеграммы, если стоимость одного слова задана.
 */
package chapter8.variantA.task9;

public class Main {

    public static void main(String[] args) {
        String telegram = "Dear Paul, Thank you very much for your recent letter. " +
                "Sounds like you had a good vacation in Mexico. Did you enjoy your journey? " +
                "What impressed you most of all? Did you take any pictures?\n" +
                "\n" +
                "You wrote me about your project on famous Russian movies. " +
                "I am glad I can help you with it. I’ll do my best to answer your questions.";
        double cost = 0.43;

        System.out.println(getPayment(telegram, cost));
    }

    public static double getPayment(String string, double cost) {
        int count = 0;
        if ((string != null) && (string.length() > 0)) {
            String[] words = string.split("[\\s,.!?\\d]+");
            count = words.length;
        } else {
            System.out.println("String is null.");
        }
        return cost * count;
    }
}
