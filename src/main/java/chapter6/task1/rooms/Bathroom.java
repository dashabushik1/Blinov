package chapter6.task1.rooms;

public class Bathroom extends Room { // ванная комната
    FloorType floorType;
    WallpaperType wallpaperType;

    public Bathroom(double lenght, double width, FloorType floorType, WallpaperType wallpaperType) {
        super(lenght, width);
        this.floorType = floorType;
        this.wallpaperType = wallpaperType;
    }
}
