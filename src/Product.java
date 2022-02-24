public class Product {
    private String description;
    private double basePrice;

    public Product(String description, double basePrice) {
        this.description = description;
        this.basePrice = basePrice;
    }

    public String getDescription() {
        return description;
    }

    public double getBasePrice() {
        return basePrice;
    }
}
