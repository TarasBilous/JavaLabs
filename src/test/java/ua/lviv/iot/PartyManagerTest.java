package ua.lviv.iot;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.*;

public class PartyManagerTest {

    private static final int priceKnifeSmall = 50;
    private static final int priceForkSmall = 45;
    private static final int priceSpoonSmall = 55;
    private static final int priceKnifeBig = 60;
    private static final int priceForkBig = 65;
    private static final int priceSpoonBig = 70;
    private static final int priceCupSmall = 55;
    private static final int priceCupBig = 60;
    private static final int pricePanSmall = 80;
    private static final int pricePlateBig = 45;
    private static final double volumeCupSmall = 0.2;
    private static final double volumeCupBig = 60;
    private static final double volumePanSmall = 80;
    private static final double volumePlateBig = 45;

    private static final Dishes knifeSmall = new Cultery(CulteryType.KNIFE, priceKnifeSmall, Material.METAL,
            DishesType.TABLEWARE, "knifeSmall");
    private static final Dishes forkSmall = new Cultery(CulteryType.FORK, priceForkSmall, Material.METAL, DishesType.TABLEWARE, "forkSmall");
    private static final Dishes spoonSmall = new Cultery(CulteryType.SPOON, priceSpoonSmall, Material.METAL, DishesType.TABLEWARE,
            "spoonSmall");
    private static final Dishes knifeBig = new Cultery(CulteryType.KNIFE, priceKnifeBig, Material.METAL, DishesType.TABLEWARE, "knifeBig");
    private static final Dishes forkBig = new Cultery(CulteryType.FORK, priceForkBig, Material.METAL, DishesType.TABLEWARE, "forkBig");
    private static final Dishes spoonBig = new Cultery(CulteryType.SPOON, priceSpoonBig, Material.METAL, DishesType.TABLEWARE, "spoonBig");
    private static final Dishes cupSmall = new Cup(volumeCupSmall, priceCupSmall, Material.CERAMICS, DishesType.TABLEWARE, "cupSmall");
    private static final Dishes cupBig = new Cup(volumeCupBig, priceCupBig, Material.PORCELAIN, DishesType.TABLEWARE, "cupBig");
    private static final Dishes fryingPanSmall = new FryingPan(true, 3.5, 200, Material.GLASS, DishesType.KITCHENWARE, "fryingPanSmall");
    private static final Dishes panSmall = new Pan(Color.BLACK, true, volumePanSmall, pricePanSmall, Material.GLASS,
            DishesType.KITCHENWARE, "panSmall");
    private static final Dishes plateBig = new Plate(volumePlateBig, pricePlateBig, Material.CERAMICS, DishesType.TABLEWARE, "plateBig");

    private static final PartyManager ivan = new PartyManager();
    private List<Dishes> testList = new LinkedList<>();

    @BeforeAll
    static void addDishesToList() {
        ivan.addDish(knifeSmall);
        ivan.addDish(forkSmall);
        ivan.addDish(spoonSmall);
        ivan.addDish(knifeBig);
        ivan.addDish(forkBig);
        ivan.addDish(spoonBig);
        ivan.addDish(cupSmall);
        ivan.addDish(cupBig);
        ivan.addDish(panSmall);
        ivan.addDish(plateBig);
        ivan.addDish(fryingPanSmall);
    }

    @Test
    public void addDish() {
        assertEquals(knifeSmall, ivan.getDishesList().get(0));
    }

    @Test
    public void dishesSortByMaterial() {
        testList = ivan.dishesSortByMaterial(ivan.getDishesList());
        assertEquals(11, testList.size());
        assertEquals(cupBig, testList.get(0));
        assertEquals(cupSmall, testList.get(1));
        assertEquals(plateBig, testList.get(2));
        assertEquals(panSmall, testList.get(3));
        assertEquals(fryingPanSmall, testList.get(4));
        assertEquals(knifeSmall, testList.get(5));
        assertEquals(forkSmall, testList.get(6));
        assertEquals(spoonSmall, testList.get(7));
        assertEquals(knifeBig, testList.get(8));
        assertEquals(forkBig, testList.get(9));
        assertEquals(spoonBig, testList.get(10));
    }

    @Test
    public void findByDishName() {
        testList = ivan.findByDishName("panSmall", "plateBig", "spoonSmall", "cupSmall", "cupBig");
        assertEquals(5, testList.size());
        assertEquals(panSmall, testList.get(0));
        assertEquals(plateBig, testList.get(1));
        assertEquals(spoonSmall, testList.get(2));
        assertEquals(cupSmall, testList.get(3));
        assertEquals(cupBig, testList.get(4));
    }
}