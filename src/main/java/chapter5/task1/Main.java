/**
 * 1. Создать класс Payment с внутренним классом, с помощью объектов которого можно сформировать покупку из нескольких товаров.
 */
package chapter5.task1;

public class Main {

    public static void main(String[] args) {

        Payment payment = new Payment();

        payment.addProduct("High Liner Tortilla Crusted Tilapia", 2, 18.65);
        payment.addProduct("Semifreddi's Ciabatta", 3, 3.67);
        payment.addProduct("Kirkland Signature Organic Normandy Frozen Vegetables", 1, 16.04);
        payment.addProduct("Sukhi's Organic Lemon Rice", 5, 14.92);
        payment.addProduct("Clover Farms Organic Half & Half Milk", 3, 6.95);
        payment.addProduct("Kirkland Signature Cage Free Eggs Grade AA", 1, 14.92);
        payment.addProduct("Emmi Roth Le Gruyere Cheese", 4, 15.41);
        payment.addProduct("Columbus Sliced Peppered Salame", 3, 16.25);

        System.out.println(payment.toString().replace("[", "").replace("]", ""));
    }
}
