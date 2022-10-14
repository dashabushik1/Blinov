package chapter5.task1;

import java.util.ArrayList;
import java.util.List;

public class Payment {
    private List<Product> products = new ArrayList<>();
    private double grandTotal;

    public Payment() {
    }

    public void addProduct(String nameOfProduct, double productQuantity, double productCost) {
        products.add(new Product(nameOfProduct, productQuantity, productCost));
        grandTotal += productQuantity * productCost;
    }

    @Override
    public String toString() {
        return "Your payment: " + products + "/nGrand Total is: $" + Math.round(this.grandTotal) + ".";
    }

    class Product {
        private String nameOfProduct; // наименование продукта
        private double productQuantity; // количество покупаемого продукта
        private double productCost; // стоимость продукта за 1 единицу

        public Product(String nameOfProduct, double productQuantity, double productCost) {
            this.nameOfProduct = nameOfProduct;
            this.productQuantity = productQuantity;
            this.productCost = productCost;
        }

        @Override
        public String toString() {
            return "\n|Name of product: " + nameOfProduct + " |cost: $" + productCost + " |quantity: " + productQuantity +
                    " package";
        }
    }
}
