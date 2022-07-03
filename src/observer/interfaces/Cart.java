package observer.interfaces;

import observer.ShoppingCart;
import observer.Supermarket;

//Subject
public interface Cart {

    public abstract void registerStore(Supermarket supermarket);

    public abstract void removeStore(Supermarket supermarket);

    void notifyStores();
}
