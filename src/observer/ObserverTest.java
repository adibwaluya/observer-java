package observer;

import java.util.ArrayList;

public class ObserverTest {
    public static void main(String args[]) {

        ArrayList<Supermarket> stores = new ArrayList<>();
        ArrayList<ShoppingCart> carts = new ArrayList<>();

        Supermarket edeka1 = new Supermarket("Edeka", "Edeka Fromm");
        Supermarket edeka2 = new Supermarket("Edeka", "Edeka Karl");
        Supermarket lidl = new Supermarket("Lidl", "Lidl");
        Supermarket aldi = new Supermarket("Aldi", "Aldi");
        Supermarket penny = new Supermarket("Penny", "Penny");
        Supermarket kaufland = new Supermarket("Kaufland", "Kaufland");
        Supermarket bauhaus = new Supermarket("Bauhaus", "Bauhaus");

        stores.add(edeka1);
        stores.add(edeka2);
        stores.add(lidl);
        stores.add(aldi);
        stores.add(penny);
        stores.add(kaufland);
        stores.add(bauhaus);

        ShoppingCart cart1 = new ShoppingCart(1, "Tierpark", "Edeka");
        ShoppingCart cart2 = new ShoppingCart(2, "Aristo", "Edeka");
        ShoppingCart cart3 = new ShoppingCart(3, "Schöneweide", "Edeka");
        ShoppingCart cart4 = new ShoppingCart(4, "Karlshorst", "Lidl");
        ShoppingCart cart5 = new ShoppingCart(5, "Karlshorst", "Aldi");
        ShoppingCart cart6 = new ShoppingCart(6, "Aristo", "Bauhaus");
        ShoppingCart cart7 = new ShoppingCart(7, "Tierpark", "Penny");
        ShoppingCart cart8 = new ShoppingCart(8, "Schöneweide", "Lidl");
        ShoppingCart cart9 = new ShoppingCart(9, "Karlshorst", "Penny");
        ShoppingCart cart10 = new ShoppingCart(10, "Aristo", "Unknown");
        ShoppingCart cart11 = new ShoppingCart(11, "Lichtenberg", "Aldi");
        ShoppingCart cart12 = new ShoppingCart(12, "Frankfurter Allee", "Bauhaus");
        ShoppingCart cart13 = new ShoppingCart(13, "Friedrichsfelde Ost", "Kaufland");
        ShoppingCart cart14 = new ShoppingCart(14, "Friedrichsfelde Ost", "Edeka");
        ShoppingCart cart15 = new ShoppingCart(15, "Frankfurter Allee", "Unknown");

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
        carts.add(cart11);
        carts.add(cart12);
        carts.add(cart13);
        carts.add(cart14);
        carts.add(cart15);

        for(ShoppingCart c : carts) {
            for(Supermarket s : stores) {
                c.registerStore(s);
                s.updateCarts(c);
            }
        }
    }
}
