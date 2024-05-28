package src.estrutural.decorator.v1.entities;

import src.estrutural.decorator.v1.interfaces.Drink;
import src.estrutural.decorator.v1.interfaces.DrinkDecorator;

public class DoubleDrink extends DrinkDecorator{

    public DoubleDrink(Drink drink) {
        super(drink);
    }

    @Override
    public void serve() {
        drink.serve();
        drink.serve();
    }

    @Override
    public Double getPrice() {
        return drink.getPrice() * 1.75;
    }

    
}
