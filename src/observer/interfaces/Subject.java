package observer.interfaces;

public interface Subject {

    public abstract void registerShoppingCart(Store store);

    public abstract void removeShoppingCart(Store store);

    public abstract void notifyStores();
}
