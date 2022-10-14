package chapter4.task7.tours.therapy;

import chapter4.task7.tours.Tour;

import static chapter4.task7.enums.Duration.SEVEN;
import static chapter4.task7.enums.Food.FULL_BOARD;
import static chapter4.task7.enums.Transfer.NO;

public class DesertHotSpringsTwo extends Tour {
    public DesertHotSpringsTwo() {
        super(SEVEN, FULL_BOARD, NO, 1000);
        this.type = "Therapy tours";
    }
}
