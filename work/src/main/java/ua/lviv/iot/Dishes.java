package ua.lviv.iot;

public class Dishes {

    private int price;
    private Material dishesMaterial;
    private DishesType type;

    private String dishName;

    public Dishes() {
    }

    public Dishes(int price, Material dishesMaterial, DishesType type, String dishName) {
        this.price = price;
        this.dishesMaterial = dishesMaterial;
        this.type = type;
        this.dishName = dishName;
    }

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
