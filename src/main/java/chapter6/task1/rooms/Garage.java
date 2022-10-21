package chapter6.task1.rooms;

public class Garage { // гараж

    FloorType floorType;
    WallpaperType wallpaperType;
    private double lenght;
    private double width;

    public Garage(double lenght, double width, FloorType floorType, WallpaperType wallpaperType) {
        this.lenght = lenght;
        this.width = width;
        this.floorType = floorType;
        this.wallpaperType = wallpaperType;
    }
}
