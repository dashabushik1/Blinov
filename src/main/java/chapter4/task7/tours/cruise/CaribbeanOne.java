package chapter4.task7.tours.cruise;

import chapter4.task7.tours.Tour;

import static chapter4.task7.enums.Duration.FOURTEEN;
import static chapter4.task7.enums.Food.FULL_BOARD;
import static chapter4.task7.enums.Transfer.NO;

public class CaribbeanOne extends Tour {
    public CaribbeanOne() {
        super(FOURTEEN, FULL_BOARD, NO, 1500);
        this.type = "Cruise tours";
    }
}
