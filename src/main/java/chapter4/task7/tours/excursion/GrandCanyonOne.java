package chapter4.task7.tours.excursion;

import chapter4.task7.tours.Tour;

import static chapter4.task7.enums.Duration.THREE_DAYS;
import static chapter4.task7.enums.TypeOfService.BREAKFAST;
import static chapter4.task7.enums.Transfer.NO;

public class GrandCanyonOne extends Tour {
    public GrandCanyonOne() {
        super(THREE_DAYS, BREAKFAST, NO, 300);
        this.type = "Excursion tours";
    }
}
