package lab2Java;

public class Cup extends Dishes {

	public Cup(double volume, int price, Material dishesMaterial, DishesType type, String name) {
		super(price, dishesMaterial, type, name);
		this.volume = volume;
	}

	private double volume;

	public double getVolume() {
		return volume;
	}

	public void setVolume(double volume) {
		this.volume = volume;
	}
}
