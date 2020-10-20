package astanait.edu.kz;

import java.util.ArrayList;

public class Shop {
    /*private ArrayList<Smartphone> smartphones;
    private ArrayList<Tablet> tablets;
    private ArrayList<Laptop> laptops;*/
    private ArrayList<Device> devices;
    private int id_gen = 1;

    public Shop() {
        devices = new ArrayList<Device>();
        devices.add(new Smartphone(id_gen,"Samsung Galaxy A60",100000)); id_gen++;
        devices.add(new Smartphone(id_gen,"Iphone 11 ProMax",400000)); id_gen++;
        devices.add(new Smartphone(id_gen,"Iphone 11 ",350000)); id_gen++;
        devices.add(new Smartphone(id_gen,"Iphone 11 ",350000)); id_gen++;
        devices.add(new Smartphone(id_gen,"Iphone 11 ",350000)); id_gen++;
        devices.add(new Smartphone(id_gen,"Iphone 11 ",350000)); id_gen++;
        devices.add(new Smartphone(id_gen,"Iphone 11 ",350000)); id_gen++;
        devices.add(new Smartphone(id_gen,"Iphone 11 ",350000)); id_gen++;
        //devices = new ArrayList<Tablet>();
        devices.add(new Tablet(id_gen,"iPad Pro",150000)); id_gen++;
        devices.add(new Tablet(id_gen,"Samsung Tab4",100000)); id_gen++;
        //devices = new ArrayList<Laptop>();
        devices.add(new Laptop(id_gen,"Acer Nitro 5",350000)); id_gen++;
        devices.add(new Laptop(id_gen,"Asus ",300000)); id_gen++;
    }

    /*public ArrayList<Smartphone> getSmartphones(){
        return smartphones;
    }

    public ArrayList<Tablet> getTablets() {
        return tablets;
    }

    public ArrayList<Laptop> getLaptops() {
        return laptops;
    }*/

    public ArrayList<Device> getDevices() {
        return devices;
    }
}
