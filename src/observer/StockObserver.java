package observer;

import model.CosmeticProduct;

import java.util.Observable;
import java.util.Observer;

public class StockObserver implements Observer {
    private String name;

    public StockObserver(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        if (arg instanceof CosmeticProduct) {
            CosmeticProduct product = (CosmeticProduct) arg;
            System.out.println("Observer " + name + ": Stock level of " + product.getName() +
                    " is now " + product.getStockLevel());
        }
    }
}