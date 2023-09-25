package src.estrutural.adapter.v1.devices;

import src.estrutural.adapter.v1.interfaces.HDMI;

public class TV implements HDMI {

    @Override
    public void setImage(String image) {
        System.out.println(">>>>> This is your image: " + image);
    }

    @Override
    public void setSound(String sound) {
        System.out.println(">>>>> This is your sound: " + sound);
    }
}
