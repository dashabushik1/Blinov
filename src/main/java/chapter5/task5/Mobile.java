package chapter5.task5;

import java.util.ArrayList;
import java.util.List;

import static chapter5.task5.Mobile.Brand.*;

public class Mobile {

    public enum Brand {
        APPLE,
        BLACKBERRY,
        SAMSUNG;
    }

    private List<MobileProperties> mobiles = new ArrayList<>();

    public Mobile() {
        mobiles.add(new MobileProperties(APPLE, "iPhone 13 Mini", 2438, 5.42));
        mobiles.add(new MobileProperties(APPLE, "iPhone 12", 2815, 6.1));
        mobiles.add(new MobileProperties(BLACKBERRY, "BlackBerry Motion", 4000, 5.5));
        mobiles.add(new MobileProperties(BLACKBERRY, "BlackBerry Priv", 3410, 5.4));
        mobiles.add(new MobileProperties(SAMSUNG, "Samsung Galaxy S21+", 4800, 6.7));
        mobiles.add(new MobileProperties(SAMSUNG, "Samsung Galaxy S21 5G", 4000, 6.2));
    }

    public List<MobileProperties> getMobiles() {
        return mobiles;
    }

    public List<MobileProperties> findMobilesFromOneBrand(Brand brand) {
        List<MobileProperties> mobilesFromOneBrand = new ArrayList<>();
        for (MobileProperties mobile : mobiles) {
            if (mobile.brand.equals(brand)) {
                mobilesFromOneBrand.add(mobile);
            }
        }
        return mobilesFromOneBrand;
    }

    @Override
    public String toString() {
        return "\n|mobile: " + mobiles;
    }

    public static class MobileProperties {
        Brand brand; // бренд телефона
        private String model; // модель телефона
        private int accumulatorCapacity; // емкость аккумулятора в mAh
        private double screenSize; // размер экрана в дюймах (")

        public MobileProperties(Brand brand, String model, int accumulatorCapacity, double screenSize) {
            this.brand = brand;
            this.model = model;
            this.accumulatorCapacity = accumulatorCapacity;
            this.screenSize = screenSize;
        }

        @Override
        public String toString() {
            return "\n|model: " + model +
                    "\n|accumulator capacity: " + accumulatorCapacity +
                    "\n|screen size: " + screenSize;
        }
    }
}
