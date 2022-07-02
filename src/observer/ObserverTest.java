package observer;

import java.util.ArrayList;

public class ObserverTest {
    public static void main(String args[]) {

        ArrayList<Supermarket> stores = new ArrayList<>();
        ArrayList<ShoppingCart> carts = new ArrayList<>();

        Supermarket edeka1 = new Supermarket("Edeka", "Edeka Fromm");
        Supermarket edeka2 = new Supermarket("Edeka", "Edeka Karl");
        Supermarket lidl = new Supermarket("Lidl", "Lidl");
        Supermarket penny = new Supermarket("Penny", "Penny");

        stores.add(edeka1);
        stores.add(edeka2);
        stores.add(lidl);
        stores.add(penny);

        ShoppingCart cart1 = new ShoppingCart(1, "Tierpark", "Edeka");
        ShoppingCart cart2 = new ShoppingCart(2, "Aristo", "Edeka");
        ShoppingCart cart3 = new ShoppingCart(3, "Schöneweide", "Edeka");
        ShoppingCart cart4 = new ShoppingCart(4, "Karlshorst", "Lidl");
        ShoppingCart cart5 = new ShoppingCart(5, "Karlshorst", "Unknown");
        ShoppingCart cart6 = new ShoppingCart(6, "Aristo", "Unknown");
        ShoppingCart cart7 = new ShoppingCart(7, "Tierpark", "Penny");
        ShoppingCart cart8 = new ShoppingCart(8, "Schöneweide", "Lidl");
        ShoppingCart cart9 = new ShoppingCart(9, "Karlshorst", "Penny");
        ShoppingCart cart10 = new ShoppingCart(10, "Aristo", "Unknown");

        carts.add(cart1);
        carts.add(cart2);
        carts.add(cart3);
        carts.add(cart4);
        carts.add(cart5);
        carts.add(cart6);
        carts.add(cart7);
        carts.add(cart8);
        carts.add(cart9);
        carts.add(cart10);

        for(ShoppingCart c : carts) {
            for(Supermarket s : stores) {
                c.registerStore(s);
                s.updateCarts(c);
            }
        }
    }
}
