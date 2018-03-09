package ua.lviv.iot;

public abstract class Dishes {

    private int price;
    private Material dishesMaterial;
    private DishesType type;

    private String dishName;

    public int getPrice() {
        return price;
    }

    public void setPrice(final int price) {
        this.price = price;
    }

    public Material getDishesMaterial() {
        return dishesMaterial;
    }

    public void setDishesMaterial(final Material dishesMaterial) {
        this.dishesMaterial = dishesMaterial;
    }

    public DishesType getType() {
        return type;
    }

    public void setType(final DishesType type) {
        this.type = type;
    }

    public Dishes(final int price, final Material dishesMaterial, final DishesType type, final String dishName) {
        super();
        this.price = price;
        this.dishesMaterial = dishesMaterial;
        this.type = type;
        this.dishName = dishName;
    }

    public String getDishName() {
        return dishName;
    }

    public void setDishName(final String dishName) {
        this.dishName = dishName;
    }

    public String toString() {
        return "   " + dishName + ", " + dishesMaterial;
    }

}
