package chapter4.task7.tours.excursion;

import chapter4.task7.tours.Tour;

import static chapter4.task7.enums.Duration.FIVE;
import static chapter4.task7.enums.Food.BREAKFAST;
import static chapter4.task7.enums.Transfer.NO;

public class GrandCanyonTwo extends Tour {
    public GrandCanyonTwo() {
        super(FIVE, BREAKFAST, NO, 500);
        this.type = "Excursion tours";

    }
}
