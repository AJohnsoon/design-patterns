package src.estrutural.composite.v1.interfaces;

import java.awt.*;

public abstract class Container {

    protected Component component;

    public Container(Component component) {
        this.component = component;
    }
    public abstract void add(Component component);

}
