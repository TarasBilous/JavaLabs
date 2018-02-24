package lab2Java;

public class Pan extends Dishes {

	public Pan(Color colorPan, boolean cover, double volume, int price, Material dishesMaterial, DishesType type, String dishName) {
		super(price, dishesMaterial, type, dishName);
		this.colorPan = colorPan;
		this.cover = cover;
		this.volume = volume;
	}

	private Color colorPan;
	private boolean cover;
	private double volume;

	public Color getColorPan() {
		return colorPan;
	}

	public void setColorPan(Color colorPan) {
		this.colorPan = colorPan;
	}

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
