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

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public int getPriceOfPurchase() {
        return priceOfPurchase;
    }

    public void setPriceOfPurchase(int priceOfPurchase) {
        this.priceOfPurchase = priceOfPurchase;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getCustomerAge() {
        return customerAge;
    }

    public void setCustomerAge(int customerAge) {
        this.customerAge = customerAge;
    }

    public String getSellerName() {
        return sellerName;
    }

    public void setSellerName(String sellerName) {
        this.sellerName = sellerName;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void returnCost(String shopName, int priceOfPurchase,
                                        String customerName, int customerAge,
                                        String sellerName, String productName) {
        /*String alcohol = "алкогольний напій";
        String nonAlcohol = "безалкогольний напій";
        if (productName.equalsIgnoreCase(alcohol)) {
            System.out.println("Товар алкогольний");
        }
        if (productName.equalsIgnoreCase(nonAlcohol)) {
            System.out.println("Товар безалкогольний");
        }*/

      boolean consistsAlcohol = false;
      boolean honestSeller = false;
        if (consistsAlcohol) {
            if (sellerName.equals("чесний")) {
                System.out.println( "Продавець не продасть покупцю" + customerName + " алкогольний товар." );
            } else if (customerAge < 18 && consistsAlcohol == true){
                System.out.println("Продавець порушує правила продажу.");
            }
            else {
                System.out.println("Товар не містить алкоголь. Вдала покупка!");
            }
        }

       /* if (sellerName.equalsIgnoreCase("чесний")) {
            if (productName.equalsIgnoreCase(alcohol)) {
                System.out.println("Продавець чесний і відмовився продавати алкоголь.");
            } else if (productName == nonAlcohol) {
                System.out.println(nonAlcohol);
            }
        } else {
            if (productName.equalsIgnoreCase(alcohol)) {
                System.out.println("Продавець нечесний і продасть вам алкогольний товар.");
            } else if (productName.equalsIgnoreCase(nonAlcohol)) {
                System.out.println("Товар безалкогольний.");
            }
        }*/
        double discount = 0.1;
    }

}
