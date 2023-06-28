package src.criacional.builder.before;

import src.criacional.builder.before.entities.FastFoodMeal;

public class Client {
	public static void main(String[] args) {
		FastFoodMeal comboXburger = new FastFoodMeal(
				"Coca-cola",
				"X-Burger",
				"Batata",
				"Açaí",
				"Boneco do flash"
		);
		System.out.println(comboXburger);


		FastFoodMeal justSideItem = new FastFoodMeal(null, null, "Batata");
		System.out.println(justSideItem);

	}
}
