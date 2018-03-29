package lab2Java;

public class Cultery extends Dishes {

	private CulteryType tablewareType;

	public CulteryType getTablewareType() {
		return tablewareType;
	}

	public void setTablewareType(CulteryType tablewareType) {
		this.tablewareType = tablewareType;
	}

	public Cultery(CulteryType tablewareType, int price, Material dishesMaterial, DishesType type, String dishName) {
		super(price, dishesMaterial, type, dishName);
		this.tablewareType = tablewareType;
	}
}
