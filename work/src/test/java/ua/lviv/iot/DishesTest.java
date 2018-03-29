package ua.lviv.iot;

import org.junit.Test;

import static org.junit.Assert.*;

public class DishesTest {

    private Dishes testDishes = new Cup(5.0, 45, Material.PORCELAIN, DishesType.TABLEWARE, "testCup");

    @Test
    public void testToString() {
        assertEquals("   " + testDishes.getDishName() + ", " + testDishes.getDishesMaterial(),
                testDishes.toString());
    }

    @Test
    public void getPrice() {
        testDishes.setPrice(55);
        assertEquals(55, testDishes.getPrice());
    }

    @Test
    public void getDishesMaterial() {
        testDishes.setDishesMaterial(Material.GLASS);
        assertEquals(Material.GLASS, testDishes.getDishesMaterial());
    }

    @Test
    public void getType() {
        testDishes.setType(DishesType.TABLEWARE);
        assertEquals(DishesType.TABLEWARE, testDishes.getType());
    }

    @Test
    public void getDishName() {
        testDishes.setDishName("New name");
        assertEquals("New name", testDishes.getDishName());
    }

}