package lab2Java;

import java.util.LinkedList;
import java.util.List;

public class PartyManager {

	private List<Dishes> dishesList = new LinkedList<>();

	public List<Dishes> getDishesList() {
		return dishesList;
	}

	public void addDish(Dishes newDishes) {
		dishesList.add(newDishes);
	}

	public void dishesSortByMaterial(List<Dishes> newList) {
		newList.sort((d1, d2) -> d1.getDishesMaterial().compareTo(d2.getDishesMaterial()));
	}

	public List<Dishes> findByDishName(String... dishNames) {
		List<Dishes> result = new LinkedList<>();

		for (String dishName : dishNames) {
			for (Dishes dish : dishesList) {
				if (dish.getDishName().equalsIgnoreCase(dishName)) {
					result.add(dish);
				}
			}
		}
		return result;
	}

}
