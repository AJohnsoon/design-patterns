package src.estrutural.adapter.v1.devices;

import src.estrutural.adapter.v1.interfaces.HDMI;

public class Computer {

    private HDMI port;
    public void connectPort(HDMI screen) {
        System.out.println("Connecting on HDMI Port");
        this.port = screen;
    }

    public void sendImageAndSound(String image, String sound) {
        if (port == null) {
            System.out.println("Connect a HDMI cable first...");
        }
        else {
            port.setImage(image);
            port.setSound(sound);
        }
    }
}
