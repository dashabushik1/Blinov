package chapter4.task7.tours.shopping;

import chapter4.task7.tours.Tour;

import static chapter4.task7.enums.Duration.TWO_HOURS;
import static chapter4.task7.enums.Food.ROOM_ONLY;
import static chapter4.task7.enums.Transfer.NO;

public class FlorenceTwo extends Tour {
    public FlorenceTwo() {
        super(TWO_HOURS, ROOM_ONLY, NO, 50);
        this.type = "Shopping tours";
    }
}
