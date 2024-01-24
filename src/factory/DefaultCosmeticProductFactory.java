package factory;

import model.CosmeticProduct;

public class DefaultCosmeticProductFactory implements CosmeticProductFactory {
    @Override
    public CosmeticProduct createCosmeticProduct(String name, int stockLevel) {
        return new CosmeticProduct(name, stockLevel);
    }
}