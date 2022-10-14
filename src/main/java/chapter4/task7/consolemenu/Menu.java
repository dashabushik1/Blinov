package chapter4.task7.consolemenu;

import chapter4.task7.tours.TourCompany;

import java.util.Scanner;

import static java.lang.System.exit;

public class Menu {

    TourCompany company = new TourCompany();

    public void displayMenu() {
        System.out.println("---------Tour operator 'Expedia'-----------");
        System.out.println("Please choose one of the type of tours: ");
        System.out.println("-------------------------------------------");

        System.out.println("Vacation tours - number 1.");
        System.out.println("Excursion tours - number 2.");
        System.out.println("Therapy tours - number 3.");
        System.out.println("Shopping tours - number 4.");
        System.out.println("Cruise tours - number 5.");
        System.out.println("If you want to sort tours by cost in ascending order, please enter 6.");
        System.out.println("If you want to view all tours, please enter 7.");
        System.out.println("If you wish to quit enter 0.");
    }

    public void questionsForTours() {
        System.out.println("Which tour do you choose?");
        System.out.println("------------------------");
        System.out.println("If you have chosen the first tour - press 1.");
        System.out.println("If you have chosen the second tour - press 2.");
        System.out.println("If you want to return to the main menu - press 3.");
        System.out.println("If you want to quit - press 0.");
    }

    public void answersForTours() {
        Scanner choice = new Scanner(System.in);
        int number = choice.nextInt();
        switch (number) {
            case 0:
                System.out.println("Thank you, goodbye.");
                exit(0);
            case 1:
                System.out.println("You have chosen tour number one! Congratulations!");
                break;
            case 2:
                System.out.println("You have chosen tour number two! Congratulations!");
                break;
            case 3:
                new Menu();
        }
    }

    public void questionsForSortedTours() {
        System.out.println("If you want to quit - press 0.");
        System.out.println("If you want to return to the main menu - press 1.");
    }

    public void answersForSortedTours() {
        Scanner choice = new Scanner(System.in);
        int number = choice.nextInt();
        switch (number) {
            case 0:
                System.out.println("Thank you, goodbye.");
                exit(0);
            case 1:
                new Menu();
        }
    }

    public Menu() {
        Scanner in = new Scanner(System.in);
        displayMenu();
        int number = in.nextInt();
        switch (number) {
            case 0:
                System.out.println("Thank you, goodbye.");
                exit(0);
            case 1:
                System.out.print("Vacation tours: ");
                company.printToursInfo(number);
                System.out.println("------------------------");
                questionsForTours();
                answersForTours();
                break;
            case 2:
                System.out.print("Excursion tours: ");
                company.printToursInfo(number);
                System.out.println("------------------------");
                questionsForTours();
                answersForTours();
                break;
            case 3:
                System.out.print("Therapy tours: ");
                company.printToursInfo(number);
                System.out.println("------------------------");
                questionsForTours();
                answersForTours();
                break;
            case 4:
                System.out.print("Shopping tours: ");
                company.printToursInfo(number);
                System.out.println("------------------------");
                questionsForTours();
                answersForTours();
                break;
            case 5:
                System.out.print("Cruise tours: ");
                company.printToursInfo(number);
                System.out.println("------------------------");
                questionsForTours();
                break;
            case 6:
                System.out.println("Sorted tours by cost in ascending order: ");
                company.showSortedTours();
                System.out.println("------------------------");
                questionsForSortedTours();
                answersForSortedTours();
                break;
            case 7:
                System.out.println("All tours in our company: " + company.getTours());
                break;
            default:
                System.err.println("Unrecognized option.");
                break;
        }
    }
}

