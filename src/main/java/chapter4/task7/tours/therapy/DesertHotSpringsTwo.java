package chapter4.task7.tours.therapy;

import chapter4.task7.tours.Tour;

import static chapter4.task7.enums.Duration.SEVEN_DAYS;
import static chapter4.task7.enums.TypeOfService.FULL_BOARD;
import static chapter4.task7.enums.Transfer.NO;

public class DesertHotSpringsTwo extends Tour {
    public DesertHotSpringsTwo() {
        super(SEVEN_DAYS, FULL_BOARD, NO, 1000);
        this.type = "Therapy tours";
    }
}
