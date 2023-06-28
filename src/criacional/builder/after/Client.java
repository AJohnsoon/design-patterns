package src.criacional.builder.after;

import src.criacional.builder.after.builder.*;
import src.criacional.builder.after.director.MealDirector;

public class Client {
	public static void main(String[] args) {
		order("x-burger", new MenuSimpleBuilder());
		order("Vegetariano", new MenuVeganBuilder());
		order("Ataque cardíaco", new FatMealBuilder());
		order("Just Fries", new JustFriesBuilder());

		MealDirector dir = new MealDirector(new JustFriesBuilder());
		dir.ConstructCombo();
		System.out.println("DIR: " +dir.getCombo());

	}

	public static void order(String name, FastFoodMealBuilder builder) {
		System.out.println("Ordering a "+ name);
		MealDirector director = new MealDirector(builder);
		director.ConstructCombo();
		System.out.println(director.getCombo());
		System.out.println("______________________");
	}
}
