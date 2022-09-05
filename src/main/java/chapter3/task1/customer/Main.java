package chapter3.task1.customer;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Customer[] customers = new Customer[]{
                new Customer(1L, "Laptev", "Oleg", "Pavlovich", "Minsk, Gagarina street 45/67",
                        "KIK675489340289", 444),
                new Customer(2L, "Gagarina", "Valeriya", "Olegovna", "Minsk, Kolasa street 78/789",
                        "KIK678439567123", 444),
                new Customer(3L, "Goroh", "Vladimir", "Nikolaevich", "Minsk, Kuprevicha street 12/12",
                        "KIK678432906784", 236),
                new Customer(4L, "Vasileva", "Alina", "Sergeevna", "Minsk, Gamarnika street 89/345",
                        "KIK904567321567", 678),
                new Customer(5L, "Sidorov", "Grigoriy", "Alekseevich", "Minsk, Krylova street 90/567",
                        "KIK900567445899", 567),
        };

        Customer[] sortedCustomers = sort(customers);
        System.out.println("Customers in alphabetic order:");
        for (int i = 0; i < sortedCustomers.length; i++) {
            System.out.println(sortedCustomers[i].getSurname() + " " + sortedCustomers[i].getName() + " "
                    + sortedCustomers[i].getPatronymic());
        }

        System.out.println("\nCustomers in the given range from 500 to 700 are:");
        Customer[] allCustomersInTheGivenRange = findCustomersByCreditCardNumberInTheGivenRange(customers, 500, 700);
        for (int i = 0; i < allCustomersInTheGivenRange.length; i++) {
            System.out.println(allCustomersInTheGivenRange[i].getSurname() + " " + allCustomersInTheGivenRange[i].getName() +
                    " " + allCustomersInTheGivenRange[i].getPatronymic());
        }
    }

    private static Customer[] sort(Customer[] customers) {
        Customer[] sortedCustomers = new Customer[customers.length];
        for (int i = 0; i < customers.length; i++) {
            Arrays.sort(customers, (a, b) -> a.getSurname().compareTo(b.getSurname()));
            sortedCustomers[i] = customers[i];
        }
        return sortedCustomers;
    }

    private static Customer[] findCustomersByCreditCardNumberInTheGivenRange(Customer[] customers, int min, int max) {
        Customer[] expectedCustomersInTheGivenRange = new Customer[customers.length];
        int customerIndex = 0;
        for (Customer customer : customers) {
            if ((customer.getCredit_card_number() > min) && (customer.getCredit_card_number() < max)) {
                expectedCustomersInTheGivenRange[customerIndex] = customer;
                customerIndex++;
            }
        }
        Customer[] actualCustomersInTheGivenRange = new Customer[customerIndex];
        for (int i = 0; i < customerIndex; i++) {
            actualCustomersInTheGivenRange[i] = expectedCustomersInTheGivenRange[i];
        }
        return actualCustomersInTheGivenRange;
    }
}
