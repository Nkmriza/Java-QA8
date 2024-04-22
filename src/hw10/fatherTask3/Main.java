package hw10.fatherTask3;

public class Main {
    public static void main(String[] args) {
        Father parent = new Father("Валентин", 100);
        parent.buyingProducts(ProductsType.CIGARETTES,ProductsType.BEER);
    }
}
