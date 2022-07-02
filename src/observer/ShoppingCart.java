package observer;

import observer.interfaces.Store;
import observer.interfaces.Subject;

import java.util.ArrayList;

public class ShoppingCart implements Subject {
    private int ID;
    private String location;
    private String brand;

    private ArrayList<Store> stores = new ArrayList<Store>();


    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public ShoppingCart(int ID, String location, String brand) {
        this.ID = ID;
        this.location = location;
        this.brand = brand;
    }

    @Override
    public void registerShoppingCart(Store store) {
        stores.add(store);
    }

    @Override
    public void removeShoppingCart(Store store) {
        stores.remove(store);
    }

    @Override
    public void notifyStores() {
        for (Store store: stores) {
            store.updateCarts(ID, location, brand);
        }
    }
}

