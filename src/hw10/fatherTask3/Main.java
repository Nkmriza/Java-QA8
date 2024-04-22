package hw10.fatherTask3;

public class Main {
    public static void main(String[] args) {
        Father parent = new Father("Валентин", 500);
        parent.buyingProducts(ProductsType.APPLE, 2,ProductsType.POTATOES,2);
    }
}
