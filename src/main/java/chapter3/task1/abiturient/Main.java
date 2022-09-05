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


        System.out.println("Abiturients with bad marks: ");
        Abiturient[] abiturientsWithBadMarks = findAbiturientsWithBadMarks(abiturients);
        for (Abiturient abiturient : abiturientsWithBadMarks) {
            System.out.println(abiturient.getSurname() + " " + abiturient.getName() + " "
                    + abiturient.getPatronymic());
        }

        System.out.println("\nAbiturients with sum of marks more than 15: ");
        Abiturient[] abiturientsWithMarksMore = findAbiturientsWithSumOfMarksMoreThan(abiturients, 15);
        for (Abiturient abiturient : abiturientsWithMarksMore) {
            System.out.println(abiturient.getSurname() + " " + abiturient.getName() + " "
                    + abiturient.getPatronymic());
        }

        System.out.println("\nBest 3 abiturients: ");
        Abiturient[] bestAbiturients = findBestAbiturients(abiturients, 3);
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

    private static Abiturient[] findAbiturientsWithBadMarks(Abiturient[] abiturients) {
        Abiturient[] abiturientsWithBadMarks = new Abiturient[abiturients.length];
        int IndexOfAbiturientsWithBadMarks = 0;
        for (int i = 0; i < abiturients.length; ++i) {
            if (hasBadMark(abiturients[i])) {
                abiturientsWithBadMarks[i] = abiturients[i];
                IndexOfAbiturientsWithBadMarks++;
            }
        }
        Abiturient[] result = new Abiturient[IndexOfAbiturientsWithBadMarks];
        int j = 0;
        for (int i = 0; i < IndexOfAbiturientsWithBadMarks; ++i) {
            if (abiturientsWithBadMarks[j] != null) {
                result[i] = abiturientsWithBadMarks[j];
            } else {
                --i;
            }
            ++j;
        }
        return result;
    }

    private static Abiturient[] findAbiturientsBySumOfMarks(Abiturient[] abiturients, int sumOfMark) {
        Abiturient[] abiturientsBySumOfMarks = new Abiturient[abiturients.length];
        int countOfAbiturientsBySumOfMarks = 0;
        for (int i = 0; i < abiturients.length; ++i) {
            if (findSumOfMarks(abiturients[i]) == sumOfMark) {
                abiturientsBySumOfMarks[i] = abiturients[i];
                countOfAbiturientsBySumOfMarks++;
            }
        }
        Abiturient[] result = new Abiturient[countOfAbiturientsBySumOfMarks];
        int j = 0;
        for (int i = 0; i < countOfAbiturientsBySumOfMarks; ++i) {
            if (abiturientsBySumOfMarks[j] != null) {
                result[i] = abiturientsBySumOfMarks[j];
            } else {
                --i;
            }
            ++j;
        }
        return result;
    }

    private static Abiturient[] findBestAbiturients(Abiturient[] abiturients, int maxCount) {
        if (maxCount > abiturients.length) {
            throw new IllegalArgumentException("right count is more than abiturents count");
        }

        Abiturient[] result = new Abiturient[maxCount];
        Abiturient[] copy = Arrays.copyOf(abiturients, abiturients.length);


        for (int i = 0; i < copy.length; ++i) {
            for (int j = i + 1; j < copy.length; j++) {
                if (findSumOfMarks(copy[i]) < findSumOfMarks(copy[j])) {
                    Abiturient abiturient = copy[i];
                    copy[i] = copy[j];
                    copy[j] = abiturient;
                }
            }
        }

        for (int i = 0; i < maxCount; i++) {
            result[i] = copy[i];
        }

        return result;
    }

    private static Abiturient[] findAbiturientsWithSumOfMarksMoreThan(Abiturient[] abiturients, int sumOfMarks) {
        Abiturient[] abiturientsWithSumOfMarksMore = new Abiturient[abiturients.length];
        int countOfAbiturientsWithSumOfMarksMore = 0;
        for (int i = 0; i < abiturients.length; ++i) {
            if (hasSumOfMarksMoreThan(abiturients[i], sumOfMarks)) {
                abiturientsWithSumOfMarksMore[i] = abiturients[i];
                countOfAbiturientsWithSumOfMarksMore++;
            }
        }
        Abiturient[] result = new Abiturient[countOfAbiturientsWithSumOfMarksMore];
        int j = 0;
        for (int i = 0; i < countOfAbiturientsWithSumOfMarksMore; ++i) {
            if (abiturientsWithSumOfMarksMore[j] != null) {
                result[i] = abiturientsWithSumOfMarksMore[j];
            } else {
                --i;
            }
            ++j;
        }
        return result;
    }

    private static boolean hasSumOfMarksMoreThan(Abiturient abiturient, int minSumOfMarks) {
        int sumOfMarks = findSumOfMarks(abiturient);
        return minSumOfMarks < sumOfMarks;
    }

    private static boolean hasBadMark(Abiturient abiturient) {
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
