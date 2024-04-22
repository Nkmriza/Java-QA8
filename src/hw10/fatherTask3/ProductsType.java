package hw10.fatherTask3;

public enum ProductsType {
    APPLE("apple", 24.5),
    POTATOES("potatoes", 30),
    MILK("milk", 45.5),
    BEER("beer", 40),
    CIGARETTES("cigarettes", 95.5);

    private String productName;
    private double price;

    ProductsType(String productName, double price) {
        this.productName = productName;
        this.price = price;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }
}
