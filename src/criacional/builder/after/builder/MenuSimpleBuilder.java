package src.criacional.builder.after.builder;

public class MenuSimpleBuilder extends FastFoodMealBuilder{

	@Override
	public void buildDrink() {
		meal.setDrink("Fanta Uva");
	}

	@Override
	public void buildMain() {
		meal.setMain("X-Burger");
	}

	@Override
	public void buildSide() {
		meal.setSide("Batata pequena");
	}

	@Override
	public void buildDessert() {
		meal.setDessert("Sorvete");
	}

	@Override
	public void buildGift() {
		meal.setGift("Cartão de 3% de desconto na próxima compra");
	}
}
