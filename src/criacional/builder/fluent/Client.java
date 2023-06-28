package src.criacional.builder.fluent;

import src.criacional.builder.fluent.builder.FastFoodMealBuilder;
import src.criacional.builder.fluent.model.FastFoodMeal;

public class Client {
	public static void main(String[] args) {
		FastFoodMeal combo1 = new FastFoodMealBuilder("x-Ogro")
				.forDrink("Coca-cola")
				.andSide("Batata frita")
				.andDessert("Açaí")
				.choiceToy("Chaveiro")
				.thatIsAll();
		System.out.println(combo1);

		System.out.println("_______________");

		FastFoodMeal onlyMain = new FastFoodMealBuilder("simple-burger").thatIsAll();
		System.out.println(onlyMain);

		System.out.println("_______________");

		FastFoodMeal simpleCombo = new FastFoodMealBuilder("x-burger")
				.forDrink("Coca-cola")
				.andSide("Anel de cebola")
				.thatIsAll();
		System.out.println(simpleCombo);

	}
}
