package src.criacional.builder.after.builder;

public class FatMealBuilder extends FastFoodMealBuilder{

	@Override
	public void buildDrink() {
		meal.setDrink("MilkShake");
	}

	@Override
	public void buildMain() {
		meal.setMain("Triple Cheddar Bacon");
	}

	@Override
	public void buildSide() {
		meal.setSide("Anéis de cebola");
	}

	@Override
	public void buildDessert() {
		meal.setDessert("Açaí grande (900ml)");
	}

	@Override
	public void buildGift() {
		meal.setGift("Boneco 'Buzz Lightyear'");
	}
}
