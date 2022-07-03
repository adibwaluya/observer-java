package observer;

import observer.interfaces.Cart;

import java.util.ArrayList;

public class ShoppingCart implements Cart {
    private int ID;
    private String location;

    private String brand; //Possible brands: Lidl, Edeka, Kaufland, Penny, Bauhaus, Unknown

    private ArrayList<Supermarket> stores = new ArrayList<Supermarket>();


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
        notifyStores();
    }

    @Override
    public void registerStore(Supermarket supermarket) {
        stores.add(supermarket);
    }

    @Override
    public void removeStore(Supermarket supermarket) {
        stores.remove(supermarket);
    }

    @Override
    public void notifyStores() {
        for(Supermarket s : stores)
            s.updateCarts(this);
    }
}

