package src.estrutural.decorator.v1;

import src.estrutural.decorator.v1.entities.DoubleDrink;
import src.estrutural.decorator.v1.entities.Expresso;
import src.estrutural.decorator.v1.entities.Milk;
import src.estrutural.decorator.v1.entities.Tea;
import src.estrutural.decorator.v1.interfaces.Drink;

public class Client {

    public static void order(String name, Drink drink){
        System.out.println("Ordering a " + name);
        drink.serve();
        System.out.println(drink.getPrice());
        System.out.println("__________________");
    }

    public static void main(String[] args) {
        order("Expresso", new Expresso());
        order("Tea", new Tea());
        order("Lungo", new DoubleDrink(new Expresso()));
        order("Cafe au Lait", new Milk(new Expresso()));
        order("English Tea", new Milk(new Tea()));
    }

}
