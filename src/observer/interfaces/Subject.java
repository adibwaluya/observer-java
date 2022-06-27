package observer.interfaces;

import observer.ShoppingCart;

public interface Subject {

    public abstract void registerStore(Store store);

    public abstract void removeStore(Store store);

    public abstract void notifyStores();
}
