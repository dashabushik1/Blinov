package chapter4.task7.tours.shopping;

import chapter4.task7.tours.Tour;

import static chapter4.task7.enums.Duration.ONE_DAY;
import static chapter4.task7.enums.TypeOfService.ROOM_ONLY;
import static chapter4.task7.enums.Transfer.NO;

public class FlorenceOne extends Tour {
    public FlorenceOne() {
        super(ONE_DAY, ROOM_ONLY, NO, 200);
        this.type = "Shopping tours";
    }
}
