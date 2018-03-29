package lab2Java;

public abstract class Dishes {

	private int price;
	private Material dishesMaterial;
	private DishesType type;

	private String dishName;

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Material getDishesMaterial() {
		return dishesMaterial;
	}

	public void setDishesMaterial(Material dishesMaterial) {
		this.dishesMaterial = dishesMaterial;
	}

	public DishesType getType() {
		return type;
	}

	public void setType(DishesType type) {
		this.type = type;
	}

	public Dishes(int price, Material dishesMaterial, DishesType type, String dishName) {
		super();
		this.price = price;
		this.dishesMaterial = dishesMaterial;
		this.type = type;
		this.dishName = dishName;
	}

	public String getDishName() {
		return dishName;
	}

	public void setDishName(String dishName) {
		this.dishName = dishName;
	}

	public String toString() {
		return "   " + dishName + ", " + dishesMaterial;
	}

}
