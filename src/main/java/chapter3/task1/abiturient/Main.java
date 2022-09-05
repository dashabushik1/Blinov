package chapter3.task1.abiturient;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Abiturient[] abiturients = new Abiturient[]{
                new Abiturient(1L, "Mishin", "Vasya", "Olegovich", "Minsk, Saksaganskogo street, 31",
                        "2286789", new int[]{1, 2, 3, 4, 5}),
                new Abiturient(2L, "Anisimov", "Oleg", "Nikolaevich", "Minsk, Peremogy avenue, 45",
                        "2282378", new int[]{5, 4, 5, 4, 5}),
                new Abiturient(3L, "Nechalin", "Kirill", "Ivanocich", "Minsk, Peremogy avenue, 12",
                        "2289078", new int[]{5, 2, 3, 4, 5}),
                new Abiturient(4L, "Mirina", "Eva", "Alekseevna", "Minsk, Kotlyarevskogo street, 4",
                        "9006857", new int[]{1, 2, 2, 4, 5}),
                new Abiturient(5L, "Alexandrov", "Kolya", "Olegovich", "Minsk, Volodarskogo street, 47",
                        "4567893", new int[]{6, 7, 7, 5, 5}),
                new Abiturient(6L, "Petuhova", "Olya", "Pavlovna", "Minsk, Kazinca street, 8",
                        "7453607", new int[]{4, 4, 2, 4, 5})
        };

        Abiturient[] abiturientsWithBadMarks = findAbiturientsWithBadMarks(abiturients);
        System.out.println("Abiturients with bad marks: ");
        for (Abiturient abiturient : abiturientsWithBadMarks) {
            System.out.println(abiturient.getSurname() + " " + abiturient.getName() + " "
                    + abiturient.getPatronymic());
        }

        Abiturient[] abiturientsWithMarksMore = findAbiturientsWithSumOfMarksMoreThan(abiturients, 15);
        System.out.println("\nAbiturients with sum of marks more than 15: ");
        for (Abiturient abiturient : abiturientsWithMarksMore) {
            System.out.println(abiturient.getSurname() + " " + abiturient.getName() + " "
                    + abiturient.getPatronymic());
        }

        Abiturient[] bestAbiturients = findBestAbiturients(abiturients, 3);
        System.out.println("\nBest 3 abiturients: ");
        for (Abiturient abiturient : bestAbiturients) {
            System.out.println(abiturient.getSurname() + " " + abiturient.getName() + " "
                    + abiturient.getPatronymic());
        }

        int semiPassSumOfMarks = findSumOfMarks(bestAbiturients[2]);
        Abiturient[] abiturientsWithSemiPassSumOfMarks = findAbiturientsBySumOfMarks(abiturients, semiPassSumOfMarks);
        if (abiturientsWithSemiPassSumOfMarks.length > 1) {
            System.out.println("\nSemi pass sum of marks abiturients: ");
            for (Abiturient abiturient : abiturientsWithSemiPassSumOfMarks) {
                System.out.println(abiturient.getSurname() + " " + abiturient.getName() + " "
                        + abiturient.getPatronymic());
            }
        }
    }

    private static Abiturient[] findAbiturientsBySumOfMarks(Abiturient[] abiturients, int sumOfMark) {
        Abiturient[] abiturientsBySumOfMarks = new Abiturient[abiturients.length];
        int indexOfAbiturientsBySumOfMarks = 0;
        for (int i = 0; i < abiturients.length; i++) {
            if (findSumOfMarks(abiturients[i]) == sumOfMark) {
                abiturientsBySumOfMarks[indexOfAbiturientsBySumOfMarks] = abiturients[i];
                indexOfAbiturientsBySumOfMarks++;
            }
        }
        Abiturient[] result = new Abiturient[indexOfAbiturientsBySumOfMarks];
        int j = 0;
        for (int i = 0; i < indexOfAbiturientsBySumOfMarks; i++) {
            if (abiturientsBySumOfMarks[j] != null) {
                result[i] = abiturientsBySumOfMarks[j];
            }
        }
        return result;
    }

    private static Abiturient[] findAbiturientsWithBadMarks(Abiturient[] abiturients) {
        Abiturient[] abiturientsWithBadMarks = new Abiturient[abiturients.length];
        int indexOfAbiturientsWithBadMarks = 0;
        for (int i = 0; i < abiturients.length; ++i) {
            if (findBadMark(abiturients[i])) {
                abiturientsWithBadMarks[indexOfAbiturientsWithBadMarks] = abiturients[i];
                indexOfAbiturientsWithBadMarks++;
            }
        }
        Abiturient[] result = new Abiturient[indexOfAbiturientsWithBadMarks];
        int j = 0;
        for (int i = 0; i < indexOfAbiturientsWithBadMarks; ++i) {
            if (abiturientsWithBadMarks[j] != null) {
                result[i] = abiturientsWithBadMarks[j];
            } else {
                --i;
            }
            ++j;
        }
        return result;
    }

    private static Abiturient[] findBestAbiturients(Abiturient[] abiturients, int numberOfAbiturients) {

        if (numberOfAbiturients > abiturients.length) {
            throw new IllegalArgumentException("Number is more than all abiturents.");
        }

        Abiturient[] bestAbiturients = new Abiturient[numberOfAbiturients];
        Abiturient[] copyOfBestAbiturients = Arrays.copyOf(abiturients, abiturients.length);

        for (int i = 0; i < copyOfBestAbiturients.length; ++i) {
            for (int j = i + 1; j < copyOfBestAbiturients.length; j++) {
                if (findSumOfMarks(copyOfBestAbiturients[i]) < findSumOfMarks(copyOfBestAbiturients[j])) {
                    Abiturient abiturient = copyOfBestAbiturients[i];
                    copyOfBestAbiturients[i] = copyOfBestAbiturients[j];
                    copyOfBestAbiturients[j] = abiturient;
                }
            }
        }

        for (int i = 0; i < numberOfAbiturients; i++) {
            bestAbiturients[i] = copyOfBestAbiturients[i];
        }
        return bestAbiturients;
    }

    private static Abiturient[] findAbiturientsWithSumOfMarksMoreThan(Abiturient[] abiturients, int sumOfMarks) {
        Abiturient[] abiturientsWithSumOfMarksMore = new Abiturient[abiturients.length];
        int indexOfAbiturientsWithSumOfMarksMore = 0;
        for (int i = 0; i < abiturients.length; ++i) {
            if (findSumOfMarksMoreThan(abiturients[i], sumOfMarks)) {
                abiturientsWithSumOfMarksMore[i] = abiturients[i];
                indexOfAbiturientsWithSumOfMarksMore++;
            }
        }
        Abiturient[] result = new Abiturient[indexOfAbiturientsWithSumOfMarksMore];
        int j = 0;
        for (int i = 0; i < indexOfAbiturientsWithSumOfMarksMore; ++i) {
            if (abiturientsWithSumOfMarksMore[j] != null) {
                result[i] = abiturientsWithSumOfMarksMore[j];
            } else {
                --i;
            }
            ++j;
        }
        return result;
    }

    private static boolean findSumOfMarksMoreThan(Abiturient abiturient, int minSumOfMarks) {
        int sumOfMarks = findSumOfMarks(abiturient);
        return minSumOfMarks < sumOfMarks;
    }

    private static boolean findBadMark(Abiturient abiturient) {
        for (int mark : abiturient.getMarks()) {
            if (mark < 4) {
                return true;
            }
        }
        return false;
    }

    private static int findSumOfMarks(Abiturient abiturient) {
        int sum = 0;
        for (int mark : abiturient.getMarks()) {
            sum += mark;
        }
        return sum;
    }
}
