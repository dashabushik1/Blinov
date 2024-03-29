package chapter4.task7.tours.therapy;

import chapter4.task7.tours.Tour;

import static chapter4.task7.enums.Duration.FIVE_DAYS;
import static chapter4.task7.enums.TypeOfService.FULL_BOARD;
import static chapter4.task7.enums.Transfer.NO;

public class DesertHotSpringsOne extends Tour {
    public DesertHotSpringsOne() {
        super(FIVE_DAYS, FULL_BOARD, NO, 800);
        this.type = "Therapy tours";
    }
}
