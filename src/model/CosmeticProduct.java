package model;

public class CosmeticProduct {
    private String name;
    private int stockLevel;

    public CosmeticProduct(String name, int stockLevel) {
        this.name = name;
        this.stockLevel = stockLevel;
    }

    public String getName() {
        return name;
    }

    public int getStockLevel() {
        return stockLevel;
    }

    public void setStockLevel(int stockLevel) {
        this.stockLevel = stockLevel;
    }
}