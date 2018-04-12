package ua.lviv.iot;

public class Cultery extends Dishes {

    private CulteryType tablewareType;


    public CulteryType getTablewareType() {
        return tablewareType;
    }

    public void setTablewareType(final CulteryType tablewareType) {
        this.tablewareType = tablewareType;
    }

    public Cultery(final CulteryType tablewareType, final int price, final Material dishesMaterial, final DishesType type, final String dishName) {
        super(price, dishesMaterial, type, dishName);
        this.tablewareType = tablewareType;
    }

    public Cultery() {
    }
}
