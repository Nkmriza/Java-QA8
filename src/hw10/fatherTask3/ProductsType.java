package hw10.fatherTask3;

public enum ProductsType {
    APPLE("яблуко", 24.5),
    POTATOES("картопля", 30),
    MILK("молоко", 45.5),
    BEER("пиво", 40),
    CIGARETTES("тютюн", 95.5);

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
