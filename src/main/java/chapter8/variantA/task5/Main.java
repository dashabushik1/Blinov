/**
 * 5. Удалить из текста его часть, заключенную между двумя символами, которые вводятся
 * (например, между скобками «(» и «)» или между звездочками «*» и т.п.).
 */
package chapter8.variantA.task5;

public class Main {

    public static void main(String[] args) {
        String text = "Cinema is an integral part of the social life of people." +
                "(The movie combines not only stunts, special effects and scenery, but also the genuine art.)" +
                "Many people go to the cinemas in their free time.";

        String result = text.replaceAll("[(].*[)]", " ");
        System.out.println(result);
    }
}
