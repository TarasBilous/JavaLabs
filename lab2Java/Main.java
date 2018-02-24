package lab2Java;

import java.util.LinkedList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		List<Dishes> dishesListForPrint = new LinkedList<>();
		PartyManager ivan = new PartyManager();

		ivan.addDishesList(new Cultery(CulteryType.KNIFE, 50, Material.METAL, DishesType.TABLEWARE, "knifesmall"));
		ivan.addDishesList(new Cultery(CulteryType.FORK, 45, Material.METAL, DishesType.TABLEWARE, "forksmall"));
		ivan.addDishesList(new Cultery(CulteryType.SPOON, 55, Material.METAL, DishesType.TABLEWARE, "spoonsmall"));
		ivan.addDishesList(new Cultery(CulteryType.KNIFE, 60, Material.METAL, DishesType.TABLEWARE, "knifebig"));
		ivan.addDishesList(new Cultery(CulteryType.FORK, 65, Material.METAL, DishesType.TABLEWARE, "forkbig"));
		ivan.addDishesList(new Cultery(CulteryType.SPOON, 70, Material.METAL, DishesType.TABLEWARE, "spoonbig"));
		ivan.addDishesList(new Cup(0.2, 20, Material.CERAMICS, DishesType.TABLEWARE, "cupsmall"));
		ivan.addDishesList(new Cup(0.5, 30, Material.PORCELAIN, DishesType.TABLEWARE, "cupbig"));
		ivan.addDishesList(new FryingPan(true, 0.9, 120, Material.METAL, DishesType.KITCHENWARE, "fryingPansmall"));
		ivan.addDishesList(new FryingPan(false, 0.5, 90, Material.GLASS, DishesType.KITCHENWARE, "fryingPanbig"));
		ivan.addDishesList(new Pan(Color.BLACK, true, 3.8, 80, Material.GLASS, DishesType.KITCHENWARE, "pansmall"));
		ivan.addDishesList(new Pan(Color.GRAY, false, 2.5, 60, Material.METAL, DishesType.KITCHENWARE, "panbig"));
		ivan.addDishesList(new Plate(20.5, 30, Material.PLASTIC, DishesType.TABLEWARE, "platesmall"));
		ivan.addDishesList(new Plate(15.5, 25, Material.CERAMICS, DishesType.TABLEWARE, "platebig"));

		dishesListForPrint = ivan.findByDishName("pansmall", "platebig", "spoonsmall", "cupsmall", "cupbig");
		System.out.println("\nSearch by dishName:\n" + dishesListForPrint);
		ivan.dishesSortByMaterial(dishesListForPrint);
		System.out.println("\nSorted by material:\n" + dishesListForPrint);

	}

}
