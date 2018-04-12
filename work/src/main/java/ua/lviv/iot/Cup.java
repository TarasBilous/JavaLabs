package ua.lviv.iot;

public class Cup extends Dishes {

    public Cup(final double volumeCup, final int price, final Material dishesMaterial, final DishesType type, final String name) {
        super(price, dishesMaterial, type, name);
        volume = volumeCup;
    }

    public Cup() {
    }

    private double volume;

    public double getVolume() {
        return volume;
    }

    public void setVolume(final double volumeCup) {
        volume = volumeCup;
    }
}
