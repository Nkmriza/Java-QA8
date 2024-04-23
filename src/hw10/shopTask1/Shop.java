package hw10.shopTask1;

public class Shop implements BuyingProducts {
    private String shopName;
    private int priceOfPurchase;
    private String customerName;
    private int customerAge;
    private String sellerName;
    private String productName;

    private boolean honestSeller;
    private boolean consistsAlcohol;
    private boolean discountCard;

    public Shop(String shopName, int priceOfPurchase,
                String customerName, int customerAge, boolean discountCard,
                String sellerName, boolean honestSeller, String productName, boolean consistsAlcohol) {
        this.shopName = shopName;
        this.priceOfPurchase = priceOfPurchase;
        this.customerName = customerName;
        this.customerAge = customerAge;
        this.sellerName = sellerName;
        this.productName = productName;
        this.honestSeller = honestSeller;
        this.discountCard = discountCard;
        this.consistsAlcohol = consistsAlcohol;

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


    @Override
    public void returnCost(String shopName, int priceOfPurchase,
                           String customerName, int customerAge, boolean discountCard,
                           String sellerName, boolean honestSeller, String productName, boolean consistsAlcohol) {
        double discount = 0.1;
        if (consistsAlcohol) {
            if (!honestSeller) {
                System.out.println("Нечесний продавець " + sellerName + " продав покупцю " + customerName + " алкогольний товар.");
                if (customerAge < 18 && !honestSeller) {
                    System.out.println("Шановний(шановна)  " + customerName + ", продавець нашого магазину " + shopName + " - " + sellerName + " продав вам алкогольний товар. Оскільки вам " + customerAge + " років, просимо повернути " + productName);
                    return;
                }
                if (discountCard) {
                    System.out.println("Шановний(шановна)  " + customerName + ", продавець нашого магазину " + shopName + " - " + sellerName + " продав вам алкогольний товар " + productName + ". Знижка на ваш товар: 10%, сума до сплати " + priceOfPurchase * (1 - discount));
                } else {
                    System.out.println("Шановний(шановна)  " + customerName + ", продавець нашого магазину " + shopName + " - " + sellerName + " продав вам алкогольний товар " + productName + ". У вас немає знижки, сума до слпати:" + priceOfPurchase);
                }
                return;
            }

            if (honestSeller) {
                System.out.println("Продавець відмовився продати товар");
            }
        } else {
            System.out.println("Шановний(шановна) " + customerName + ", продавець нашого магазину " + shopName + " - " + sellerName + " продала вам товар " + productName + ". Товар не містить алкоголь. ");
            if (discountCard) {
                System.out.println("Знижка на ваш товар: 10%, сума до сплати " + priceOfPurchase * (1 - discount) + ". Вдала покупка!");
            } else {
                System.out.println("У вас немає знижки, сума до слпати:" + priceOfPurchase);
            }
        }


    }

    /*Шановний {Ім'я покупця}, продавець {Ім'я продавця} нашого магазину
     "{Назва магазину}", продасть вам цей товар {Назва товару}, у них є алкогольна
     продукція, а ваш вік {Вік покупця}. Вартість вашої покупки дорівнює
     {Вартість покупки} Ось вам знижка*/

}
