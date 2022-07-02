package observer;

import observer.interfaces.Store;

import java.util.ArrayList;

public class Supermarket implements Store {

    private String brand;
    private String storeName;
    private ArrayList<ShoppingCart> carts = new ArrayList<ShoppingCart>();


    public Supermarket(String brand, String storeName){
        this.brand = brand;
        this.storeName = storeName;
    }

    @Override
    public void updateCarts(ShoppingCart shoppingCart) {
        if (shoppingCart.getBrand() == this.brand || shoppingCart.getBrand() == "Unknown") {
            System.out.println("Notification for: " + storeName + "\n"
                    + "New Cart Found! Brand: " + shoppingCart.getBrand() + "\n"
                    + "Location: " + shoppingCart.getLocation() + "\n"
                    + "Cart ID: " + shoppingCart.getID() + "\n");
        }
        if(shoppingCart.getBrand() == this.brand){
            carts.add(shoppingCart);
            System.out.println("Saved Carts for " + storeName + " are: " + carts + "\n");
        }
    }
}
