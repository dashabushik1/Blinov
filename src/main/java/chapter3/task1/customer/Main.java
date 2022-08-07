package chapter3.task1.customer;

public class Main {

    public static void main(String[] args) {

        Customer[] customers = new Customer[]{
                new Customer(1L, "Laptev", "Oleg", "Pavlovich", "Minsk, Gagarina street 45/67",
                        444, "KIK675489340289"),
                new Customer(2L, "Gagarina", "Valeriya", "Olegovna", "Minsk, Kolasa street 78/789",
                        444, "KIK678439567123"),
                new Customer(3L, "Goroh", "Vladimir", "Nikolaevich", "Minsk, Kuprevicha street 12/12",
                        236, "KIK678432906784"),
                new Customer(4L, "Vasileva", "Alina", "Sergeevna", "Minsk, Gamarnika street 89/345",
                        678, "KIK904567321567"),
                new Customer(5L, "Sidorov", "Grigoriy", "Alekseevich", "Minsk, Krylova street 90/567",
                        567, "KIK900567445899"),
        };

        System.out.println("Customers in alphabetic order: ");
        Customer[] actualCustomers = findCustomersBySurnameInAlphabeticOrder(customers);
        for (int i = 0; i < customers.length; i++) {
            System.out.println(actualCustomers[i].getSurname() + " " + actualCustomers[i].getName() +
                    " " + actualCustomers[i].getPatronymic());
        }

        System.out.println(" ");
        System.out.println("Customers in the given range from 500 to 700 are: ");
        Customer[] allCustomersInTheGivenRange = findCustomersByCreditCardNumberInTheGivenRange(customers, 500, 700);
        for (int i = 0; i < allCustomersInTheGivenRange.length; i++) {
            System.out.println(allCustomersInTheGivenRange[i].getSurname() + " " + allCustomersInTheGivenRange[i].getName() +
                    " " + actualCustomers[i].getPatronymic());
        }
    }

    private static Customer[] findCustomersBySurnameInAlphabeticOrder(Customer[] customers) { // нужно создавать новый массив?!!!
        for (int i = 0; i < customers.length; i++) {
            for (int j = i; j < customers.length; j++) {
                if (customers[i].getSurname().compareTo(customers[j].getSurname()) > 0) {
                    Customer c;  // правильно ли так? исправилось само
                    c = customers[i];
                    customers[i] = customers[j];
                    customers[j] = c;
                }
            }
        }
        return customers;
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
