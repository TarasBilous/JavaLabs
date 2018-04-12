package ua.lviv.iot;

public class Plate extends Dishes {

    public Plate(final double diameter, final int price, final Material dishesMaterial, final DishesType type, final String dishName) {
        super(price, dishesMaterial, type, dishName);
        this.diameter = diameter;
    }

    public Plate() {
    }

    private double diameter;

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(final double diameter) {
        this.diameter = diameter;
    }

}
