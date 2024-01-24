package factory;

import model.CosmeticProduct;

public interface CosmeticProductFactory {
    CosmeticProduct createCosmeticProduct(String name, int stockLevel);
}