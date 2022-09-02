package chapter3.task1.customer;

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

        System.out.println("Customers in alphabetic order: ");
        Customer[] actualCustomers = findCustomersBySurnameInAlphabeticOrder(customers);
        for (int i = 0; i < customers.length; i++) {
            if (actualCustomers[i] != null) {
                System.out.println(actualCustomers[i].getSurname() + " " + actualCustomers[i].getName() +
                        " " + actualCustomers[i].getPatronymic());
            }
        }

        System.out.println(" ");
        System.out.println("Customers in the given range from 500 to 700 are: ");
        Customer[] allCustomersInTheGivenRange = findCustomersByCreditCardNumberInTheGivenRange(customers, 500, 700);
        for (int i = 0; i < allCustomersInTheGivenRange.length; i++) {
            System.out.println(allCustomersInTheGivenRange[i].getSurname() + " " + allCustomersInTheGivenRange[i].getName() +
                    " " + allCustomersInTheGivenRange[i].getPatronymic());
        }
    }


    private static Customer[] findCustomersBySurnameInAlphabeticOrder(Customer[] customers) {
        Customer[] customersBySurname = new Customer[customers.length];
        int customerIndex = 0;
        for (int i = 0; i < customersBySurname.length; i++) {
            for (int j = i; j < customersBySurname.length; j++) {
                if (customersBySurname[i].getSurname().compareTo(customersBySurname[j].getSurname()) > 0) {
                    Customer cust;  // правильно ли так? исправилось само
                    cust = customersBySurname[i];
                    customersBySurname[i] = customersBySurname[j];
                    customersBySurname[j] = cust;
                }
            }
        }
        return customersBySurname;
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
