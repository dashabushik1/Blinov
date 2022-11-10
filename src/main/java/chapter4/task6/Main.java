/**
 * 6. Создать консольное приложение, удовлетворяющее следующим требованиям:
 * • Использовать возможности ООП: классы, наследование, полиморфизм, инкапсуляция.
 * • Каждый класс должен иметь отражающее смысл название и информативный состав.
 * • Наследование должно применяться только тогда, когда это имеет смысл.
 * • При кодировании должны быть использованы соглашения об оформлении кода java code convention.
 * • Классы должны быть грамотно разложены по пакетам.
 * • Консольное меню должно быть минимальным.
 * • Для хранения параметров инициализации можно использовать файлы.
 * <p>
 * Звукозапись. Определить иерархию музыкальных композиций. Записать на диск сборку. Подсчитать продолжительность.
 * Провести перестановку композиций диска на основе принадлежности к стилю. Найти композицию, соответствующую заданному
 * диапазону длины треков.
 */
package chapter4.task6;

import static chapter4.task6.MusicStyles.*;
import static chapter4.task6.MusicStyles.TRANCE;

public class Main {

    public static void main(String[] args) {

        Disc disc = createDisc();

        System.out.println("Tracklist: " + disc.getTrackList().toString().replace("[", "")
                .replace("]", ""));
        System.out.println("--------------------------------");
        System.out.println("Total duration of tracklist: " + disc.getTotalDuration() + " minutes.");
        System.out.println("--------------------------------");

        disc.getTrackInRange(4.00, 6.00);
    }

    private static Disc createDisc() {
        Disc disc = new Disc();
        disc.addTrack(new Track("16BL - Deep In My Soul", 4.34, DEEP_HOUSE));
        disc.addTrack(new Track("Eli & Fur - Something Was Real", 5.60, HOUSE));
        disc.addTrack(new Track("Croquet Club - Cardigan", 5.00, PROGRESSIVE));
        disc.addTrack(new Track("16BL - Nobody Seems To Care", 8.03, TRANCE));
        disc.addTrack(new Track("Yotto - Love Machine", 3.36, PROGRESSIVE));
        disc.addTrack(new Track("Tinlicker - Perfect Mistakes", 6.45, TRANCE));
        disc.addTrack(new Track("Braxton  - The River", 5.35, HOUSE));
        disc.addTrack(new Track("Above & Beyond - Homecoming", 8.03, TRANCE));
        return disc;
    }
}
