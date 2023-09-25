package src.estrutural.adapter.v1;

import src.estrutural.adapter.v1.adapters.HDMIToOldMonitorAdapter;
import src.estrutural.adapter.v1.adapters.HDMIToVGAAdapter;
import src.estrutural.adapter.v1.devices.Computer;
import src.estrutural.adapter.v1.devices.OldMonitor;

public class Client {
    public static void main(String[] args) {
        Computer pc1 = new Computer();
        OldMonitor monitorVGA = new OldMonitor();
//        pc1.connectPort(monitorVGA);
        pc1.connectPort(new HDMIToVGAAdapter(monitorVGA));
        pc1.sendImageAndSound("Cat and rainbow", "Nyan cat song");

        System.out.println("\n______________________________________________\n");

        Computer pc2 = new Computer();
        HDMIToOldMonitorAdapter monitorAdapter = new HDMIToOldMonitorAdapter();
        pc2.connectPort(monitorAdapter);
        pc2.sendImageAndSound("Cat 2 and rainbow 2", "Nyan cat song 2");
    }
}
