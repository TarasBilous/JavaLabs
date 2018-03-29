package ua.lviv.iot;

public class Cup extends Dishes {

    public Cup(final double volumeCup, final int price, final Material dishesMaterial, final DishesType type, final String name) {
        super(price, dishesMaterial, type, name);
        volume = volumeCup;
    }

    private double volume;

    public String getHeaders() {
        return super.getHeaders() + "," + "volume";
    }

    public String toCSV() {
        return super.toCSV() + "," + getVolume();
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(final double volumeCup) {
        volume = volumeCup;
    }
}
