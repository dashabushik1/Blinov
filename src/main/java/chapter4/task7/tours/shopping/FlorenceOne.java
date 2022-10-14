package chapter4.task7.tours.shopping;

import chapter4.task7.tours.Tour;

import static chapter4.task7.enums.Duration.ONE;
import static chapter4.task7.enums.Food.ROOM_ONLY;
import static chapter4.task7.enums.Transfer.NO;

public class FlorenceOne extends Tour {
    public FlorenceOne() {
        super(ONE, ROOM_ONLY, NO, 200);
        this.type = "Shopping tours";
    }
}
