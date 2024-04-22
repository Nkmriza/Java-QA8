package hw10.fatherTask3;

public class Father {

    public String fatherName;
    public double amountOfMoneyInPocket;

    public Father(String fatherName, double amountOfMoneyInPocket) {
        this.fatherName = fatherName;
        this.amountOfMoneyInPocket = amountOfMoneyInPocket;
    }

    public void buyingProducts(ProductsType type1, int amount1, ProductsType type2, int amount2) {
        double totalCost = type1.getPrice() * amount1 + type2.getPrice() * amount2;
        if (totalCost > amountOfMoneyInPocket) {
            System.out.println("У вас не вистачає грошей");
            return;
        }
        if (type1 == ProductsType.BEER || type2 == ProductsType.BEER ||
                type1 == ProductsType.CIGARETTES || type2 == ProductsType.CIGARETTES) {
            System.out.println("Цього не варто купувати!");
            return;
        }
        if (amount1 % 3 != 0 || amount2 % 3 != 0) {
            System.out.println("Візьми стільки, щоб вистачило тобі, дружині та дитині.");
            return;
        }

        System.out.println("Шановний " + fatherName  +
                ", ви придбали: " + type1.getProductName()+ " у кількості " + amount1 + " шт. " + "та " + type2.getProductName()+
                " у кількості " + amount2 + " шт., вартість вашої покупки " + totalCost +" грн.");
    }
}