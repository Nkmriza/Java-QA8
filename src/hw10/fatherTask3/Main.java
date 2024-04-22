package hw10.fatherTask3;

public class Main {
    public static void main(String[] args) {
        Father parent = new Father("Вітя", 500);
        parent.buyingProducts(ProductsType.BEER, 3,ProductsType.POTATOES,3);
    }
}
