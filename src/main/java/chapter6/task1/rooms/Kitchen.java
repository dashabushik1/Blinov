package chapter6.task1.rooms;

public class Kitchen extends Room { // кухня
    FloorType floorType;
    WallpaperType wallpaperType;

    public Kitchen(double lenght, double width, FloorType floorType, WallpaperType wallpaperType) {
        super(lenght, width);
        this.floorType = floorType;
        this.wallpaperType = wallpaperType;
    }
}
