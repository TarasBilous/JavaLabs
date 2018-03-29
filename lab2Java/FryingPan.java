package lab2Java;

public class FryingPan extends Dishes {

	public FryingPan(boolean cover, double volume, int price, Material dishesMaterial, DishesType type, String dishName) {
		super(price, dishesMaterial, type, dishName);
		this.cover = cover;
		this.volume = volume;
	}

	private boolean cover;
	private double volume;

	public boolean isCover() {
		return cover;
	}

	public void setCover(boolean cover) {
		this.cover = cover;
	}

	public double getVolume() {
		return volume;
	}

	public void setVolume(double volume) {
		this.volume = volume;
	}
}
