package hw10.fatherTask3;

public class Main {
    public static void main(String[] args) {
        Father parent = new Father("Вітя", 250);
        parent.buyingProducts(ProductsType.MILK, 3,ProductsType.POTATOES,3);
    }
}
