package observer;

import observer.interfaces.Store;

import java.util.ArrayList;

public class Penny implements Store {
    private ArrayList<ShoppingCart> carts = new ArrayList<ShoppingCart>();

    private ShoppingCart shoppingCart;
    @Override
    public void updateCarts(int ID, String brand, String location) {
        if (brand == "Penny") {
            shoppingCart = new ShoppingCart(ID, brand, location);
            carts.add(shoppingCart);
            System.out.println("ID: " +  ID + ", brand: " + brand + ", location: " + location);
        }
    }
}