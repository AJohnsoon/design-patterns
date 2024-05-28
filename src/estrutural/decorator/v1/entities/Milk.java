package src.estrutural.decorator.v1.entities;

import src.estrutural.decorator.v1.interfaces.Drink;
import src.estrutural.decorator.v1.interfaces.DrinkDecorator;

public class Milk extends DrinkDecorator {

    public Milk(Drink drink) {
        super(drink);
    }

    @Override
    public void serve() {
        drink.serve();
        System.out.println("-- adding 30ml of Milk");
    }

    @Override
    public Double getPrice() {
        return drink.getPrice() + 0.50;
    }

}
