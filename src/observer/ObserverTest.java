package observer;

public class ObserverTest {
    public static void main(String args[]) {

        Edeka edekaStore = new Edeka();
        Lidl lidlStore = new Lidl();

        ShoppingCart cartOne = new ShoppingCart(1, "Tierpark", "Lidl");
        ShoppingCart cartTwo = new ShoppingCart(2, "Aristo", "Edeka");

        cartOne.registerStore(edekaStore);
        cartTwo.registerStore(lidlStore);
    }
}
