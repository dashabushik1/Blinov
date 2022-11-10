package chapter4.task7.tours.cruise;

import chapter4.task7.tours.Tour;

import static chapter4.task7.enums.Duration.*;
import static chapter4.task7.enums.TypeOfService.FULL_BOARD;
import static chapter4.task7.enums.Transfer.YES;

public class CaribbeanTwo extends Tour {
    public CaribbeanTwo() {
        super(TEN_DAYS, FULL_BOARD, YES, 1000);
        this.type = "Cruise tours";
    }
}
