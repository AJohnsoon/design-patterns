package src.criacional.builder.fluent.model;

public class FastFoodMeal {
	private String main;
	private String drink;
	private String side;
	private String dessert;
	private String gift;

	public FastFoodMeal(String main, String drink, String side, String dessert, String gift) {
		this.main = main;
		this.drink = drink;
		this.side = side;
		this.dessert = dessert;
		this.gift = gift;
	}

	public String getMain() {
		return main;
	}

	public void setMain(String main) {
		this.main = main;
	}

	public String getDrink() {
		return drink;
	}

	public void setDrink(String drink) {
		this.drink = drink;
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
