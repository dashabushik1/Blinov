package chapter4.task7.tours.vacation;

import chapter4.task7.tours.Tour;

import static chapter4.task7.enums.Duration.FOURTEEN;
import static chapter4.task7.enums.Food.FULL_BOARD;
import static chapter4.task7.enums.Transfer.YES;

public class BaliOne extends Tour {
    public BaliOne() {
        super(FOURTEEN, FULL_BOARD, YES, 700);
        this.type = "Vacation tours";
    }
}
