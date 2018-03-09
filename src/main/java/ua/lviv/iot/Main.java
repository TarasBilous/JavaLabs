package ua.lviv.iot;

import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(final String[] args) {

        final int priceKnifeSmall = 50;
        final int priceForkSmall = 45;
        final int priceSpoonSmall = 55;
        final int priceKnifeBig = 60;
        final int priceForkBig = 65;
        final int priceSpoonBig = 70;
        final int priceCupSmall = 55;
        final int priceCupBig = 60;
        final int pricePanSmall = 80;
        final int pricePlateBig = 45;
        final double volumeCupSmall = 0.2;
        final double volumeCupBig = 60;
        final double volumePanSmall = 80;
        final double volumePlateBig = 45;

        List<Dishes> dishesListForPrint = new LinkedList<>();
        PartyManager ivan = new PartyManager();


        ivan.addDish(new Cultery(CulteryType.KNIFE, priceKnifeSmall, Material.METAL, DishesType.TABLEWARE, "knifeSmall"));
        ivan.addDish(new Cultery(CulteryType.FORK, priceForkSmall, Material.METAL, DishesType.TABLEWARE, "forkSmall"));
        ivan.addDish(new Cultery(CulteryType.SPOON, priceSpoonSmall, Material.METAL, DishesType.TABLEWARE, "spoonSmall"));
        ivan.addDish(new Cultery(CulteryType.KNIFE, priceKnifeBig, Material.METAL, DishesType.TABLEWARE, "knifeBig"));
        ivan.addDish(new Cultery(CulteryType.FORK, priceForkBig, Material.METAL, DishesType.TABLEWARE, "forkBig"));
        ivan.addDish(new Cultery(CulteryType.SPOON, priceSpoonBig, Material.METAL, DishesType.TABLEWARE, "spoonBig"));
        ivan.addDish(new Cup(volumeCupSmall, priceCupSmall, Material.CERAMICS, DishesType.TABLEWARE, "cupSmall"));
        ivan.addDish(new Cup(volumeCupBig, priceCupBig, Material.PORCELAIN, DishesType.TABLEWARE, "cupBig"));
        ivan.addDish(new Pan(Color.BLACK, true, volumePanSmall, pricePanSmall, Material.GLASS, DishesType.KITCHENWARE, "panSmall"));
        ivan.addDish(new Plate(volumePlateBig, pricePlateBig, Material.CERAMICS, DishesType.TABLEWARE, "plateBig"));

        dishesListForPrint = ivan.findByDishName("panSmall", "plateBig", "spoonSmall", "cupSmall", "cupBig");
        System.out.println("\nSearch by dishName:\n" + dishesListForPrint);
        ivan.dishesSortByMaterial(dishesListForPrint);
        System.out.println("\nSorted by material:\n" + dishesListForPrint);

    }

}
