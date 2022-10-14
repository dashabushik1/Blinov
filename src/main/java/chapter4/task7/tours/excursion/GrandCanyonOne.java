package chapter4.task7.tours.excursion;

import chapter4.task7.tours.Tour;

import static chapter4.task7.enums.Duration.THREE;
import static chapter4.task7.enums.Food.BREAKFAST;
import static chapter4.task7.enums.Transfer.NO;

public class GrandCanyonOne extends Tour {
    public GrandCanyonOne() {
        super(THREE, BREAKFAST, NO, 300);
        this.type = "Excursion tours";
    }
}
