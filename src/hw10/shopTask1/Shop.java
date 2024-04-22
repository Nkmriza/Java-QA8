package hw10.shopTask1;

public class Shop {
    private String shopName;
    private int priceOfPurchase;
    private String customerName;
    private int customerAge;
    private String sellerName;
    private String productName;

    public Shop(String shopName, int priceOfPurchase, String customerName, int customerAge, String sellerName, String productName) {
        this.shopName = shopName;
        this.priceOfPurchase = priceOfPurchase;
        this.customerName = customerName;
        this.customerAge = customerAge;
        this.sellerName = sellerName;
        this.productName = productName;

    }



    @Override
    public String toString() {
        return "Shop{" +
                "shopName='" + shopName + '\'' +
                ", priceOfPurchase=" + priceOfPurchase +
                ", customerName='" + customerName + '\'' +
                ", customerAge=" + customerAge +
                ", sellerName='" + sellerName + '\'' +
                ", productName='" + productName + '\'' +
                '}';
    }
}
