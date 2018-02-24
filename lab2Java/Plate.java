package lab2Java;

public class Plate extends Dishes {

	public Plate(double diameter, int price, Material dishesMaterial, DishesType type, String dishName) {
		super(price, dishesMaterial, type, dishName);
		this.diameter = diameter;
	}

	private double diameter;

	public double getDiameter() {
		return diameter;
	}

	public void setDiameter(double diameter) {
		this.diameter = diameter;
	}
}
