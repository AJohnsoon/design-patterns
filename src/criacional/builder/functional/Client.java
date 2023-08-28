package src.criacional.builder.functional;

import src.criacional.builder.functional.model.FastFoodMeal;

public class Client {
    public static void main(String[] args) {
        System.out.println("______________________");
        System.out.println("Apenas Principal");
        FastFoodMeal onlyMain = new FastFoodMeal.Builder("X-Bacon").thatIsAll();
        System.out.println(onlyMain);

        System.out.println("______________________");
        System.out.println("Combo Anime");
        FastFoodMeal comboAnime = new FastFoodMeal.Builder("X-Tudo")
                                        .forDrink("Coca-Cola")
                                        .andSide("Aneis de Cebola")
                                        .andDessert("Açaí")
                                        .choiceToy("Action Figure")
                                        .thatIsAll();

        System.out.println(comboAnime);

        System.out.println("______________________");
        System.out.println("Combo Simples");
        FastFoodMeal simpleCombo = new FastFoodMeal.Builder("Cheeseburger")
                                            .forDrink("Milk Shake")
                                            .andSide("Batata")
                                            .thatIsAll();
        System.out.println(simpleCombo);
    }
}
