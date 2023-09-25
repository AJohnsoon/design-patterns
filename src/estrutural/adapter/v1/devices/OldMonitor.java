package src.estrutural.adapter.v1.devices;

import src.estrutural.adapter.v1.interfaces.VGA;

public class OldMonitor implements VGA {
    @Override
    public void setImage(String image) {
        System.out.println(">>>>> This is your image: " + image);
    }
}
