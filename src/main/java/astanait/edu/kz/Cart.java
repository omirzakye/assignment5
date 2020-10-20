package astanait.edu.kz;

import java.util.ArrayList;

public class Cart {
    private ArrayList<Device> devices;
    private int amount;
    private static int num_gen = 0;

    public Cart() {
        devices = new ArrayList<Device>();
        amount = num_gen;
    }

    public void addDevice(Device device){
        devices.add(device);
        num_gen++;
        amount = num_gen;
    }

    public void deleteDevice(Device device){
        devices.remove(device);
        num_gen--;
        amount = num_gen;
    }

    public void clear(){
        devices.removeAll(devices);
    }

    public ArrayList<Device> showDevices(){
            return devices;
    }
}
