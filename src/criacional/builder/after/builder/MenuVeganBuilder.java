package src.criacional.builder.after.builder;

public class MenuVeganBuilder extends FastFoodMealBuilder{

	@Override
	public void buildDrink() {
		meal.setDrink("Water");
	}

	@Override
	public void buildMain() {
		meal.setMain("Veggie Burger");
	}

	@Override
	public void buildSide() {
		meal.setSide("Salada");
	}

	@Override
	public void buildDessert() {
		meal.setDessert("Fruta");
	}

	@Override
	public void buildGift() {
		meal.setGift("Chaveiro personalizado");
	}
}
