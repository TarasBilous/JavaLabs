package lab2Java;

import java.util.LinkedList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		List<Dishes> dishesListForPrint = new LinkedList<>();
		PartyManager ivan = new PartyManager();

		ivan.addDish(new Cultery(CulteryType.KNIFE, 50, Material.METAL, DishesType.TABLEWARE, "knifesmall"));
		ivan.addDish(new Cultery(CulteryType.FORK, 45, Material.METAL, DishesType.TABLEWARE, "forksmall"));
		ivan.addDish(new Cultery(CulteryType.SPOON, 55, Material.METAL, DishesType.TABLEWARE, "spoonsmall"));
		ivan.addDish(new Cultery(CulteryType.KNIFE, 60, Material.METAL, DishesType.TABLEWARE, "knifebig"));
		ivan.addDish(new Cultery(CulteryType.FORK, 65, Material.METAL, DishesType.TABLEWARE, "forkbig"));
		ivan.addDish(new Cultery(CulteryType.SPOON, 70, Material.METAL, DishesType.TABLEWARE, "spoonbig"));
		ivan.addDish(new Cup(0.2, 20, Material.CERAMICS, DishesType.TABLEWARE, "cupsmall"));
		ivan.addDish(new Cup(0.5, 30, Material.PORCELAIN, DishesType.TABLEWARE, "cupbig"));
		ivan.addDish(new FryingPan(true, 0.9, 120, Material.METAL, DishesType.KITCHENWARE, "fryingPansmall"));
		ivan.addDish(new FryingPan(false, 0.5, 90, Material.GLASS, DishesType.KITCHENWARE, "fryingPanbig"));
		ivan.addDish(new Pan(Color.BLACK, true, 3.8, 80, Material.GLASS, DishesType.KITCHENWARE, "pansmall"));
		ivan.addDish(new Pan(Color.GRAY, false, 2.5, 60, Material.METAL, DishesType.KITCHENWARE, "panbig"));
		ivan.addDish(new Plate(20.5, 30, Material.PLASTIC, DishesType.TABLEWARE, "platesmall"));
		ivan.addDish(new Plate(15.5, 25, Material.CERAMICS, DishesType.TABLEWARE, "platebig"));

		dishesListForPrint = ivan.findByDishName("pansmall", "platebig", "spoonsmall", "cupsmall", "cupbig");
		System.out.println("\nSearch by dishName:\n" + dishesListForPrint);
		ivan.dishesSortByMaterial(dishesListForPrint);
		System.out.println("\nSorted by material:\n" + dishesListForPrint);

	}

}
