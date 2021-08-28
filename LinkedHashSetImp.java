package collection;

import java.util.Iterator;
import java.util.LinkedHashSet;

class Phone {
    private int simSlots;
    private String network;
    private int price;
    private String brand;
    private boolean earPhoneJack;

    public int getSimSlots() {
        return simSlots;
    }

    public void setSimSlots(int simSlots) {
        this.simSlots = simSlots;
    }

    public String getNetwork() {
        return network;
    }

    public void setNetwork(String network) {
        this.network = network;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public boolean isEarPhoneJack() {
        return earPhoneJack;
    }

    public void setEarPhoneJack(boolean earPhoneJack) {
        this.earPhoneJack = earPhoneJack;
    }

}

public class LinkedHashSetImp {
    public static void main(String[] args) {
        Phone phone1 = new Phone();
        phone1.setBrand("Iphone");
        phone1.setEarPhoneJack(false);
        phone1.setNetwork("Jio");
        phone1.setPrice(40000);
        phone1.setSimSlots(1);

        Phone phone2 = new Phone();
        phone2.setBrand("Oneplus");
        phone2.setEarPhoneJack(false);
        phone2.setNetwork("Jio");
        phone2.setPrice(54000);
        phone2.setSimSlots(2);

        LinkedHashSet<Phone> hset = new LinkedHashSet<Phone>();
        hset.add(phone1);
        hset.add(phone2);

        Iterator<Phone> itr = hset.iterator();
        while(itr.hasNext()) {
            Phone ph = itr.next();
            System.out.println(ph.getBrand() + " " + ph.getSimSlots() + " " + ph.getNetwork() + " " + ph.getPrice() 
            + " " + ph.isEarPhoneJack());
        }
    
    }
}
