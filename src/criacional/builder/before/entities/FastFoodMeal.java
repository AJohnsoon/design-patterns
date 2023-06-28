package src.criacional.builder.before.entities;

public class FastFoodMeal {
	private String drink;
	private String main;
	private String side;
	private String dessert;
	private String gift;

	public FastFoodMeal() {}

	public FastFoodMeal(String drink) {
		this.drink = drink;
	}

	public FastFoodMeal(String drink, String main) {
		this.drink = drink;
		this.main = main;
	}

	public FastFoodMeal(String drink, String main, String side) {
		this.drink = drink;
		this.main = main;
		this.side = side;
	}

	public FastFoodMeal(String drink, String main, String side, String dessert) {
		this.drink = drink;
		this.main = main;
		this.side = side;
		this.dessert = dessert;
	}

	public FastFoodMeal(String drink, String main, String side, String dessert, String gift) {
		this.drink = drink;
		this.main = main;
		this.side = side;
		this.dessert = dessert;
		this.gift = gift;
	}

	public String getDrink() {
		return drink;
	}

	public void setDrink(String drink) {
		this.drink = drink;
	}

	public String getMain() {
		return main;
	}

	public void setMain(String main) {
		this.main = main;
	}

	public String getSide() {
		return side;
	}

	public void setSide(String side) {
		this.side = side;
	}

	public String getDessert() {
		return dessert;
	}

	public void setDessert(String dessert) {
		this.dessert = dessert;
	}

	public String getGift() {
		return gift;
	}

	public void setGift(String gift) {
		this.gift = gift;
	}

	@Override
	public String toString() {
		return "FastFoodMeal\n{" +
				"\n 	drink:'" + drink + '\'' +
				"\n 	main:'" + main + '\'' +
				"\n 	side:'" + side + '\'' +
				"\n 	dessert:'" + dessert + '\'' +
				"\n 	gift:'" + gift + '\'' +
				"\n}";
	}
}
