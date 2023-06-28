package src.criacional.builder.after.director;

import src.criacional.builder.after.builder.FastFoodMealBuilder;
import src.criacional.builder.after.model.FastFoodMeal;

public class MealDirector {

	private FastFoodMealBuilder builder;

	public MealDirector(FastFoodMealBuilder builder){
		this.builder = builder;
	}

	public void ConstructCombo() {
		builder.buildDrink();
		builder.buildMain();
		builder.buildSide();
		builder.buildDessert();
		builder.buildGift();
	}

	public FastFoodMeal getCombo() {
		return builder.getMeal();
	}
}
