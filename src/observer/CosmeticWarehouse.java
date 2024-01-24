package observer;

import model.CosmeticProduct;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

public class CosmeticWarehouse extends Observable {
    private List<CosmeticProduct> products = new ArrayList<>();

    public void addProduct(CosmeticProduct product) {
        products.add(product);
        setChanged();
        notifyObservers(product);
    }

    public void updateStockLevel(CosmeticProduct product, int newStockLevel) {
        product.setStockLevel(newStockLevel);
        setChanged();
        notifyObservers(product);
    }

    public List<CosmeticProduct> getProducts() {
        return products;
    }
}