package src.criacional.builder.fluent.builder;

import src.criacional.builder.fluent.model.FastFoodMeal;

public class FastFoodMealBuilder {

	//Required
	private String main;

	//Optionals
	private String drink;
	private String side;
	private String dessert;
	private String gift;

	public FastFoodMealBuilder(String main){
		this.main = main;
	}

	public FastFoodMealBuilder forDrink(String drink){
		this.drink = drink;
		return this;
	}

	public FastFoodMealBuilder andSide(String side){
		this.side = side;
		return this;
	}

	public FastFoodMealBuilder andDessert(String dessert){
		this.dessert = dessert;
		return this;
	}

	public FastFoodMealBuilder choiceToy(String gift){
		this.gift = gift;
		return this;
	}

	public FastFoodMeal thatIsAll(){
		return new FastFoodMeal(main, drink, side, dessert, gift);
	}

}
