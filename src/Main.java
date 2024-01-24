import factory.CosmeticProductFactory;
import factory.DefaultCosmeticProductFactory;
import model.CosmeticProduct;
import observer.CosmeticWarehouse;
import observer.StockObserver;

public class Main {
    public static void main(String[] args) {
        CosmeticWarehouse warehouse = new CosmeticWarehouse();
        StockObserver observer1 = new StockObserver("Observer 1");
        StockObserver observer2 = new StockObserver("Observer 2");

        warehouse.addObserver(observer1);
        warehouse.addObserver(observer2);

        CosmeticProductFactory productFactory = new DefaultCosmeticProductFactory();

        CosmeticProduct lipstick = productFactory.createCosmeticProduct("Lipstick", 50);
        CosmeticProduct mascara = productFactory.createCosmeticProduct("Mascara", 30);

        warehouse.addProduct(lipstick);
        warehouse.addProduct(mascara);

        printProductInfo(warehouse);

        warehouse.updateStockLevel(lipstick, 40);
        warehouse.updateStockLevel(mascara, 20);

        printProductInfo(warehouse);
    }

    private static void printProductInfo(CosmeticWarehouse warehouse) {
        System.out.println("Current Products in Warehouse:");
        for (CosmeticProduct product : warehouse.getProducts()) {
            System.out.println(product.getName() + ": Stock Level - " + product.getStockLevel());
        }
        System.out.println();
    }
}