package chapter6.task1;

import static chapter6.task1.rooms.FloorType.*;
import static chapter6.task1.rooms.WallpaperType.*;

public class OneBedroomHouse {

    public House constructHouse(HouseBuilder houseBuilder) {
        houseBuilder.buildBedroom(4.3, 4.4, CARPET, PAPER);
        houseBuilder.buildBathroom(3.0, 3.0, CERAMIC_TILE, VYNIL);
        houseBuilder.buildKitchen(4.8, 4.5, LAMINATE, TEXTILE);
        houseBuilder.buildGarage(6.0, 4.0, PARQUET, VELOR);
        return houseBuilder.getHouse();
    }
}
