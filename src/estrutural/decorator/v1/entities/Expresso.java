package src.estrutural.decorator.v1.entities;

import src.estrutural.decorator.v1.interfaces.Drink;

public class Expresso implements Drink {

    @Override
    public void serve() {
        System.out.println("-- Adding 50ml of expresso");
    }

    @Override
    public Double getPrice() {
        return 1.74;
    }

}
