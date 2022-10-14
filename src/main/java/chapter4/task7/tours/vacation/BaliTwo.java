package chapter4.task7.tours.vacation;

import chapter4.task7.tours.Tour;

import static chapter4.task7.enums.Duration.TEN;
import static chapter4.task7.enums.Food.FULL_BOARD;
import static chapter4.task7.enums.Transfer.YES;

public class BaliTwo extends Tour {
    public BaliTwo() {
        super(TEN, FULL_BOARD, YES, 500);
        this.type = "Vacation tours";
    }
}
