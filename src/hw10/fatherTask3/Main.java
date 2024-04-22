package hw10.fatherTask3;

public class Main {
    public static void main(String[] args) {
        Father parent = new Father("Валентин", 200);
        parent.buyingProducts(ProductsType.APPLE, 3,ProductsType.POTATOES,5);
    }
}
