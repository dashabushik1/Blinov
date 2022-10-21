package chapter6.task1.rooms;

public class Bedroom extends Room { // спальня
    FloorType floorType;
    WallpaperType wallpaperType;

    public Bedroom(double lenght, double width, FloorType floorType, WallpaperType wallpaperType) {
        super(lenght, width);
        this.floorType = floorType;
        this.wallpaperType = wallpaperType;
    }
}
