package src.estrutural.adapter.v1.adapters;

import src.estrutural.adapter.v1.devices.OldMonitor;
import src.estrutural.adapter.v1.interfaces.HDMI;

public class HDMIToOldMonitorAdapter extends OldMonitor implements HDMI {

    public HDMIToOldMonitorAdapter() {
        super();
        System.out.println("Wrapping the VGA's OldMonitor's Interfaces with a HDMI adapter.");
    }

    //método recebido por herança, não seria necessário implementar
    @Override
    public void setImage(String image) {
        System.out.println("Converting the image from HDMI to VGA");
        super.setImage(image);
    }

    @Override
    public void setSound(String sound) {
        System.out.println("Sorry, We don't work with sound!");
    }
}
