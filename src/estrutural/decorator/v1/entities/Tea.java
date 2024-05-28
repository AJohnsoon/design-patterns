package src.estrutural.decorator.v1.entities;

import src.estrutural.decorator.v1.interfaces.Drink;

public class Tea implements Drink {
    @Override
    public void serve() {
        System.out.println("-- Adding 100ml of tea");
    }

    @Override
    public Double getPrice() {
        return 23.90;
    }

}
