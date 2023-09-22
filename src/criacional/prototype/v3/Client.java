package src.criacional.prototype.v3;

import src.criacional.prototype.v3.model.FastFood;

public class Client {
    public static void main(String[] args) {
        FastFood fastFood = new FastFood("Tapioca", "Coca-Cola", "Gift-Card");
        FastFood cloneFastFood = fastFood.cloneBuilder().toEat("X-Burger").thatIsAll();
        FastFood anotherFastFoodClone = cloneFastFood.cloneBuilder().toDrink("Antártica").selectedGift("Toy").thatIsAll();

        System.out.println(fastFood);
        System.out.println(cloneFastFood);
        System.out.println(anotherFastFoodClone);
    }
}
